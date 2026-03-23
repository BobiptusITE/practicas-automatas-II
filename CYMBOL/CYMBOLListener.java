// Generated from CYMBOL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CYMBOLParser}.
 */
public interface CYMBOLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CYMBOLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CYMBOLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CYMBOLParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CYMBOLParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CYMBOLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CYMBOLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CYMBOLParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CYMBOLParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CYMBOLParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CYMBOLParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CYMBOLParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CYMBOLParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CYMBOLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CYMBOLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CYMBOLParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CYMBOLParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CYMBOLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CYMBOLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CYMBOLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CYMBOLParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CYMBOLParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CYMBOLParser.ExprListContext ctx);
}