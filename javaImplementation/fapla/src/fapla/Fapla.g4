grammar Fapla;

// Case Insensitive fragments
    fragment A:('a'|'A');
    fragment B:('b'|'B');
    fragment C:('c'|'C');
    fragment D:('d'|'D');
    fragment E:('e'|'E');
    fragment F:('f'|'F');
    fragment G:('g'|'G');
    fragment H:('h'|'H');
    fragment I:('i'|'I');
    fragment J:('j'|'J');
    fragment K:('k'|'K');
    fragment L:('l'|'L');
    fragment M:('m'|'M');
    fragment N:('n'|'N');
    fragment O:('o'|'O');
    fragment P:('p'|'P');
    fragment Q:('q'|'Q');
    fragment R:('r'|'R');
    fragment S:('s'|'S');
    fragment T:('t'|'T');
    fragment U:('u'|'U');
    fragment V:('v'|'V');
    fragment W:('w'|'W');
    fragment X:('x'|'X');
    fragment Y:('y'|'Y');
    fragment Z:('z'|'Z');

// Other Fragments

    fragment Letter
        : [a-zA-Z]
        ;

    fragment Digit
        : [0-9]
        ;

    fragment HexadecimalDigit
        :   [0-9a-fA-F]
        ;

    fragment Ld
        :   (Letter | Digit)?
        ;

////////////////////// PARSER //////////////////////

/////////// Expression ///////////

    primaryExpression
        :   Identifier
        |   StringConstant
        |   RealConstant
        |   RealConstantHex
        |   RationalConstant
        |   BoolConstant
        |   '(' expression ')'
        |   callFunction
        ;

    unaryExpression
        :   primaryExpression
        |   NOT primaryExpression
        |   primaryExpression '!'
        ;

    powerExpression
        :   unaryExpression
        |   unaryExpression '^' powerExpression
        ;

    multiplicativeExpression
        :   powerExpression
        |   multiplicativeExpression '*' powerExpression
        |   multiplicativeExpression '/' powerExpression
        |   multiplicativeExpression '%' powerExpression
        ;

    additiveExpression
        :   multiplicativeExpression
        |   additiveExpression '+' multiplicativeExpression
        |   additiveExpression '-' multiplicativeExpression
        ;

    relationalExpression
        :   additiveExpression
        |   relationalExpression '<' additiveExpression
        |   relationalExpression '>' additiveExpression
        |   relationalExpression '<=' additiveExpression
        |   relationalExpression '>=' additiveExpression
        |   relationalExpression '==' additiveExpression
        |   relationalExpression '<>' additiveExpression
        ;

    logicalXorExpression
        :   relationalExpression
        |   logicalXorExpression XOR relationalExpression
        ;

    logicalAndExpression
        :   logicalXorExpression
        |   logicalAndExpression AND logicalXorExpression
        ;

    logicalOrExpression
        :   logicalAndExpression
        |   logicalOrExpression OR logicalAndExpression
        ;

    conditionalExpression
        :   logicalOrExpression ('?' expression ':' expression)?
        ;

    expression
        :   conditionalExpression
        ;
/////////// Statement ///////////

     startState
        :   moduleDefinition*   mainModuleDefinition moduleDefinition* EOF
        ;

     type
        :   String
        |   Real
        |   Bool
        ;

    statement
        :   compoundStatement
        |   selectionStatement
        |   iterationStatement
        |   jumpStatement
        |   assignmentStatement
        |   expressionStatement
        |   writeStatement
        |   readStatement
        |   declaration
        ;

    compoundStatement
        :   Begin blockItemList? End
        ;

    blockItemList
        :   blockItem
        |   blockItemList blockItem
        ;

    blockItem
        :   declaration
        |   statement
        ;

     expressionStatement
        :   expression? ';'
        ;

    selectionStatement
        :   If expression Then statement (Else statement)?
        ;

    iterationStatement
        :   While expression statement
        ;

    jumpStatement
        :   Return expression ';'
        ;

    assignmentStatement
        :   Identifier '=' expression ';'
        ;

    writeStatement
        :   Write expression ';'
        ;

    readStatement
        :   Read Identifier ';'
        ;

    moduleDefinition
        :   Module Identifier
            (Input ':' declarationList)?
            (Output ':' type ';')?
            compoundStatement
        ;

    mainModuleDefinition
        :   Module Main compoundStatement
        ;

    declarationList
        :   declaration
        |   declarationList declaration
        ;

    declaration
        :   Identifier ':' type ';'
        ;

    callFunction
        :   Identifier '(' parametersList? ')'
        ;

    parametersList
        :   parameter
        |   parametersList ',' parameter
        ;

    parameter
        :   expression
        ;

////////////////////// LEXER //////////////////////

//Constants

    StringConstant
        :  '"' (~[\r\n]+)? '"'
        ;

    RealConstant
        : Digit+
        ;

    RealConstantHex
        : '0' X (HexadecimalDigit+)
        ;

    RationalConstant
        : Digit* '.' Digit+
        ;

    BoolConstant
        : T R U E
        | F A L S E
        ;

// Data Types

    String       : S T R I N G;
    Real         : R E A L;
    Bool         : B O O L;

// Keywords

    Elseif       : E L S E I F;
    Else         : E L S E;
    Then         : T H E N;
    If           : I F;
    Return       : R E T U R N;
    While        : W H I L E;
    Module       : M O D U L E;
    Main         : M A I N;
    Begin        : B E G I N;
    End          : E N D;
    Input        : I N P U T;
    Output       : O U T P U T;
    Write        : W R I T E;
    Read         : R E A D;

//Delimiter

    SemiColon    : ';';
    Comma        : ',';
    Colon        : ':';
    OParen       : '(';
    CParen       : ')';
    OBrace       : '{';
    CBrace       : '}';

// Operators

    // Primitive Operators

    Addition     : '+';
    Subtract     : '-';
    Multiply     : '*';
    Division     : '/';

    // Power Operator

    Power        : '^';

    // Factorial Operator

    Factorial    : '!';

    // Logical Operators

    AND          : A N D;
    OR           : O R;
    NOT          : N O T;
    XOR          : X O R;

    // Comparison Operators

    NotEQ        : '<>';
    LE           : '<=';
    GE           : '>=';
    EQ           : '==';
    GT           : '>';
    LT           : '<';

    // Mod Operator

    Mod          : '%';

    // Condition Operator

    QuestionMark : '?';

    //Assign Operator

    Assign       : '=';


    Identifier
    : Letter Ld Ld Ld Ld Ld Ld Ld Ld
             Ld Ld Ld Ld Ld Ld Ld Ld
             Ld Ld Ld Ld Ld Ld Ld Ld
             Ld Ld Ld Ld Ld Ld Ld
    ;

    Whitespace
    :   [ \t]+
        -> skip
    ;

    Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

    BlockComment
    :   '%%%' .*? '%%%'
        -> skip
    ;

    LineComment
    :   '%%' ~[\r\n]*
        -> skip
    ;
