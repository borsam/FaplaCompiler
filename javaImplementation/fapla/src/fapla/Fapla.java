// Generated from Fapla.g4 by ANTLR 4.5.3
package fapla;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Fapla extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		StringConstant=1, RealConstant=2, RealConstantHex=3, RationalConstant=4, 
		BoolConstant=5, String=6, Real=7, Bool=8, Elseif=9, Else=10, Then=11, 
		If=12, Return=13, While=14, Module=15, Begin=16, End=17, Input=18, Output=19, 
		Write=20, Read=21, SemiColon=22, Comma=23, Colon=24, OParen=25, CParen=26, 
		OBrace=27, CBrace=28, Addition=29, Subtract=30, Multiply=31, Division=32, 
		Power=33, Factorial=34, AND=35, OR=36, NOT=37, XOR=38, NotEQ=39, LE=40, 
		GE=41, EQ=42, GT=43, LT=44, Mod=45, QuestionMark=46, Assign=47, Identifier=48, 
		Whitespace=49, Newline=50, BlockComment=51, LineComment=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Letter", 
		"Digit", "HexadecimalDigit", "Ld", "StringConstant", "RealConstant", "RealConstantHex", 
		"RationalConstant", "BoolConstant", "String", "Real", "Bool", "Elseif", 
		"Else", "Then", "If", "Return", "While", "Module", "Begin", "End", "Input", 
		"Output", "Write", "Read", "SemiColon", "Comma", "Colon", "OParen", "CParen", 
		"OBrace", "CBrace", "Addition", "Subtract", "Multiply", "Division", "Power", 
		"Factorial", "AND", "OR", "NOT", "XOR", "NotEQ", "LE", "GE", "EQ", "GT", 
		"LT", "Mod", "QuestionMark", "Assign", "Identifier", "Whitespace", "Newline", 
		"BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "';'", "','", 
		"':'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'!'", null, null, null, null, "'<>'", "'<='", "'>='", "'=='", "'>'", 
		"'<'", "'%'", "'?'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "StringConstant", "RealConstant", "RealConstantHex", "RationalConstant", 
		"BoolConstant", "String", "Real", "Bool", "Elseif", "Else", "Then", "If", 
		"Return", "While", "Module", "Begin", "End", "Input", "Output", "Write", 
		"Read", "SemiColon", "Comma", "Colon", "OParen", "CParen", "OBrace", "CBrace", 
		"Addition", "Subtract", "Multiply", "Division", "Power", "Factorial", 
		"AND", "OR", "NOT", "XOR", "NotEQ", "LE", "GE", "EQ", "GT", "LT", "Mod", 
		"QuestionMark", "Assign", "Identifier", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
	};
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


	public Fapla(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fapla.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0200\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u00e4"+
		"\n\37\3 \3 \6 \u00e8\n \r \16 \u00e9\5 \u00ec\n \3 \3 \3!\5!\u00f1\n!"+
		"\3!\6!\u00f4\n!\r!\16!\u00f5\3\"\3\"\3\"\6\"\u00fb\n\"\r\"\16\"\u00fc"+
		"\3#\5#\u0100\n#\3#\7#\u0103\n#\f#\16#\u0106\13#\3#\3#\6#\u010a\n#\r#\16"+
		"#\u010b\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0119\n$\3%\3%\3%\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B"+
		"\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I"+
		"\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\6P"+
		"\u01d7\nP\rP\16P\u01d8\3P\3P\3Q\3Q\5Q\u01df\nQ\3Q\5Q\u01e2\nQ\3Q\3Q\3"+
		"R\3R\3R\3R\3R\7R\u01eb\nR\fR\16R\u01ee\13R\3R\3R\3R\3R\3R\3R\3S\3S\3S"+
		"\3S\7S\u01fa\nS\fS\16S\u01fd\13S\3S\3S\3\u01ec\2T\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\3A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\rU"+
		"\16W\17Y\20[\21]\22_\23a\24c\25e\26g\27i\30k\31m\32o\33q\34s\35u\36w\37"+
		"y {!}\"\177#\u0081$\u0083%\u0085&\u0087\'\u0089(\u008b)\u008d*\u008f+"+
		"\u0091,\u0093-\u0095.\u0097/\u0099\60\u009b\61\u009d\62\u009f\63\u00a1"+
		"\64\u00a3\65\u00a5\66\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4"+
		"\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPp"+
		"p\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2"+
		"YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\5\2\62;CHch\4\2\f\f\17"+
		"\17\4\2--//\4\2\13\13\"\"\u01f1\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2"+
		"_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3"+
		"\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2"+
		"\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2"+
		"\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095"+
		"\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2"+
		"\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00a7"+
		"\3\2\2\2\5\u00a9\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00af\3\2"+
		"\2\2\r\u00b1\3\2\2\2\17\u00b3\3\2\2\2\21\u00b5\3\2\2\2\23\u00b7\3\2\2"+
		"\2\25\u00b9\3\2\2\2\27\u00bb\3\2\2\2\31\u00bd\3\2\2\2\33\u00bf\3\2\2\2"+
		"\35\u00c1\3\2\2\2\37\u00c3\3\2\2\2!\u00c5\3\2\2\2#\u00c7\3\2\2\2%\u00c9"+
		"\3\2\2\2\'\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2"+
		"/\u00d3\3\2\2\2\61\u00d5\3\2\2\2\63\u00d7\3\2\2\2\65\u00d9\3\2\2\2\67"+
		"\u00db\3\2\2\29\u00dd\3\2\2\2;\u00df\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2"+
		"\2\2A\u00f0\3\2\2\2C\u00f7\3\2\2\2E\u00ff\3\2\2\2G\u0118\3\2\2\2I\u011a"+
		"\3\2\2\2K\u0121\3\2\2\2M\u0126\3\2\2\2O\u012b\3\2\2\2Q\u0132\3\2\2\2S"+
		"\u0137\3\2\2\2U\u013c\3\2\2\2W\u013f\3\2\2\2Y\u0146\3\2\2\2[\u014c\3\2"+
		"\2\2]\u0153\3\2\2\2_\u0159\3\2\2\2a\u015d\3\2\2\2c\u0163\3\2\2\2e\u016a"+
		"\3\2\2\2g\u0170\3\2\2\2i\u0175\3\2\2\2k\u0177\3\2\2\2m\u0179\3\2\2\2o"+
		"\u017b\3\2\2\2q\u017d\3\2\2\2s\u017f\3\2\2\2u\u0181\3\2\2\2w\u0183\3\2"+
		"\2\2y\u0185\3\2\2\2{\u0187\3\2\2\2}\u0189\3\2\2\2\177\u018b\3\2\2\2\u0081"+
		"\u018d\3\2\2\2\u0083\u018f\3\2\2\2\u0085\u0193\3\2\2\2\u0087\u0196\3\2"+
		"\2\2\u0089\u019a\3\2\2\2\u008b\u019e\3\2\2\2\u008d\u01a1\3\2\2\2\u008f"+
		"\u01a4\3\2\2\2\u0091\u01a7\3\2\2\2\u0093\u01aa\3\2\2\2\u0095\u01ac\3\2"+
		"\2\2\u0097\u01ae\3\2\2\2\u0099\u01b0\3\2\2\2\u009b\u01b2\3\2\2\2\u009d"+
		"\u01b4\3\2\2\2\u009f\u01d6\3\2\2\2\u00a1\u01e1\3\2\2\2\u00a3\u01e5\3\2"+
		"\2\2\u00a5\u01f5\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\4\3\2\2\2\u00a9\u00aa"+
		"\t\3\2\2\u00aa\6\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac\b\3\2\2\2\u00ad\u00ae"+
		"\t\5\2\2\u00ae\n\3\2\2\2\u00af\u00b0\t\6\2\2\u00b0\f\3\2\2\2\u00b1\u00b2"+
		"\t\7\2\2\u00b2\16\3\2\2\2\u00b3\u00b4\t\b\2\2\u00b4\20\3\2\2\2\u00b5\u00b6"+
		"\t\t\2\2\u00b6\22\3\2\2\2\u00b7\u00b8\t\n\2\2\u00b8\24\3\2\2\2\u00b9\u00ba"+
		"\t\13\2\2\u00ba\26\3\2\2\2\u00bb\u00bc\t\f\2\2\u00bc\30\3\2\2\2\u00bd"+
		"\u00be\t\r\2\2\u00be\32\3\2\2\2\u00bf\u00c0\t\16\2\2\u00c0\34\3\2\2\2"+
		"\u00c1\u00c2\t\17\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\t\20\2\2\u00c4 \3\2"+
		"\2\2\u00c5\u00c6\t\21\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\t\22\2\2\u00c8$"+
		"\3\2\2\2\u00c9\u00ca\t\23\2\2\u00ca&\3\2\2\2\u00cb\u00cc\t\24\2\2\u00cc"+
		"(\3\2\2\2\u00cd\u00ce\t\25\2\2\u00ce*\3\2\2\2\u00cf\u00d0\t\26\2\2\u00d0"+
		",\3\2\2\2\u00d1\u00d2\t\27\2\2\u00d2.\3\2\2\2\u00d3\u00d4\t\30\2\2\u00d4"+
		"\60\3\2\2\2\u00d5\u00d6\t\31\2\2\u00d6\62\3\2\2\2\u00d7\u00d8\t\32\2\2"+
		"\u00d8\64\3\2\2\2\u00d9\u00da\t\33\2\2\u00da\66\3\2\2\2\u00db\u00dc\t"+
		"\34\2\2\u00dc8\3\2\2\2\u00dd\u00de\t\35\2\2\u00de:\3\2\2\2\u00df\u00e0"+
		"\t\36\2\2\u00e0<\3\2\2\2\u00e1\u00e4\5\67\34\2\u00e2\u00e4\59\35\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4>\3\2\2\2"+
		"\u00e5\u00eb\7$\2\2\u00e6\u00e8\n\37\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e7\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7$"+
		"\2\2\u00ee@\3\2\2\2\u00ef\u00f1\t \2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\59\35\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6B\3\2\2\2"+
		"\u00f7\u00f8\7\62\2\2\u00f8\u00fa\5\61\31\2\u00f9\u00fb\5;\36\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fdD\3\2\2\2\u00fe\u0100\t \2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0104\3\2\2\2\u0101\u0103\59\35\2\u0102\u0101\3\2\2\2\u0103"+
		"\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\60\2\2\u0108\u010a\59\35\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010cF\3\2\2\2\u010d\u010e\5)\25\2\u010e\u010f\5%\23\2\u010f\u0110"+
		"\5+\26\2\u0110\u0111\5\13\6\2\u0111\u0119\3\2\2\2\u0112\u0113\5\r\7\2"+
		"\u0113\u0114\5\3\2\2\u0114\u0115\5\31\r\2\u0115\u0116\5\'\24\2\u0116\u0117"+
		"\5\13\6\2\u0117\u0119\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u0112\3\2\2\2"+
		"\u0119H\3\2\2\2\u011a\u011b\5\'\24\2\u011b\u011c\5)\25\2\u011c\u011d\5"+
		"%\23\2\u011d\u011e\5\23\n\2\u011e\u011f\5\35\17\2\u011f\u0120\5\17\b\2"+
		"\u0120J\3\2\2\2\u0121\u0122\5%\23\2\u0122\u0123\5\13\6\2\u0123\u0124\5"+
		"\3\2\2\u0124\u0125\5\31\r\2\u0125L\3\2\2\2\u0126\u0127\5\5\3\2\u0127\u0128"+
		"\5\37\20\2\u0128\u0129\5\37\20\2\u0129\u012a\5\31\r\2\u012aN\3\2\2\2\u012b"+
		"\u012c\5\13\6\2\u012c\u012d\5\31\r\2\u012d\u012e\5\'\24\2\u012e\u012f"+
		"\5\13\6\2\u012f\u0130\5\23\n\2\u0130\u0131\5\r\7\2\u0131P\3\2\2\2\u0132"+
		"\u0133\5\13\6\2\u0133\u0134\5\31\r\2\u0134\u0135\5\'\24\2\u0135\u0136"+
		"\5\13\6\2\u0136R\3\2\2\2\u0137\u0138\5)\25\2\u0138\u0139\5\21\t\2\u0139"+
		"\u013a\5\13\6\2\u013a\u013b\5\35\17\2\u013bT\3\2\2\2\u013c\u013d\5\23"+
		"\n\2\u013d\u013e\5\r\7\2\u013eV\3\2\2\2\u013f\u0140\5%\23\2\u0140\u0141"+
		"\5\13\6\2\u0141\u0142\5)\25\2\u0142\u0143\5+\26\2\u0143\u0144\5%\23\2"+
		"\u0144\u0145\5\35\17\2\u0145X\3\2\2\2\u0146\u0147\5/\30\2\u0147\u0148"+
		"\5\21\t\2\u0148\u0149\5\23\n\2\u0149\u014a\5\31\r\2\u014a\u014b\5\13\6"+
		"\2\u014bZ\3\2\2\2\u014c\u014d\5\33\16\2\u014d\u014e\5\37\20\2\u014e\u014f"+
		"\5\t\5\2\u014f\u0150\5+\26\2\u0150\u0151\5\31\r\2\u0151\u0152\5\13\6\2"+
		"\u0152\\\3\2\2\2\u0153\u0154\5\5\3\2\u0154\u0155\5\13\6\2\u0155\u0156"+
		"\5\17\b\2\u0156\u0157\5\23\n\2\u0157\u0158\5\35\17\2\u0158^\3\2\2\2\u0159"+
		"\u015a\5\13\6\2\u015a\u015b\5\35\17\2\u015b\u015c\5\t\5\2\u015c`\3\2\2"+
		"\2\u015d\u015e\5\23\n\2\u015e\u015f\5\35\17\2\u015f\u0160\5!\21\2\u0160"+
		"\u0161\5+\26\2\u0161\u0162\5)\25\2\u0162b\3\2\2\2\u0163\u0164\5\37\20"+
		"\2\u0164\u0165\5+\26\2\u0165\u0166\5)\25\2\u0166\u0167\5!\21\2\u0167\u0168"+
		"\5+\26\2\u0168\u0169\5)\25\2\u0169d\3\2\2\2\u016a\u016b\5/\30\2\u016b"+
		"\u016c\5%\23\2\u016c\u016d\5\23\n\2\u016d\u016e\5)\25\2\u016e\u016f\5"+
		"\13\6\2\u016ff\3\2\2\2\u0170\u0171\5%\23\2\u0171\u0172\5\13\6\2\u0172"+
		"\u0173\5\3\2\2\u0173\u0174\5\t\5\2\u0174h\3\2\2\2\u0175\u0176\7=\2\2\u0176"+
		"j\3\2\2\2\u0177\u0178\7.\2\2\u0178l\3\2\2\2\u0179\u017a\7<\2\2\u017an"+
		"\3\2\2\2\u017b\u017c\7*\2\2\u017cp\3\2\2\2\u017d\u017e\7+\2\2\u017er\3"+
		"\2\2\2\u017f\u0180\7}\2\2\u0180t\3\2\2\2\u0181\u0182\7\177\2\2\u0182v"+
		"\3\2\2\2\u0183\u0184\7-\2\2\u0184x\3\2\2\2\u0185\u0186\7/\2\2\u0186z\3"+
		"\2\2\2\u0187\u0188\7,\2\2\u0188|\3\2\2\2\u0189\u018a\7\61\2\2\u018a~\3"+
		"\2\2\2\u018b\u018c\7`\2\2\u018c\u0080\3\2\2\2\u018d\u018e\7#\2\2\u018e"+
		"\u0082\3\2\2\2\u018f\u0190\5\3\2\2\u0190\u0191\5\35\17\2\u0191\u0192\5"+
		"\t\5\2\u0192\u0084\3\2\2\2\u0193\u0194\5\37\20\2\u0194\u0195\5%\23\2\u0195"+
		"\u0086\3\2\2\2\u0196\u0197\5\35\17\2\u0197\u0198\5\37\20\2\u0198\u0199"+
		"\5)\25\2\u0199\u0088\3\2\2\2\u019a\u019b\5\61\31\2\u019b\u019c\5\37\20"+
		"\2\u019c\u019d\5%\23\2\u019d\u008a\3\2\2\2\u019e\u019f\7>\2\2\u019f\u01a0"+
		"\7@\2\2\u01a0\u008c\3\2\2\2\u01a1\u01a2\7>\2\2\u01a2\u01a3\7?\2\2\u01a3"+
		"\u008e\3\2\2\2\u01a4\u01a5\7@\2\2\u01a5\u01a6\7?\2\2\u01a6\u0090\3\2\2"+
		"\2\u01a7\u01a8\7?\2\2\u01a8\u01a9\7?\2\2\u01a9\u0092\3\2\2\2\u01aa\u01ab"+
		"\7@\2\2\u01ab\u0094\3\2\2\2\u01ac\u01ad\7>\2\2\u01ad\u0096\3\2\2\2\u01ae"+
		"\u01af\7\'\2\2\u01af\u0098\3\2\2\2\u01b0\u01b1\7A\2\2\u01b1\u009a\3\2"+
		"\2\2\u01b2\u01b3\7?\2\2\u01b3\u009c\3\2\2\2\u01b4\u01b5\5\67\34\2\u01b5"+
		"\u01b6\5=\37\2\u01b6\u01b7\5=\37\2\u01b7\u01b8\5=\37\2\u01b8\u01b9\5="+
		"\37\2\u01b9\u01ba\5=\37\2\u01ba\u01bb\5=\37\2\u01bb\u01bc\5=\37\2\u01bc"+
		"\u01bd\5=\37\2\u01bd\u01be\5=\37\2\u01be\u01bf\5=\37\2\u01bf\u01c0\5="+
		"\37\2\u01c0\u01c1\5=\37\2\u01c1\u01c2\5=\37\2\u01c2\u01c3\5=\37\2\u01c3"+
		"\u01c4\5=\37\2\u01c4\u01c5\5=\37\2\u01c5\u01c6\5=\37\2\u01c6\u01c7\5="+
		"\37\2\u01c7\u01c8\5=\37\2\u01c8\u01c9\5=\37\2\u01c9\u01ca\5=\37\2\u01ca"+
		"\u01cb\5=\37\2\u01cb\u01cc\5=\37\2\u01cc\u01cd\5=\37\2\u01cd\u01ce\5="+
		"\37\2\u01ce\u01cf\5=\37\2\u01cf\u01d0\5=\37\2\u01d0\u01d1\5=\37\2\u01d1"+
		"\u01d2\5=\37\2\u01d2\u01d3\5=\37\2\u01d3\u01d4\5=\37\2\u01d4\u009e\3\2"+
		"\2\2\u01d5\u01d7\t!\2\2\u01d6\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\bP"+
		"\2\2\u01db\u00a0\3\2\2\2\u01dc\u01de\7\17\2\2\u01dd\u01df\7\f\2\2\u01de"+
		"\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01e2\7\f"+
		"\2\2\u01e1\u01dc\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e4\bQ\2\2\u01e4\u00a2\3\2\2\2\u01e5\u01e6\7\'\2\2\u01e6\u01e7\7\'"+
		"\2\2\u01e7\u01e8\7\'\2\2\u01e8\u01ec\3\2\2\2\u01e9\u01eb\13\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7\'\2\2\u01f0"+
		"\u01f1\7\'\2\2\u01f1\u01f2\7\'\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\bR"+
		"\2\2\u01f4\u00a4\3\2\2\2\u01f5\u01f6\7\'\2\2\u01f6\u01f7\7\'\2\2\u01f7"+
		"\u01fb\3\2\2\2\u01f8\u01fa\n\37\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fd\3"+
		"\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\bS\2\2\u01ff\u00a6\3\2\2\2\22\2\u00e3\u00e9"+
		"\u00eb\u00f0\u00f5\u00fc\u00ff\u0104\u010b\u0118\u01d8\u01de\u01e1\u01ec"+
		"\u01fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}