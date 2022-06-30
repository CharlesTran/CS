grammar MyCGrammar;
 
primaryExpression
    :   tokenId//Identifier
    |   tokenConstant//Constant
    |   tokenStringLiteral//StringLiteral+
    |   '(' expression ')'
    |   genericSelection
    |   '__extension__'? '(' compoundStatement ')' // Blocks (GCC extension)
    |   '__builtin_va_arg' '(' unaryExpression ',' typeName ')'
    |   '__builtin_offsetof' '(' typeName ',' unaryExpression ')'
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
 
genericSelection
    :   '_Generic' '(' assignmentExpression ',' genericAssocList ')'
    ;

genericAssocList
    :   genericAssociation post_genericAssocList
    ;

post_genericAssocList
    :   ',' genericAssociation post_genericAssocList
    |
    ;

genericAssociation
    :   typeName ':' assignmentExpression
    |   'default' ':' assignmentExpression
    ;

postfixExpression
    :   primaryExpression post_postfixExpression
    |   '(' typeName ')' '{' initializerList '}' post_postfixExpression           
    |   '(' typeName ')' '{' initializerList ',' '}' post_postfixExpression      
    |   '__extension__' '(' typeName ')' '{' initializerList '}' post_postfixExpression   
    |   '__extension__' '(' typeName ')' '{' initializerList ',' '}' post_postfixExpression
    ;

post_postfixExpression
    :   '[' expression ']' post_postfixExpression
    |   '(' argumentExpressionList? ')' post_postfixExpression
    |   '.' Identifier post_postfixExpression
    |   '->' Identifier post_postfixExpression
    |   '++' post_postfixExpression
    |   '--' post_postfixExpression
    |
    ;
 
argumentExpressionList
    :   ',' assignmentExpression post_argumentExpressionList
    ;

post_argumentExpressionList
    :   assignmentExpression post_argumentExpressionList
    ;

unaryExpression
    :   postfixExpression       #unaryExpression_pass
    |   '++' unaryExpression    #unaryExpression_
    |   '--' unaryExpression    #unaryExpression_
    |   unaryOperator castExpression    #unaryExpression_
    |   'sizeof' unaryExpression    #unaryExpression_pass
    |   'sizeof' '(' typeName ')'   #unaryExpression_pass
    |   '_Alignof' '(' typeName ')' #unaryExpression_pass
    |   '&&' Identifier    #unaryExpression_pass
    ;
 
unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;
 
castExpression
    :   unaryExpression         #castExpression_pass
    |   '(' typeName ')' castExpression     #castExpression_
    |   '__extension__' '(' typeName ')' castExpression #castExpression_
    ;
 
multiplicativeExpression
    :   castExpression post_multiplicativeExpression
    ;

post_multiplicativeExpression
    :   '*' castExpression post_multiplicativeExpression
    |   '/' castExpression post_multiplicativeExpression
    |   '%' castExpression post_multiplicativeExpression
    |
    ;

additiveExpression
    :   multiplicativeExpression post_additiveExpression
    ;

post_additiveExpression
    :   '+' multiplicativeExpression post_additiveExpression
    |   '-' multiplicativeExpression post_additiveExpression
    ;

shiftExpression
    :   additiveExpression post_shiftExpression
    ;

post_shiftExpression
    :   '<<' additiveExpression post_shiftExpression
    |   '>>' additiveExpression post_shiftExpression
    |
    ;
 
relationalExpression
    :   shiftExpression post_relationExpression
    ;

post_relationExpression
    :   '<' shiftExpression post_relationExpression
    |   '>' shiftExpression post_relationExpression
    |   '<=' shiftExpression post_relationExpression
    |   '>=' shiftExpression post_relationExpression
    |
    ;  

equalityExpression
    :   relationalExpression post_equalityExpression
    ;

post_equalityExpression
    :   '==' relationalExpression post_equalityExpression
    |   '!=' relationalExpression post_equalityExpression
    |
    ;
 
andExpression
    :   equalityExpression  post_andExpression
    ;

post_andExpression
    :   '&' equalityExpression post_andExpression
    |
    ;

exclusiveOrExpression
    :   andExpression post_exclusiveOrExpression
    ;

post_exclusiveOrExpression
    :   '^' andExpression post_exclusiveOrExpression
    |
    ;

inclusiveOrExpression
    :   exclusiveOrExpression post_inclusiveOrExpression
    ;

post_inclusiveOrExpression
    :   '|' exclusiveOrExpression post_inclusiveOrExpression
    |
    ;

