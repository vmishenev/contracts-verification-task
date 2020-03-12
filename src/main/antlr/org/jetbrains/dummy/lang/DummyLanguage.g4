grammar DummyLanguage;

@header {
package org.jetbrains.dummy.lang;
}

@lexer::members {
    public static final int COMMENTS = 1;
}

prog
    : func_def*
    ;

func_def
    : FUN ID LEFT_BR (ID (COMMA ID)*)? RIGHT_BR block
    ;

block
    : BEGIN stat* END
    ;

stat
    : var_def
    | assign
    | expr SEMICOLON
    | if_statement
    | return_statement
    ;

return_statement
    : RETURN expr? SEMICOLON
    ;

if_statement
    : IF LEFT_BR expr RIGHT_BR block (ELSE block)?
    ;

assign
    : ID ASSIGN expr SEMICOLON
    ;

var_def
    : VAR ID (ASSIGN expr)? SEMICOLON
    ;

func
    : ID LEFT_BR (expr (COMMA expr)*)? RIGHT_BR
    ;

expr
    : func_call
    | ID
    | TRUE
    | FALSE
    | NUMBER
    ;

func_call
    : ID LEFT_BR (expr (COMMA expr)*)? RIGHT_BR
    ;

VAR
    : 'var'
    ;

IF
    : 'if'
    ;

ELSE
    : 'else'
    ;


TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

BEGIN
    : '{'
    ;

END
    : '}'
    ;

FUN
    : 'fun'
    ;

ID
    : ('_'|[a-z])('_'|[a-z0-9])*
    ;

NUMBER
    : '-'? '0'
    | '-'? [1-9] DIGIT*
    ;

DIGIT
    : [0-9]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

SINGLE_COMMENT
    : '//' ~[\r\n]* -> channel(1)
    ;

MULTI_COMMENT
    : '/*' .*? '*/' -> channel(1)
    ;

SEMICOLON
    : ';'
    ;

LEFT_BR
    : '('
    ;

RIGHT_BR
    : ')'
    ;

ASSIGN
    : '='
    ;

COMMA
    : ','
    ;

RETURN
    : 'return'
    ;