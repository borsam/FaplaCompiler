package fapla;// Generated from Fapla.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FaplaParser}.
 */
public interface FaplaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FaplaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(FaplaParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(FaplaParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(FaplaParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(FaplaParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(FaplaParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(FaplaParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(FaplaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(FaplaParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(FaplaParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(FaplaParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(FaplaParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(FaplaParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#logicalXorExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalXorExpression(FaplaParser.LogicalXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#logicalXorExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalXorExpression(FaplaParser.LogicalXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(FaplaParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(FaplaParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(FaplaParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(FaplaParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(FaplaParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(FaplaParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FaplaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FaplaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#startState}.
	 * @param ctx the parse tree
	 */
	void enterStartState(FaplaParser.StartStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#startState}.
	 * @param ctx the parse tree
	 */
	void exitStartState(FaplaParser.StartStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FaplaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FaplaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FaplaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FaplaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(FaplaParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(FaplaParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(FaplaParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(FaplaParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(FaplaParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(FaplaParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(FaplaParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(FaplaParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(FaplaParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(FaplaParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(FaplaParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(FaplaParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(FaplaParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(FaplaParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(FaplaParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(FaplaParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(FaplaParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(FaplaParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(FaplaParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(FaplaParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#mainModuleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMainModuleDefinition(FaplaParser.MainModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#mainModuleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMainModuleDefinition(FaplaParser.MainModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(FaplaParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(FaplaParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(FaplaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(FaplaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(FaplaParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(FaplaParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void enterParametersList(FaplaParser.ParametersListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#parametersList}.
	 * @param ctx the parse tree
	 */
	void exitParametersList(FaplaParser.ParametersListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FaplaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FaplaParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FaplaParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FaplaParser.ParameterContext ctx);
}