grammar GP;

program: stmt+ EOF ;

stmt:
    'if' expr ':' stmt ('elif' expr ':' stmt)* ('else' ':' stmt)?  # ifStmt
    | 'for' ID 'in' expr ':' stmt  # forStmt
    | 'while' expr ':' stmt  # whileStmt
    | 'def' ID '(' (param (',' param)*)? ')' ':' stmt  # functionDef
    | ID '(' (arg (',' arg)*)? ')'  # functionCall
    | ID '=' expr  # assign
    | expr  # exprStmt
    ;

expr:
    expr '+' expr  # addExpr
    | expr '-' expr  # subExpr
    | expr '*' expr  # multExpr
    | expr '/' expr  # divExpr
    | '(' expr ')'  # parens
    | ID  # idExpr
    | INT  # intExpr
    | STRING  # stringExpr
    ;

param: ID ;
arg: expr | STRING ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
INT: [0-9]+ ;
STRING: '"' .*? '"' | '\'' .*? '\'' ;
WS: [ \t\r\n]+ -> skip ;