grammar Python;

/*
 * Lexer Rules
 */
// Определение токенов
INDENT : '    ' -> pushMode(IndentMode) ;
DEDENT : -> popMode ;



WS: [ \t\r\n]+ -> skip ;
COMMENT: '#' ~[\r\n]* -> skip ;
LPAREN: '(' ;
RPAREN: ')' ;
LBRACK: '[' ;
RBRACK: ']' ;
LBRACE: '{' ;
RBRACE: '}' ;
COMMA: ',' ;
COLON: ':' ;
SEMI_COLON: ';' ;
DOT: '.' ;
ADD: '+' ;
SUB: '-' ;
MULT: '*' ;
AT: '@' ;
DIV: '/' ;
MOD: '%' ;
POWER: '**' ;
IDIV: '//' ;
LESS_THAN: '<' ;
GREATER_THAN: '>' ;
EQUALS: '==' ;
GT_EQ: '>=' ;
LT_EQ: '<=' ;
NOT_EQ_1: '<>' ;
NOT_EQ_2: '!=' ;
AND: 'and' ;
OR: 'or' ;
NOT: 'not' ;
IF: 'if' ;
ELSE: 'else' ;
ELIF: 'elif' ;
WHILE: 'while' ;
FOR: 'for' ;
IN: 'in' ;
RANGE: 'range' ;
DEF: 'def' ;
RETURN: 'return' ;
PRINT: 'print' ;
IMPORT: 'import' ;
FROM: 'from' ;
AS: 'as' ;
WITH: 'with' ;
LAMBDA: 'lambda' ;
YIELD: 'yield' ;
TRY: 'try' ;
EXCEPT: 'except' ;
FINALLY: 'finally' ;
NAME: [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER: [0-9]+ ;
STRING: '\'' (~[\'])* '\'' | '"' (~["])* '"' ;
NEWLINE: '\r'? '\n' ;

// Добавленные токены
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
IS: 'is' ;
XOR: '^' ;
LEFT_SHIFT: '<<' ;
RIGHT_SHIFT: '>>' ;
PLUS: '+' ;
MINUS: '-' ;
TRUE: 'True' ;
FALSE: 'False' ;
NONE: 'None' ;
STAR: '*' ;
DOUBLE_STAR: '**' ;
TILDE: '~' ;
NOT_EQUALS_1: '<>' ;
NOT_EQUALS_2: '!=' ;
LESS_THAN_EQUAL: '<=' ;
GREATER_THAN_EQUAL: '>=' ;
IN_OP: 'in' ;
NOT_IN: 'not' IN ;
IS_OP: 'is' ;
IS_NOT: 'is' NOT ;
ASSIGN: '=' ;
CLASS: 'class' ;

/*
 * Parser Rules
 */
 
file_input: (NEWLINE | stmt)* EOF ;
stmt: simple_stmt | compound_stmt ;
simple_stmt: small_stmt (SEMI_COLON small_stmt)* (SEMI_COLON)? NEWLINE ;
small_stmt: expr_stmt | print_stmt | import_stmt ;
expr_stmt: testlist_star_expr (assign_expr)* ;
assign_expr: augassign (yield_expr | testlist_star_expr) ;
augassign: (ADD_ASSIGN | SUB_ASSIGN | MULT_ASSIGN | AT_ASSIGN | DIV_ASSIGN 
          | MOD_ASSIGN | AND_ASSIGN | OR_ASSIGN | XOR_ASSIGN | LEFT_SHIFT_ASSIGN 
          | RIGHT_SHIFT_ASSIGN | POWER_ASSIGN | IDIV_ASSIGN) ;
testlist_star_expr: (test|star_expr) (COMMA (test|star_expr))* (COMMA)? ;
test: or_test (IF or_test ELSE test)? | lambdef ;
or_test: and_test (OR and_test)* ;
and_test: not_test (AND not_test)* ;
not_test: NOT not_test | comparison ;
comparison: expr (comp_op expr)* ;
comp_op: LESS_THAN | GREATER_THAN | EQUALS | GT_EQ | LT_EQ | NOT_EQ_1 | NOT_EQ_2 
        | IN | NOT_IN | IS_OP | IS_NOT | LESS_THAN_EQUAL | GREATER_THAN_EQUAL ;
expr: xor_expr (OR xor_expr)* ;
xor_expr: and_expr (XOR and_expr)* ;
and_expr: shift_expr (AND shift_expr)* ;
shift_expr: arith_expr ((LEFT_SHIFT | RIGHT_SHIFT) arith_expr)* ;
arith_expr: term ((PLUS | MINUS) term)* ;
term: factor ((MULT | DIV | MOD | IDIV) factor)* ;
factor: (PLUS | MINUS | TILDE) factor | power ;
power: atom_expr (DOUBLE_STAR factor)? ;
atom_expr: atom (trailer)* ;
atom: LPAREN (yield_expr|testlist_comp)? RPAREN | LBRACK (testlist_comp)? RBRACK 
     | LBRACE (dictorsetmaker)? RBRACE | NAME | NUMBER | STRING | TRUE | FALSE | NONE ;
trailer: LPAREN (arglist)? RPAREN | LBRACK subscriptlist RBRACK | DOT NAME ;
subscriptlist: subscript (COMMA subscript)* (COMMA)? ;
subscript: test | (test)? COLON (test)? (sliceop)? ;
sliceop: COLON (test)? ;
exprlist: (expr|star_expr) (COMMA (expr|star_expr))* (COMMA)? ;
testlist: test (COMMA test)* (COMMA)? ;
dictorsetmaker: (test COLON test (comp_for)? (COMMA)?)+ | (test (comp_for)? (COMMA)?)+ ;
arglist: (argument (COMMA argument)* (COMMA)? (STAR test)? (COMMA DOUBLE_STAR test)? 
          | STAR test (COMMA DOUBLE_STAR test)? | DOUBLE_STAR test) ;
argument: test (comp_for)? | test ASSIGN test ;
comp_iter: comp_for | comp_if ;
comp_for: FOR exprlist IN or_test (comp_iter)? ;
comp_if: IF test_nocond (comp_iter)? ;
test_nocond: or_test (IF or_test ELSE test_nocond)? | lambdef_nocond ;
lambdef_nocond: LAMBDA COLON test_nocond ;
yield_expr: YIELD (testlist)? ;
print_stmt: PRINT (testlist)? ;
import_stmt: IMPORT dotted_as_names | FROM dotted_name IMPORT (STAR | LPAREN import_as_names RPAREN) ;
import_as_name: NAME (AS NAME)? ;
dotted_as_name: dotted_name (AS NAME)? ;
import_as_names: import_as_name (COMMA import_as_name)* (COMMA)? ;
dotted_as_names: dotted_as_name (COMMA dotted_as_name)* (COMMA)? ;
dotted_name: NAME (DOT NAME)* ;

// Добавленные правила
compound_stmt: if_stmt | while_stmt | for_stmt | try_stmt | with_stmt | funcdef | classdef | decorated ;
star_expr: STAR expr ;
lambdef: LAMBDA varargslist COLON test ;
testlist_comp: (test|star_expr) (comp_for)? (COMMA (test|star_expr) (comp_for)?)* ;

// Добавленные правила

if_stmt: IF test COLON suite (elif_clause)* (else_clause)? ;
while_stmt: WHILE test COLON suite (else_clause)? ;
for_stmt: FOR exprlist IN testlist COLON suite (else_clause)? ;
try_stmt: TRY COLON suite (except_clause)+ (else_clause)? (finally_clause)? | TRY COLON suite FINALLY COLON suite ;
with_stmt: WITH with_item (COMMA with_item)* COLON suite ;
with_item: test (AS expr)? ;
funcdef: DEF NAME parameters COLON suite ;
parameters: LPAREN (typedargslist)? RPAREN ;
typedargslist: ((tfpdef (ASSIGN test)? (COMMA tfpdef (ASSIGN test)?)* (COMMA (STAR vfpdef)? (COMMA DOUBLE_STAR tfpdef)?)? 
                | (STAR vfpdef)? (COMMA DOUBLE_STAR tfpdef)?) ;
tfpdef: NAME (COLON test)? ;
vfpdef: NAME (COLON test)? ;
stmts: (simple_stmt | compound_stmt)+ ;
classdef: CLASS NAME (LPAREN (testlist)? RPAREN)? COLON suite ;
decorated: decorators (classdef | funcdef) ;
decorators: decorator+ ;
decorator: AT dotted_name (LPAREN (arglist)? RPAREN)? NEWLINE ;
else_clause: ELSE COLON suite ;
elif_clause: ELIF test COLON suite ;
suite: NEWLINE INDENT stmts DEDENT ;
mode IndentMode;