grammar Python3;

/* Lexer rules */

INT: [0-9]+;
FLOAT: [0-9]*[.][0-9]+;
NAME: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' (ESC|.)*? '"';
CHAR_STRING: ( '"' ( ESC | ~[\\"\r\n] )* '"' ) | ( '\'' ( ESC | ~[\\'\r\n] )* '\'' );
ESC: '\\' .;

PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
MODULO: '%';
DOUBLE_SLASH: '//';
LESS_THAN: '<';
GREATER_THAN: '>';
EQUALS: '==';
NOT_EQUALS: '!=';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN_OR_EQUAL: '<=';
IN: 'in';
NOT: 'not';
IS: 'is';
AND: 'and';
OR: 'or';
BITWISE_AND: '&';
BITWISE_OR: '|';
BITWISE_XOR: '^';
LEFT_SHIFT: '<<';
RIGHT_SHIFT: '>>';
POWER: '**';
ASSIGN: '=';
COLON: ':';
COMMA: ',';
SEMICOLON: ';';
DOT: '.';
ELLIPSIS: '...';
AT: '@';
LEFT_PAREN: '(';
RIGHT_PAREN: ')';
LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
LEFT_BRACE: '{';
RIGHT_BRACE: '}';
NEWLINE: '\r'? '\n';
INDENT: ('    ' | '\t');

WS: [ \t\f]+ -> skip;
COMMENT: '#' ~[\r\n]* -> skip;

/* Parser rules */

program: (statement NEWLINE)*;

statement:
    | import_statement
    | compound_statement
    | simple_statement
    ;

simple_statement:
    | expression_statement
    | assignment_statement
    | augmented_assignment_statement
    | pass_statement
    | del_statement
    | return_statement
    | yield_statement
    | raise_statement
    | break_statement
    | continue_statement
    | global_statement
    | nonlocal_statement
    ;

compound_statement:
    | if_statement
    | while_statement
    | for_statement
    | try_statement
    | with_statement
    | function_definition
    ;

import_statement:
    'import' dotted_name (',' dotted_name)*
    | 'from' dotted_name 'import' import_from
    ;

import_from:
    ('.'* dotted_name) 'import' ('*' | '(' import_as_names ')' | import_as_names)
    ;

dotted_name:
    NAME ('.' NAME)*
    ;

assignment_statement:
    (target_list '=')* testlist_star_expression
    ;

target_list:
    target (',' target)* (',')?
    ;

target:
    NAME
    | '(' target_list ')'
    | '[' target_list ']'
    | attributeref
    | subscription
    ;

augmented_assignment_statement:
    target augassign (yield_expression | testlist)
    ;

augassign:
    '+=' | '-=' | '*=' | '@=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '**=' | '//='
    ;

pass_statement:
    'pass'
    ;

del_statement:
    'del' target_list
    ;

return_statement:
    'return' (testlist_star_expression)?
    ;

yield_statement:
    'yield' yield_expression
    ;


raise_statement : RAISE (expression (FROM expression)?)?;

break_statement : BREAK;

continue_statement : CONTINUE;

import_from_statement : FROM dotted_name IMPORT (STAR | LPAREN import_as_names RPAREN | import_as_names);

print_statement : PRINT (expression (COMMA expression)*)?;

exec_statement : EXEC expression (AS ID)?;

assert_expression : ASSERT expression;

if_statement : IF expression COLON suite (ELIF expression COLON suite)* (ELSE COLON suite)?; 

suite : simple_statement | NEWLINE INDENT statement+ DEDENT;

while_statement : WHILE expression COLON suite (ELSE COLON suite)?;

for_statement : FOR expression_list IN expression_list COLON suite (ELSE COLON suite)?;

try_statement : TRY COLON suite (except_clause+ (ELSE COLON suite)? (FINALLY COLON suite)?)? | try_statement_finally;

try_statement_finally : TRY COLON suite FINALLY COLON suite;

with_statement : WITH with_item+ COLON suite;

with_item : expression (AS target)?;

function_definition : DEF ID parameters COLON suite;

parameters : LPAREN (typedargslist)? RPAREN;

typedargslist : (tfpdef (ASSIGN test (COMMA test)* (COMMA typedargslist)?)? (COMMA VARARGS)? (COMMA kwargs)?) | VARARGS | kwargs;

tfpdef : ID (COLON test)?;

varargslist : (vfpdef (ASSIGN test (COMMA test)* (COMMA varargslist)?)? (COMMA VARARGS)? (COMMA kwargs)?) | VARARGS | kwargs;

vfpdef : ID (COLON test)?;

kwargs : DOUBLESTAR test;

expression_list : (expression (COMMA expression)*)?;

testlist : (test (COMMA test)*)?;

test : or_test (IF or_test ELSE test)?;

or_test : and_test (OR and_test)*;

and_test : not_test (AND not_test)*;

not_test : NOT not_test | comparison;

comparison : expr (comp_op expr)*;

comp_op : (LESS_THAN_EQUALS | GREATER_THAN_EQUALS | EQUALS | NOT_EQUALS | LESS_THAN | GREATER_THAN | IN | NOT IN | IS | IS NOT);

expr : xor_expr (OR xor_expr)*;

xor_expr : and_expr (XOR and_expr)*;

and_expr : shift_expr (AND shift_expr)*;

shift_expr : arith_expr ((LEFT_SHIFT | RIGHT_SHIFT) arith_expr)*;

arith_expr : term ((PLUS | MINUS) term)*;

term : factor ((MULTIPLY | DIVIDE | MODULO | IDIV) factor)*;

factor : (PLUS | MINUS | NOT) factor | power;

power : atom_expr (trailer)* (POWER factor)?;

atom_expr : (AWAIT)? atom (trailer)*;

atom : LPAREN expression_list? RPAREN | LSQB (testlist)? RSQB | LCURL (key_datum_list)? RCURL | NAME | INTEGER | FLOAT | STRING | TRUE | FALSE | NONE | ellipsis | yield_atom | testlist_comp | generator_expression | dictorsetmaker | yield_expression;

yield_atom : YIELD expression?;

key_datum_list : key_datum (COMMA key_datum)* (COMMA)?;

key_datum : (test COLON)? test;

trailer : LPAREN (arglist)? RPAREN | LSQB subscriptlist RSQB | DOT NAME;

subscriptlist : subscript (COMMA subscript)* (COMMA)?;

subscript : test (COLON (test)?)? (COLON (test)?)? (sliceop)?;

sliceop : COLON (test)?;

exprlist : (expression (COMMA expression)*)?;

testlist_comp : (test | star_expr) (comp_for)?;

trailer_comp : (LPAREN (arglist)? RPAREN | LSQB subscriptlist RSQB) (comp_for)?;

subscriptlist_comp : (subscript (COMMA subscript)* (COMMA)?)? (comp_for)?;

dictorsetmaker : ((test COLON test (comp_for)?) | (test (comp_for)?)) (COMMA ((test COLON test (comp_for)?) | (test(comp_for)?))*) (COMMA)?;

comp_iter : comp_for | comp_if;

comp_for : FOR exprlist IN or_test (comp_iter)?;

comp_if : IF or_test (comp_iter)?;

encoding_decl : NAME;

ellipsis : ELLIPSIS;

single_input : NEWLINE | simple_statement | compound_statement NEWLINE;

file_input : (NEWLINE | statement)* EOF;

eval_input : testlist NEWLINE* EOF;

decorator : AT dotted_name (LPAREN (arglist)? RPAREN)?;

decorators : decorator+;

decorated : decorators (classdef | function_definition);

async_funcdef : ASYNC function_definition;

async_stmt : ASYNC (function_definition | with_statement);

sync_or_async_funcdef : (async_funcdef | function_definition);

sync_or_async_stmt : (async_stmt | simple_statement);

global_statement : GLOBAL ID (COMMA ID)*;

nonlocal_statement : NONLOCAL ID (COMMA ID)*;

assert_statement : ASSERT expression (COMMA test)?;

import_name : IMPORT dotted_as_names;

import_as_name : NAME (AS NAME)?;

dotted_as_name : dotted_name (AS NAME)?;

import_as_names : import_as_name (COMMA import_as_name)*;

dotted_as_names : dotted_as_name (COMMA dotted_as_name)*;

parameter : tfpdef (COLON test)? (ASSIGN test)?;

parameters_2 : LPAREN (parameter (COMMA parameter)* (COMMA VARARGS (COMMA kwargs)?)? | VARARGS (COMMA kwargs)? | kwargs) RPAREN;

decorator_2 : AT dotted_name parameters_2? NEWLINE;

decorators_2 : decorator_2+;

classdef : CLASS NAME parameters_2? COLON suite;

arglist : (argument (COMMA argument)* (COMMA)?);

argument : (test (ASSIGN test)?);

lst : LSQB (list_item (COMMA list_item)* (COMMA)?)? RSQB;

list_item : (test (COMP_FOR | (COMMA test)*));

tuple_: LPAREN (test (COMMA test)* (COMMA)?)? RPAREN;

set_: LCURL (test (COMMA test)* (COMMA)?)? RCURL;

dict_: LCURL (key_datum_list (COMMA)?)? RCURL;

test_item : (test (COLON test)?);

star_expr : STAR expr;

expr_or_star : (test | star_expr);

exprlist_comp : (expr_or_star (COMMA expr_or_star)* (COMMA)?);

testlist_star_expr : (test | star_expr) (COMMA (test | star_expr))* (COMMA)?;

yield_expression : YIELD testlist_star_expr?;

argument_with_star : test (COMMA argument)* (COMMA (STAR test (COMMA test)* (COMMA kwargs)? | kwargs))? | STAR test (COMMA test)* (COMMA kwargs)?;

flow_statement : break_statement | continue_statement | return_statement | raise_statement | yield_expression;

import_stmt : import_name | import_from;

stmt : simple_statement | compound_statement | async_stmt;

except_clause : EXCEPT (test (AS NAME)?)? COLON suite;