logicalAndExpression
    :   inclusiveOrExpression post_logicalAndExpression
    ;

post_logicalAndExpression
    :   '&&' inclusiveOrExpression post_logicalAndExpression
    |
    ;

logicalOrExpression
    :   logicalAndExpression post_logicalOrExpression
    ;

post_logicalOrExpression
    :   '||' logicalAndExpression post_logicalOrExpression
    |
    ;

conditionalExpression
    :   logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;
 
assignmentExpression
    :   conditionalExpression   #assignmentExpression_pass
    |   unaryExpression assignmentOperator assignmentExpression #assignmentExpression_
    ;
 
assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    ;

expression
    :   assignmentExpression post_expression
    ;

post_expression
    :   ',' assignmentExpression post_expression
    |
    ;

constantExpression
    :   conditionalExpression
    ;
 
declaration
    :   declarationSpecifiers initDeclaratorList? ';'
    |   staticAssertDeclaration
    ;
 
declarationSpecifiers
    :   declarationSpecifier+
    ;
 
declarationSpecifiers2
    :   declarationSpecifier+
    ;
 
declarationSpecifier
    :   storageClassSpecifier
    |   typeSpecifier
    |   typeQualifier
    |   functionSpecifier
    |   alignmentSpecifier
    ;

//声明变量
initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator
    :   declarator
    |   declarator '=' initializer
    ;
 
storageClassSpecifier
    :   'typedef'
    |   'extern'
    |   'static'
    |   '_Thread_local'
    |   'auto'
    |   'register'
    ;
 
typeSpecifier
    :   'void'     #typeSpecifier_
    |   'char'      #typeSpecifier_
    |   'short'     #typeSpecifier_
    |   'int'       #typeSpecifier_
    |   'long'      #typeSpecifier_
    |   'float'     #typeSpecifier_
    |   'double'    #typeSpecifier_
    |   'signed'    #typeSpecifier_
    |   'unsigned'  #typeSpecifier_
    ;
 
structOrUnionSpecifier
    :   structOrUnion Identifier? '{' structDeclarationList '}'
    |   structOrUnion Identifier
    ;
 
structOrUnion
    :   'struct'
    |   'union'
    ;

structDeclarationList
    :   structDeclaration post_structDeclarationList
    ;

post_structDeclarationList
    :   structDeclaration post_structDeclarationList
    |
    ;

structDeclaration
    :   specifierQualifierList structDeclaratorList? ';'
    |   staticAssertDeclaration
    ;
 
specifierQualifierList
    :   typeSpecifier specifierQualifierList?
    |   typeQualifier specifierQualifierList?
    ;
 
structDeclaratorList
    :   structDeclarator post_structDeclaratorList
    ;

post_structDeclaratorList
    :   ',' structDeclarator post_structDeclaratorList
    |
    ;
 
structDeclarator
    :   declarator
    |   declarator? ':' constantExpression
    ;
 
enumSpecifier
    :   'enum' Identifier? '{' enumeratorList '}'
    |   'enum' Identifier? '{' enumeratorList ',' '}'
    |   'enum' Identifier
    ;
 
enumeratorList
    :   enumerator post_enumeratorList
    ;

post_enumeratorList
    :   ',' enumerator post_enumeratorList
    |
    ;

enumerator
    :   enumerationConstant
    |   enumerationConstant '=' constantExpression
    ;
 
enumerationConstant
    :   Identifier
    ;
 
atomicTypeSpecifier
    :   '_Atomic' '(' typeName ')'
    ;
 
typeQualifier
    :   'const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic'
    ;
 
functionSpecifier
    :   ('inline'
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')
    |   gccAttributeSpecifier
    |   '__declspec' '(' Identifier ')'
    ;
 
alignmentSpecifier
    :   '_Alignas' '(' typeName ')'
    |   '_Alignas' '(' constantExpression ')'
    ;
 
declarator
    :   pointer? directDeclarator gccDeclaratorExtension*
    ;
 
directDeclarator
    :   Identifier          #directDeclarator_pass
    |   '(' declarator ')'  #directDeclarator_pass
    |   directDeclarator '[' typeQualifierList? assignmentExpression? ']'   #directDeclarator_array
    |   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'   #directDeclarator_array
    |   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'    #directDeclarator_array
    |   directDeclarator '[' typeQualifierList? '*' ']'     #directDeclarator_array
    |   directDeclarator '(' parameterTypeList ')'          #directDeclarator_func
    |   directDeclarator '(' identifierList? ')'            #directDeclarator_func
    ;
 
gccDeclaratorExtension
    :   '__asm' '(' StringLiteral+ ')'
    |   gccAttributeSpecifier
    ;
 
gccAttributeSpecifier
    :   '__attribute__' '(' '(' gccAttributeList ')' ')'
    ;
 
gccAttributeList
    :   gccAttribute (',' gccAttribute)*
    |   // empty
    ;
 
gccAttribute
    :   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
        ('(' argumentExpressionList? ')')?
    |   // empty
    ;
 
nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' nestedParenthesesBlock ')'
        )*
    ;
 
