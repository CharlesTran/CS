grammar mygrammar;
compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration translationUnit_
    ;

translationUnit_
    :   externalDeclaration translationUnit_
    |
    ;

externalDeclaration //外部声明
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

functionDefinition
    :   typeSpecifiers + Identifier + '(' declarationList?')' compoundStatement
    ;

declarationList
    :   declaration+
    ;

declaration
    :   typeSpecifiers initDeclaratorList? ';'
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator
    :   declarator
    |   declarator '=' assignmentExpression
    ;

declarator
    :   Identifier
    ;

typeSpecifiers   //数据类型
    :   typeSpecifier1
    |   typeSpecifier2 typeSpecifier2? typeSpecifier1?
    |   typeSpecifier3 (typeSpecifier2 typeSpecifier2?)? typeSpecifier1
    ;

typeSpecifier1
    :   'void'
    |   'char'
    |   'int'
    |   'float'
    |   'double'
    ;

typeSpecifier2
    :   'long'
    |   'short'
    ;

typeSpecifier3
    :   'signed'
    |   'unsigned'
    ;



blockItemList
    :   blockItem+
    ;

blockItem
    :   declaration
    |   statement
    ;

statement
    :   compoundStatement
    |   expressionStatement
    |   iterationStatement
    |   jumpStatement
    |   selectionStatement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;



iterationStatement
    :   'while' '(' expression ')' statement                    #iterationStatement_while
    |   'do' statement 'while' '(' expression ')' ';'           #iterationStatement_dowhile
    |   'for' '(' expression? ';' expression? ';' expression? ')' statement     #iterationStatement_for
    |   'for' '(' declaration expression? ';' expression? ')' statement         #iterationStatement_forDeclared
    ;

jumpStatement
    :   'continue' ';'                  #jumpStatement_continue
    |   'break' ';'                     #jumpStatement_break
    |   'return' expression? ';'        #jumpStatement_return
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?   #selectionStatement_if
    |   'switch' '(' expression ')' statement                   #selectionStatement_switch
    ;

expressionStatement
    :   expression ';'
    ;

expression
    :   assignmentExpression    #expression_
    |   expression ',' assignmentExpression #expression_pass
    ;

unaryExpression
    :   postfixExpression       #unaryExpression_pass
    |   '++' unaryExpression    #unaryExpression_
    |   '--' unaryExpression    #unaryExpression_
    |   unaryOperator castExpression    #unaryExpression_
    |   '&&' Identifier    #unaryExpression_pass
    ;
postfixExpression
    :   primaryExpression                                   #postfixExpression_pass
    |   postfixExpression '[' expression ']'                #postfixExpression_arrayaccess
    |   postfixExpression '(' argumentExpressionList? ')'   #postfixExpression_funcall
    |   postfixExpression '.' Identifier                    #postfixExpression_member
    |   postfixExpression '->' Identifier                   #postfixExpression_point
    |   postfixExpression '++'                              #postfixExpression_
    |   postfixExpression '--'                              #postfixExpression_
    ;

assignmentExpression
    :   unaryExpression assignmentOperator assignmentExpression
    |   functionCall
    |   conditionalExpression
    ;

conditionalExpression
    :   logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;
logicalOrExpression
    :   logicalAndExpression    #logicalOrExpression_pass
    |   logicalOrExpression '||' logicalAndExpression   #logicalOrExpression_
    ;
logicalAndExpression
    :   inclusiveOrExpression   #logicalAndExpression_pass
    |   logicalAndExpression '&&' inclusiveOrExpression #logicalAndExpression_
    ;
castExpression
    :   unaryExpression         #castExpression_pass
    ;

multiplicativeExpression
    :   castExpression          #multiplicativeExpression_pass
    |   multiplicativeExpression '*' castExpression #multiplicativeExpression_
    |   multiplicativeExpression '/' castExpression #multiplicativeExpression_
    |   multiplicativeExpression '%' castExpression #multiplicativeExpression_
    ;

additiveExpression
    :   multiplicativeExpression    #additiveExpression_pass
    |   additiveExpression '+' multiplicativeExpression #additiveExpression_
    |   additiveExpression '-' multiplicativeExpression #additiveExpression_
    ;

shiftExpression
    :   additiveExpression  #shiftExpression_pass
    |   shiftExpression '<<' additiveExpression #shiftExpression_
    |   shiftExpression '>>' additiveExpression #shiftExpression_
    ;

