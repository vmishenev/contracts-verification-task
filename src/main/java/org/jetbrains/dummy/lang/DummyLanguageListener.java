// Generated from org/jetbrains/dummy/lang/DummyLanguage.g4 by ANTLR 4.7.2

package org.jetbrains.dummy.lang;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DummyLanguageParser}.
 */
public interface DummyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DummyLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DummyLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(DummyLanguageParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(DummyLanguageParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DummyLanguageParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DummyLanguageParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DummyLanguageParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DummyLanguageParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(DummyLanguageParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(DummyLanguageParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(DummyLanguageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(DummyLanguageParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DummyLanguageParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DummyLanguageParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(DummyLanguageParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(DummyLanguageParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(DummyLanguageParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(DummyLanguageParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DummyLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DummyLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DummyLanguageParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(DummyLanguageParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DummyLanguageParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(DummyLanguageParser.Func_callContext ctx);
}