pointer
    :   '*' typeQualifierList?
    |   '*' typeQualifierList? pointer
    |   '^' typeQualifierList? // Blocks language extension
    |   '^' typeQualifierList? pointer // Blocks language extension
    ;
 
typeQualifierList
    :   typeQualifier
    |   typeQualifierList typeQualifier
    ;
 
parameterTypeList
    :   parameterList
    |   parameterList ',' '...'
    ;
 
parameterList
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;
 
parameterDeclaration
    :   declarationSpecifiers declarator
    |   declarationSpecifiers2 abstractDeclarator?
    ;
 
identifierList
    :   Identifier
    |   identifierList ',' Identifier
    ;
 
typeName
    :   specifierQualifierList abstractDeclarator?
    ;
 
abstractDeclarator
    :   pointer
    |   pointer? directAbstractDeclarator gccDeclaratorExtension*
    ;
 
directAbstractDeclarator
    :   '(' abstractDeclarator ')' gccDeclaratorExtension*
    |   '[' typeQualifierList? assignmentExpression? ']'
    |   '[' 'static' typeQualifierList? assignmentExpression ']'
    |   '[' typeQualifierList 'static' assignmentExpression ']'
    |   '[' '*' ']'
    |   '(' parameterTypeList? ')' gccDeclaratorExtension*
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directAbstractDeclarator '[' '*' ']'
    |   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
    ;
 
 
initializer
    :   assignmentExpression
    |   '{' initializerList '}'
    |   '{' initializerList ',' '}'
    ;
 
initializerList
    :   designation? initializer
    |   initializerList ',' designation? initializer
    ;
 
designation
    :   designatorList '='
    ;
 
designatorList
    :   designator
    |   designatorList designator
    ;
 
designator
    :   '[' constantExpression ']'
    |   '.' Identifier
    ;
 
staticAssertDeclaration
    :   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
    ;
 
statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    |   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;
 
labeledStatement
    :   Identifier ':' statement                   
    |   'case' constantExpression ':' statement     
    |   'default' ':' statement
    ;
 
compoundStatement
    :   '{' blockItemList? '}'
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
    :   'if' '(' expression ')' statement ('else' statement)?   #selectionStatement_if
    |   'switch' '(' expression ')' statement                   #selectionStatement_switch
    ;
 
iterationStatement
    :   'while' '(' expression ')' statement                    #iterationStatement_while
    |   'do' statement 'while' '(' expression ')' ';'           #iterationStatement_dowhile
    |   'for' '(' expression? ';' expression? ';' expression? ')' statement     #iterationStatement_for
    |   'for' '(' declaration expression? ';' expression? ')' statement         #iterationStatement_forDeclared
    ;
 
jumpStatement
    :   'goto' Identifier ';'           #jumpStatement_goto
    |   'continue' ';'                  #jumpStatement_continue
    |   'break' ';'                     #jumpStatement_break
    |   'return' expression? ';'        #jumpStatement_return
    |   'goto' unaryExpression ';'      #jumpStatement_        // GCC extension     
    ;
 
compilationUnit
    :   translationUnit? EOF
    ;
 
translationUnit
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;
 
externalDeclaration
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;
 
functionDefinition
    :   declarationSpecifiers? declarator declarationList? compoundStatement
    ;
 
declarationList
    :   declaration
    |   declarationList declaration
    ;
 
functionCall: tokenId '(' argumentExpressionList? ')'	#functionCall_	;
 
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
 
Alignas : '_Alignas';
Alignof : '_Alignof';
Atomic : '_Atomic';
Bool : '_Bool';
Complex : '_Complex';
Generic : '_Generic';
Imaginary : '_Imaginary';
Noreturn : '_Noreturn';
StaticAssert : '_Static_assert';
ThreadLocal : '_Thread_local';
 
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