relationalExpression
    :   shiftExpression     #relationalExpression_pass
    |   relationalExpression '<' shiftExpression    #relationalExpression_
    |   relationalExpression '>' shiftExpression    #relationalExpression_
    |   relationalExpression '<=' shiftExpression   #relationalExpression_
    |   relationalExpression '>=' shiftExpression   #relationalExpression_
    ;

equalityExpression
    :   relationalExpression    #equalityExpression_pass
    |   equalityExpression '==' relationalExpression    #equalityExpression_
    |   equalityExpression '!=' relationalExpression    #equalityExpression_
    ;

andExpression
    :   equalityExpression  #andExpression_pass
    |   andExpression '&' equalityExpression    #andExpression_
    ;

exclusiveOrExpression
    :   andExpression   #exclusiveOrExpression_pass
    |   exclusiveOrExpression '^' andExpression #exclusiveOrExpression_
    ;

inclusiveOrExpression
    :   exclusiveOrExpression   #inclusiveOrExpression_pass
    |   inclusiveOrExpression '|' exclusiveOrExpression #inclusiveOrExpression_
    ;
assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;



unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;


primaryExpression
    :   tokenId//Identifier
    |   tokenConstant//Constant
    |   tokenStringLiteral//StringLiteral+
    |   '(' expression ')'
    ;
tokenId
	: Identifier
	;
tokenConstant
	: Constant
	;
tokenStringLiteral
	: StringLiteral+
	;
functionCall: tokenId '(' argumentExpressionList? ')'	#functionCall_	;//调用函数 函数名(参数)

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;
Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
If : 'if';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';


LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
Ellipsis : '...';

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    |   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

fragment
HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

Constant
    :   IntegerConstant
    |   FloatingConstant
    //|   EnumerationConstant
    |   CharacterConstant
    ;

fragment
IntegerConstant
    :   DecimalConstant IntegerSuffix?
    |   OctalConstant IntegerSuffix?
    |   HexadecimalConstant IntegerSuffix?
    |	BinaryConstant
    ;

fragment
BinaryConstant
	:	'0' [bB] [0-1]+
	;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
OctalConstant
    :   '0' OctalDigit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
IntegerSuffix
    :   UnsignedSuffix LongSuffix?
    |   UnsignedSuffix LongLongSuffix
    |   LongSuffix UnsignedSuffix?
    |   LongLongSuffix UnsignedSuffix?
    ;

fragment
UnsignedSuffix
    :   [uU]
    ;

fragment
LongSuffix
    :   [lL]
    ;

fragment
LongLongSuffix
    :   'll' | 'LL'
    ;

fragment
FloatingConstant
    :   DecimalFloatingConstant
    |   HexadecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant ExponentPart? FloatingSuffix?
    |   DigitSequence ExponentPart FloatingSuffix?
    ;

fragment
HexadecimalFloatingConstant
    :   HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
    |   HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
DigitSequence
    :   Digit+
    ;

fragment
HexadecimalFractionalConstant
    :   HexadecimalDigitSequence? '.' HexadecimalDigitSequence
    |   HexadecimalDigitSequence '.'
    ;

fragment
BinaryExponentPart
    :   'p' Sign? DigitSequence
    |   'P' Sign? DigitSequence
    ;

fragment
HexadecimalDigitSequence
    :   HexadecimalDigit+
    ;

fragment
FloatingSuffix
    :   'f' | 'l' | 'F' | 'L'
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;
fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;
fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;
fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;
fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;
StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;
fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;
fragment
SCharSequence
    :   SChar+
    ;
fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

ComplexDefine
    :   '#' Whitespace? 'define'  ~[#]*
        -> skip
    ;

// ignore the following asm blocks:
/*
    asm
    {
        mfspr x, 286;
    }
 */
AsmBlock
    :   'asm' ~'{'* '{' ~'}'* '}'
	-> skip
    ;

// ignore the lines generated by c preprocessor
// sample line : '#line 1 "/home/dm/files/dk1.h" 1'
LineAfterPreprocessing
    :   '#line' Whitespace* ~[\r\n]*
        -> skip
    ;

LineDirective
    :   '#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]*
        -> skip
    ;

PragmaDirective
    :   '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
        -> skip
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
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;