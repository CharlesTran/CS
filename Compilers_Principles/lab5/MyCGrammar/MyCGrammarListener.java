// Generated from .\MyCGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyCGrammarParser}.
 */
public interface MyCGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MyCGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MyCGrammarParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#tokenId}.
	 * @param ctx the parse tree
	 */
	void enterTokenId(MyCGrammarParser.TokenIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#tokenId}.
	 * @param ctx the parse tree
	 */
	void exitTokenId(MyCGrammarParser.TokenIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#tokenConstant}.
	 * @param ctx the parse tree
	 */
	void enterTokenConstant(MyCGrammarParser.TokenConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#tokenConstant}.
	 * @param ctx the parse tree
	 */
	void exitTokenConstant(MyCGrammarParser.TokenConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#tokenStringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTokenStringLiteral(MyCGrammarParser.TokenStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#tokenStringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTokenStringLiteral(MyCGrammarParser.TokenStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(MyCGrammarParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(MyCGrammarParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(MyCGrammarParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(MyCGrammarParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(MyCGrammarParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(MyCGrammarParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_arrayaccess}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_arrayaccess(MyCGrammarParser.PostfixExpression_arrayaccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_arrayaccess}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_arrayaccess(MyCGrammarParser.PostfixExpression_arrayaccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_point}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_point(MyCGrammarParser.PostfixExpression_pointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_point}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_point(MyCGrammarParser.PostfixExpression_pointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_funcall}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_funcall(MyCGrammarParser.PostfixExpression_funcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_funcall}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_funcall(MyCGrammarParser.PostfixExpression_funcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_pass(MyCGrammarParser.PostfixExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_pass(MyCGrammarParser.PostfixExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_member}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_member(MyCGrammarParser.PostfixExpression_memberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_member}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_member(MyCGrammarParser.PostfixExpression_memberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_(MyCGrammarParser.PostfixExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link MyCGrammarParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_(MyCGrammarParser.PostfixExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(MyCGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(MyCGrammarParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_pass(MyCGrammarParser.UnaryExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_pass(MyCGrammarParser.UnaryExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_(MyCGrammarParser.UnaryExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link MyCGrammarParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_(MyCGrammarParser.UnaryExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(MyCGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(MyCGrammarParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression_pass(MyCGrammarParser.CastExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression_pass(MyCGrammarParser.CastExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression_(MyCGrammarParser.CastExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link MyCGrammarParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression_(MyCGrammarParser.CastExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_(MyCGrammarParser.MultiplicativeExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_(MyCGrammarParser.MultiplicativeExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_pass(MyCGrammarParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_pass(MyCGrammarParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_pass(MyCGrammarParser.AdditiveExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_pass(MyCGrammarParser.AdditiveExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_(MyCGrammarParser.AdditiveExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link MyCGrammarParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_(MyCGrammarParser.AdditiveExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression_}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression_(MyCGrammarParser.ShiftExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression_}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression_(MyCGrammarParser.ShiftExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression_pass(MyCGrammarParser.ShiftExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression_pass(MyCGrammarParser.ShiftExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_pass(MyCGrammarParser.RelationalExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_pass(MyCGrammarParser.RelationalExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_(MyCGrammarParser.RelationalExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link MyCGrammarParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_(MyCGrammarParser.RelationalExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_pass(MyCGrammarParser.EqualityExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_pass(MyCGrammarParser.EqualityExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_(MyCGrammarParser.EqualityExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link MyCGrammarParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_(MyCGrammarParser.EqualityExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression_pass(MyCGrammarParser.AndExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression_pass(MyCGrammarParser.AndExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression_}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression_(MyCGrammarParser.AndExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression_}
	 * labeled alternative in {@link MyCGrammarParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression_(MyCGrammarParser.AndExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression_(MyCGrammarParser.ExclusiveOrExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression_(MyCGrammarParser.ExclusiveOrExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code exclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression_pass(MyCGrammarParser.ExclusiveOrExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression_pass(MyCGrammarParser.ExclusiveOrExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression_pass(MyCGrammarParser.InclusiveOrExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression_pass(MyCGrammarParser.InclusiveOrExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression_(MyCGrammarParser.InclusiveOrExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inclusiveOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression_(MyCGrammarParser.InclusiveOrExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression_pass(MyCGrammarParser.LogicalAndExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression_pass(MyCGrammarParser.LogicalAndExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalAndExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression_(MyCGrammarParser.LogicalAndExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalAndExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression_(MyCGrammarParser.LogicalAndExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression_(MyCGrammarParser.LogicalOrExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression_}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression_(MyCGrammarParser.LogicalOrExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression_pass(MyCGrammarParser.LogicalOrExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalOrExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression_pass(MyCGrammarParser.LogicalOrExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(MyCGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(MyCGrammarParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression_pass(MyCGrammarParser.AssignmentExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression_pass(MyCGrammarParser.AssignmentExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression_(MyCGrammarParser.AssignmentExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link MyCGrammarParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression_(MyCGrammarParser.AssignmentExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(MyCGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(MyCGrammarParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_(MyCGrammarParser.Expression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_(MyCGrammarParser.Expression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code expression_pass}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_pass(MyCGrammarParser.Expression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression_pass}
	 * labeled alternative in {@link MyCGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_pass(MyCGrammarParser.Expression_passContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(MyCGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(MyCGrammarParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyCGrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyCGrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(MyCGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(MyCGrammarParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(MyCGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(MyCGrammarParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(MyCGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(MyCGrammarParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(MyCGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(MyCGrammarParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(MyCGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(MyCGrammarParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(MyCGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(MyCGrammarParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSpecifier_}
	 * labeled alternative in {@link MyCGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier_(MyCGrammarParser.TypeSpecifier_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSpecifier_}
	 * labeled alternative in {@link MyCGrammarParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier_(MyCGrammarParser.TypeSpecifier_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(MyCGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(MyCGrammarParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(MyCGrammarParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(MyCGrammarParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(MyCGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(MyCGrammarParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(MyCGrammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(MyCGrammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(MyCGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(MyCGrammarParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(MyCGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(MyCGrammarParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(MyCGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(MyCGrammarParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(MyCGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(MyCGrammarParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(MyCGrammarParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(MyCGrammarParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(MyCGrammarParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(MyCGrammarParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(MyCGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(MyCGrammarParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(MyCGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(MyCGrammarParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(MyCGrammarParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(MyCGrammarParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(MyCGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(MyCGrammarParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(MyCGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(MyCGrammarParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MyCGrammarParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MyCGrammarParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_array}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_array(MyCGrammarParser.DirectDeclarator_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_array}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_array(MyCGrammarParser.DirectDeclarator_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_pass}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_pass(MyCGrammarParser.DirectDeclarator_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_pass}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_pass(MyCGrammarParser.DirectDeclarator_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code directDeclarator_func}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator_func(MyCGrammarParser.DirectDeclarator_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code directDeclarator_func}
	 * labeled alternative in {@link MyCGrammarParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator_func(MyCGrammarParser.DirectDeclarator_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(MyCGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(MyCGrammarParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(MyCGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(MyCGrammarParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(MyCGrammarParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(MyCGrammarParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(MyCGrammarParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(MyCGrammarParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(MyCGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(MyCGrammarParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(MyCGrammarParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(MyCGrammarParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(MyCGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(MyCGrammarParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(MyCGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(MyCGrammarParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MyCGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MyCGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(MyCGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(MyCGrammarParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MyCGrammarParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MyCGrammarParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(MyCGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(MyCGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(MyCGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(MyCGrammarParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(MyCGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(MyCGrammarParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(MyCGrammarParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(MyCGrammarParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(MyCGrammarParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(MyCGrammarParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(MyCGrammarParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(MyCGrammarParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(MyCGrammarParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(MyCGrammarParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(MyCGrammarParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(MyCGrammarParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(MyCGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(MyCGrammarParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyCGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyCGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(MyCGrammarParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(MyCGrammarParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MyCGrammarParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MyCGrammarParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(MyCGrammarParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(MyCGrammarParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(MyCGrammarParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(MyCGrammarParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MyCGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MyCGrammarParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectionStatement_if}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement_if(MyCGrammarParser.SelectionStatement_ifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectionStatement_if}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement_if(MyCGrammarParser.SelectionStatement_ifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectionStatement_switch}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement_switch(MyCGrammarParser.SelectionStatement_switchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectionStatement_switch}
	 * labeled alternative in {@link MyCGrammarParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement_switch(MyCGrammarParser.SelectionStatement_switchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_while(MyCGrammarParser.IterationStatement_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_while}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_while(MyCGrammarParser.IterationStatement_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_dowhile}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_dowhile(MyCGrammarParser.IterationStatement_dowhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_dowhile}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_dowhile(MyCGrammarParser.IterationStatement_dowhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_for(MyCGrammarParser.IterationStatement_forContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_for}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_for(MyCGrammarParser.IterationStatement_forContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_forDeclared}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_forDeclared(MyCGrammarParser.IterationStatement_forDeclaredContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_forDeclared}
	 * labeled alternative in {@link MyCGrammarParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_forDeclared(MyCGrammarParser.IterationStatement_forDeclaredContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_goto}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_goto(MyCGrammarParser.JumpStatement_gotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_goto}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_goto(MyCGrammarParser.JumpStatement_gotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_continue(MyCGrammarParser.JumpStatement_continueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_continue}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_continue(MyCGrammarParser.JumpStatement_continueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_break(MyCGrammarParser.JumpStatement_breakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_break}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_break(MyCGrammarParser.JumpStatement_breakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_return(MyCGrammarParser.JumpStatement_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_return}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_return(MyCGrammarParser.JumpStatement_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStatement_}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement_(MyCGrammarParser.JumpStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStatement_}
	 * labeled alternative in {@link MyCGrammarParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement_(MyCGrammarParser.JumpStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MyCGrammarParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MyCGrammarParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(MyCGrammarParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(MyCGrammarParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(MyCGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(MyCGrammarParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(MyCGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(MyCGrammarParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyCGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(MyCGrammarParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyCGrammarParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(MyCGrammarParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link MyCGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall_(MyCGrammarParser.FunctionCall_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link MyCGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall_(MyCGrammarParser.FunctionCall_Context ctx);
}