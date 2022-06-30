// Generated from .\MyCGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyCGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyCGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(MyCGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#tokenId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenId(MyCGrammarParser.TokenIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#tokenConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenConstant(MyCGrammarParser.TokenConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#tokenStringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenStringLiteral(MyCGrammarParser.TokenStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(MyCGrammarParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(MyCGrammarParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(MyCGrammarParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_arrayaccess}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_arrayaccess(MyCGrammarParser.PostfixExpression_arrayaccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_point}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_point(MyCGrammarParser.PostfixExpression_pointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_funcall}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_funcall(MyCGrammarParser.PostfixExpression_funcallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_pass(MyCGrammarParser.PostfixExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_member}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_member(MyCGrammarParser.PostfixExpression_memberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_(MyCGrammarParser.PostfixExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(MyCGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_pass(MyCGrammarParser.UnaryExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_(MyCGrammarParser.UnaryExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(MyCGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression_pass(MyCGrammarParser.CastExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression_(MyCGrammarParser.CastExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_(MyCGrammarParser.MultiplicativeExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_pass(MyCGrammarParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_pass(MyCGrammarParser.AdditiveExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_(MyCGrammarParser.AdditiveExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression_}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression_(MyCGrammarParser.ShiftExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression_pass(MyCGrammarParser.ShiftExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_pass(MyCGrammarParser.RelationalExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_(MyCGrammarParser.RelationalExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_pass(MyCGrammarParser.EqualityExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_(MyCGrammarParser.EqualityExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression_pass(MyCGrammarParser.AndExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression_}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression_(MyCGrammarParser.AndExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression_(MyCGrammarParser.ExclusiveOrExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code exclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression_pass(MyCGrammarParser.ExclusiveOrExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression_pass(MyCGrammarParser.InclusiveOrExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression_(MyCGrammarParser.InclusiveOrExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression_pass(MyCGrammarParser.LogicalAndExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalAndExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression_(MyCGrammarParser.LogicalAndExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression_(MyCGrammarParser.LogicalOrExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression_pass(MyCGrammarParser.LogicalOrExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(MyCGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression_pass(MyCGrammarParser.AssignmentExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression_(MyCGrammarParser.AssignmentExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(MyCGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_(MyCGrammarParser.Expression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code expression_pass}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_pass(MyCGrammarParser.Expression_passContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(MyCGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(MyCGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(MyCGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(MyCGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(MyCGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(MyCGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(MyCGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(MyCGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSpecifier_}
	 * labeled alternative in {@link MyCGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier_(MyCGrammarParser.TypeSpecifier_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(MyCGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(MyCGrammarParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(MyCGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(MyCGrammarParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(MyCGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(MyCGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(MyCGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(MyCGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(MyCGrammarParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(MyCGrammarParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(MyCGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(MyCGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(MyCGrammarParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(MyCGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(MyCGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(MyCGrammarParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_array}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_array(MyCGrammarParser.DirectDeclarator_arrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_pass}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_pass(MyCGrammarParser.DirectDeclarator_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directDeclarator_func}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator_func(MyCGrammarParser.DirectDeclarator_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(MyCGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(MyCGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(MyCGrammarParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(MyCGrammarParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(MyCGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(MyCGrammarParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(MyCGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(MyCGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MyCGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(MyCGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(MyCGrammarParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(MyCGrammarParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(MyCGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(MyCGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(MyCGrammarParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(MyCGrammarParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(MyCGrammarParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(MyCGrammarParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(MyCGrammarParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(MyCGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MyCGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(MyCGrammarParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MyCGrammarParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(MyCGrammarParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(MyCGrammarParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(MyCGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectionStatement_if}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement_if(MyCGrammarParser.SelectionStatement_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectionStatement_switch}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement_switch(MyCGrammarParser.SelectionStatement_switchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_while(MyCGrammarParser.IterationStatement_whileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_dowhile}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_dowhile(MyCGrammarParser.IterationStatement_dowhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_for(MyCGrammarParser.IterationStatement_forContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_forDeclared}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_forDeclared(MyCGrammarParser.IterationStatement_forDeclaredContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_goto}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_goto(MyCGrammarParser.JumpStatement_gotoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_continue(MyCGrammarParser.JumpStatement_continueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_break(MyCGrammarParser.JumpStatement_breakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_return(MyCGrammarParser.JumpStatement_returnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStatement_}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement_(MyCGrammarParser.JumpStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(MyCGrammarParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(MyCGrammarParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(MyCGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(MyCGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyCGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(MyCGrammarParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link MyCGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_(MyCGrammarParser.FunctionCall_Context ctx);
}