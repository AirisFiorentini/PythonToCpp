grammar my_grammar;

/*
 * Parser Rules
 */
file_input: (NEWLINE | stmt)* EOF ;
stmt: simple_stmt | compound_stmt ;
simple_stmt: small_stmt (SEMI_COLON small_stmt)* (SEMI_COLON)? NEWLINE ;
small_stmt: expr_stmt ;
expr_stmt : expr assign_expr* ;
assign_expr: ASSIGN expr ;
testlist_star_expr: (test|star_expr) (COMMA (test|star_expr))* (COMMA)? ;
augassign: ADD_ASSIGN | SUB_ASSIGN | MULT_ASSIGN | AT_ASSIGN | DIV_ASSIGN 
          | MOD_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | LEFT_SHIFT_ASSIGN 
          | RIGHT_SHIFT_ASSIGN | POWER_ASSIGN | IDIV_ASSIGN ;
test: or_test (IF or_test ELSE test)? | lambdef ;
or_test: and_test (OR and_test)* ;
and_test: not_test (AND not_test)* ;
not_test: NOT not_test | comparison ;
comparison: expr (comp_op expr)* ;
comp_op: LESS_THAN | GREATER_THAN | EQUALS | GT_EQ | LT_EQ | NOT_EQ_1 | NOT_EQ_2 
        | IN | NOT IN | IS | IS NOT ;
star_expr: STAR expr ;
expr: xor_expr (OR xor_expr)* ;
xor_expr: and_expr (XOR and_expr)* ;
and_expr: shift_expr (AND shift_expr)* ;
shift_expr: arith_expr ((LEFT_SHIFT | RIGHT_SHIFT) arith_expr)* ;
arith_expr: term ((PLUS | MINUS) term)* ;
term: factor ((STAR | AT | DIV | MOD | IDIV) factor)* ;
factor: (PLUS | MINUS | TILDE) factor | power ;
power: atom_expr (POWER factor)? ;
atom_expr: ATOM (AWAIT)? (trailer)* ;
trailer: '(' (arglist)? ')' | '[' subscriptlist ']' | '.' NAME ;
arglist: argument (COMMA argument)* (COMMA)? ;
argument: (test (comp_for)? | test EQUALS test);
compound_stmt: if_stmt | while_stmt | for_stmt | funcdef ;
while_stmt: WHILE test COLON suite ;
for_stmt: FOR NAME IN range_func COLON suite ;
range_func: RANGE '(' test (COMMA test (COMMA test)?)? ')' ;
funcdef: DEF NAME parameters COLON suite ;
parameters: '(' (typedargslist)? ')' ;
typedargslist: tfpdef (COLON test)? (ASSIGN test)? (COMMA tfpdef (COLON test)? (ASSIGN test)?)* (COMMA variadicargs)? 
             | variadicargs;
variadicargs: STAR NAME (COLON test)? (COMMA POWER NAME (COLON test)?)?
            | POWER NAME (COLON test)?;
tfpdef: NAME;

// yield_expr может быть частью выражения, используемого для генерации значения
yield_expr: YIELD (testlist)? ;

// testlist используется для представления списка тестов (или выражений)
testlist: test (COMMA test)* ;

// lambdef представляет анонимную функцию (lambda)
lambdef: LAMBDA (typedargslist)? COLON test ;

// subscriptlist используется в конструкциях индексации и среза
subscriptlist: subscript (COMMA subscript)* ;

// comp_for представляет генераторы списков и похожие конструкции
comp_for: FOR exprlist IN or_test ;

// if_stmt представляет конструкции if-elif-else
if_stmt: IF test COLON suite (ELIF test COLON suite)*(ELSE COLON suite)? ;

// suite представляет блок кода (например, тело функции или цикла)
suite: simple_stmt | NEWLINE INDENT stmt+ DEDENT ;

// subscript представляет индекс или срез в выражении индексации
subscript: test | test? COLON test? | test COLON test? COLON test? ;

// exprlist используется в различных контекстах, где требуется список выражений
exprlist: (expr COMMA)+ | expr ;

// Правило для токена print
print_statement : PRINT expression ;

// Правило для выражения
expression : NUMBER | STRING | print_statement ;

/*
 * Lexer Rules
 */
NEWLINE: '\r'? '\n' ;
NAME: LETTER (LETTER | DIGIT)* ;
NUMBER: DIGIT+ ;
STRING: '"' .*? '"' | '\'' .*? '\'' ;
COMMENT: '#' .*? '\n' ;
INDENT: WHITESPACE+ ;  //INDENT: '    ' ;  // Представляет уровень отступа. Заменить на реальную логику отступов.
DEDENT: '\n' WHITESPACE* ;  // DEDENT: '' ;  // Представляет уменьшение уровня отступа. Заменить на реальную логику отступов.
ASSIGN: '=' ;
PLUS: '+' ;
MINUS: '-' ;
STAR: '*' ;
POWER: '**' ;
DIV: '/' ;
MOD: '%' ;
IDIV: '//' ;
AT: '@' ;
LESS_THAN: '<' ;
GREATER_THAN: '>' ;
EQUALS: '==' ;
GT_EQ: '>=' ;
LT_EQ: '<=' ;
NOT_EQ_1: '<>' ;
NOT_EQ_2: '!=' ;
OR: '|' ;
XOR: '^' ;
AND: '&' ;
NOT: 'not' ;
IS: 'is' ;
IN: 'in' ;
ELIF: 'elif' ;
ELSE: 'else' ;
IF: 'if' ;
COMMA: ',' ;
COLON: ':' ;
SEMI_COLON: ';' ;
LEFT_SHIFT: '<<' ;
RIGHT_SHIFT: '>>' ;
ADD_ASSIGN: '+=' ;
SUB_ASSIGN: '-=' ;
MULT_ASSIGN: '*=' ;
AT_ASSIGN: '@=' ;
DIV_ASSIGN: '/=' ;
MOD_ASSIGN: '%=' ;
AND_ASSIGN: '&=' ;
OR_ASSIGN: '|=' ;
XOR_ASSIGN: '^=' ;
LEFT_SHIFT_ASSIGN: '<<=' ;
RIGHT_SHIFT_ASSIGN: '>>=' ;
POWER_ASSIGN: '**=' ;
IDIV_ASSIGN: '//=' ;
AWAIT: 'await' ;
ATOM: NAME | NUMBER | STRING | '...' | 'None' | 'True' | 'False' ;
DIGIT: [0-9] ;
LETTER: [a-zA-Z_] ;
WHITESPACE: [ \t]+ -> skip ;
DEF: 'def' ;
WHILE: 'while' ;
FOR: 'for' ;
RANGE: 'range' ;
YIELD: 'yield' ;
LAMBDA: 'lambda' ;
TILDE: '~' ;
PRINT: 'print' ;