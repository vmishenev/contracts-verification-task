// Generated from org/jetbrains/dummy/lang/DummyLanguage.g4 by ANTLR 4.7.2

package org.jetbrains.dummy.lang;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DummyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, IF=2, ELSE=3, TRUE=4, FALSE=5, BEGIN=6, END=7, FUN=8, ID=9, NUMBER=10, 
		DIGIT=11, WS=12, SINGLE_COMMENT=13, MULTI_COMMENT=14, SEMICOLON=15, LEFT_BR=16, 
		RIGHT_BR=17, ASSIGN=18, COMMA=19, RETURN=20;
	public static final int
		RULE_prog = 0, RULE_func_def = 1, RULE_block = 2, RULE_stat = 3, RULE_return_statement = 4, 
		RULE_if_statement = 5, RULE_assign = 6, RULE_var_def = 7, RULE_func = 8, 
		RULE_expr = 9, RULE_func_call = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "func_def", "block", "stat", "return_statement", "if_statement", 
			"assign", "var_def", "func", "expr", "func_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'if'", "'else'", "'true'", "'false'", "'{'", "'}'", "'fun'", 
			null, null, null, null, null, null, "';'", "'('", "')'", "'='", "','", 
			"'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR", "IF", "ELSE", "TRUE", "FALSE", "BEGIN", "END", "FUN", "ID", 
			"NUMBER", "DIGIT", "WS", "SINGLE_COMMENT", "MULTI_COMMENT", "SEMICOLON", 
			"LEFT_BR", "RIGHT_BR", "ASSIGN", "COMMA", "RETURN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DummyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DummyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUN) {
				{
				{
				setState(22);
				func_def();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(DummyLanguageParser.FUN, 0); }
		public List<TerminalNode> ID() { return getTokens(DummyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DummyLanguageParser.ID, i);
		}
		public TerminalNode LEFT_BR() { return getToken(DummyLanguageParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(DummyLanguageParser.RIGHT_BR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DummyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DummyLanguageParser.COMMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitFunc_def(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(FUN);
			setState(29);
			match(ID);
			setState(30);
			match(LEFT_BR);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(31);
				match(ID);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(32);
					match(COMMA);
					setState(33);
					match(ID);
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(41);
			match(RIGHT_BR);
			setState(42);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(DummyLanguageParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(DummyLanguageParser.END, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(BEGIN);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMBER) | (1L << RETURN))) != 0)) {
				{
				{
				setState(45);
				stat();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DummyLanguageParser.SEMICOLON, 0); }
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				var_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				expr();
				setState(56);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				if_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				return_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(DummyLanguageParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(DummyLanguageParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(RETURN);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(63);
				expr();
				}
			}

			setState(66);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(DummyLanguageParser.IF, 0); }
		public TerminalNode LEFT_BR() { return getToken(DummyLanguageParser.LEFT_BR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_BR() { return getToken(DummyLanguageParser.RIGHT_BR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(DummyLanguageParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(IF);
			setState(69);
			match(LEFT_BR);
			setState(70);
			expr();
			setState(71);
			match(RIGHT_BR);
			setState(72);
			block();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(73);
				match(ELSE);
				setState(74);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DummyLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(DummyLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(DummyLanguageParser.SEMICOLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ID);
			setState(78);
			match(ASSIGN);
			setState(79);
			expr();
			setState(80);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DummyLanguageParser.VAR, 0); }
		public TerminalNode ID() { return getToken(DummyLanguageParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DummyLanguageParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(DummyLanguageParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitVar_def(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VAR);
			setState(83);
			match(ID);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(84);
				match(ASSIGN);
				setState(85);
				expr();
				}
			}

			setState(88);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DummyLanguageParser.ID, 0); }
		public TerminalNode LEFT_BR() { return getToken(DummyLanguageParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(DummyLanguageParser.RIGHT_BR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DummyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DummyLanguageParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(LEFT_BR);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(92);
				expr();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(93);
					match(COMMA);
					setState(94);
					expr();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode ID() { return getToken(DummyLanguageParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(DummyLanguageParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(DummyLanguageParser.FALSE, 0); }
		public TerminalNode NUMBER() { return getToken(DummyLanguageParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				func_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(TRUE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(NUMBER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DummyLanguageParser.ID, 0); }
		public TerminalNode LEFT_BR() { return getToken(DummyLanguageParser.LEFT_BR, 0); }
		public TerminalNode RIGHT_BR() { return getToken(DummyLanguageParser.RIGHT_BR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DummyLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DummyLanguageParser.COMMA, i);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DummyLanguageListener ) ((DummyLanguageListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(ID);
			setState(112);
			match(LEFT_BR);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(113);
				expr();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(114);
					match(COMMA);
					setState(115);
					expr();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(123);
			match(RIGHT_BR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\u0080\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3%\n\3\f\3\16\3(\13\3\5\3*\n\3\3\3\3\3\3\3\3\4\3\4\7\4\61\n\4\f\4\16"+
		"\4\64\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\5\6C\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\5\tY\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\n"+
		"e\13\n\5\ng\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13p\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\5\f|\n\f\3\f\3\f\3\f\2\2\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\2\2\u0087\2\33\3\2\2\2\4\36\3\2\2\2\6.\3\2\2\2\b"+
		">\3\2\2\2\n@\3\2\2\2\fF\3\2\2\2\16O\3\2\2\2\20T\3\2\2\2\22\\\3\2\2\2\24"+
		"o\3\2\2\2\26q\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\7\n\2\2\37 \7"+
		"\13\2\2 )\7\22\2\2!&\7\13\2\2\"#\7\25\2\2#%\7\13\2\2$\"\3\2\2\2%(\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2\2\2(&\3\2\2\2)!\3\2\2\2)*\3\2\2\2*+\3"+
		"\2\2\2+,\7\23\2\2,-\5\6\4\2-\5\3\2\2\2.\62\7\b\2\2/\61\5\b\5\2\60/\3\2"+
		"\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2"+
		"\2\2\65\66\7\t\2\2\66\7\3\2\2\2\67?\5\20\t\28?\5\16\b\29:\5\24\13\2:;"+
		"\7\21\2\2;?\3\2\2\2<?\5\f\7\2=?\5\n\6\2>\67\3\2\2\2>8\3\2\2\2>9\3\2\2"+
		"\2><\3\2\2\2>=\3\2\2\2?\t\3\2\2\2@B\7\26\2\2AC\5\24\13\2BA\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DE\7\21\2\2E\13\3\2\2\2FG\7\4\2\2GH\7\22\2\2HI\5\24\13"+
		"\2IJ\7\23\2\2JM\5\6\4\2KL\7\5\2\2LN\5\6\4\2MK\3\2\2\2MN\3\2\2\2N\r\3\2"+
		"\2\2OP\7\13\2\2PQ\7\24\2\2QR\5\24\13\2RS\7\21\2\2S\17\3\2\2\2TU\7\3\2"+
		"\2UX\7\13\2\2VW\7\24\2\2WY\5\24\13\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7"+
		"\21\2\2[\21\3\2\2\2\\]\7\13\2\2]f\7\22\2\2^c\5\24\13\2_`\7\25\2\2`b\5"+
		"\24\13\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2f"+
		"^\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\23\2\2i\23\3\2\2\2jp\5\26\f\2kp\7\13"+
		"\2\2lp\7\6\2\2mp\7\7\2\2np\7\f\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2"+
		"\2\2on\3\2\2\2p\25\3\2\2\2qr\7\13\2\2r{\7\22\2\2sx\5\24\13\2tu\7\25\2"+
		"\2uw\5\24\13\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2"+
		"\2\2{s\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\23\2\2~\27\3\2\2\2\17\33&)\62>"+
		"BMXcfox{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}