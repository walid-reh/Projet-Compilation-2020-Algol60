package ALGOL60.grammar;// $ANTLR null /home/walid/Bureau/COMPILATION/tester-file/Algol60.g 2020-04-26 18:10:05

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class Algol60Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int ARRAY_ACCESS=4;
	public static final int ARRAY_BOUNDS=5;
	public static final int ARRAY_DECLARATION=6;
	public static final int ARRAY_DIMENSION=7;
	public static final int ARRAY_ID=8;
	public static final int ARRAY_SEGMENT=9;
	public static final int ASSIGNMENT=10;
	public static final int BEGIN=11;
	public static final int BLOCK=12;
	public static final int BOUNDS=13;
	public static final int COMMENT=14;
	public static final int DECLARATIONS=15;
	public static final int DO=16;
	public static final int ELSE=17;
	public static final int EMPTY_STATEMENT=18;
	public static final int ESC_SEQ=19;
	public static final int EXPONENT=20;
	public static final int FOR=21;
	public static final int FOR_ELEMENT=22;
	public static final int FOR_LIST=23;
	public static final int FUNCTION_CALL=24;
	public static final int GOTO=25;
	public static final int IF=26;
	public static final int INDEX=27;
	public static final int INT=28;
	public static final int Identifier=29;
	public static final int LABEL=30;
	public static final int LABELLED_BLOCK=31;
	public static final int LABELLED_EMPTY_STATEMENT=32;
	public static final int LABELLED_STATEMENT=33;
	public static final int LABELLIST=34;
	public static final int LISTPARAMETER=35;
	public static final int LOCAL_DECLARATION=36;
	public static final int Letter=37;
	public static final int Number=38;
	public static final int OCTAL_ESC=39;
	public static final int OWN_DECLARATION=40;
	public static final int PROC_DECLARATION=41;
	public static final int PROG=42;
	public static final int SPECIFICATION=43;
	public static final int SPECIFIED_ID=44;
	public static final int STATEMENTS=45;
	public static final int STEP=46;
	public static final int STRING=47;
	public static final int SWITCH_CALL=48;
	public static final int SWITCH_CASE=49;
	public static final int SWITCH_DECLARATION=50;
	public static final int SWITCH_LIST=51;
	public static final int THEN=52;
	public static final int UNTIL=53;
	public static final int VALUE=54;
	public static final int VAR_ID=55;
	public static final int WHILE=56;
	public static final int WS=57;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Algol60Lexer() {} 
	public Algol60Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Algol60Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/walid/Bureau/COMPILATION/tester-file/Algol60.g"; }

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:7:7: ( '(' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:8:7: ( ')' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:9:7: ( '*' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:10:7: ( '**' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:10:9: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:11:7: ( '+' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:11:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:12:7: ( ',' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:13:7: ( '-' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:13:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:14:7: ( '/' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:14:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:15:7: ( '//' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:15:9: '//'
			{
			match("//"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:16:7: ( ':' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:16:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:17:7: ( ':=' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:17:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:18:7: ( ';' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:18:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:19:7: ( '<' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:19:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:20:7: ( '<=' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:20:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:21:7: ( '<=>' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:21:9: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:22:7: ( '<>' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:22:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:23:7: ( '=' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:23:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:24:7: ( '=>' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:24:9: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:25:7: ( '>' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:25:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:26:7: ( '>=' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:26:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:27:7: ( 'AND' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:27:9: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:28:7: ( 'OR' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:28:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:29:7: ( '[' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:29:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:30:7: ( ']' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:30:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:31:7: ( 'array' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:31:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:32:7: ( 'begin' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:32:9: 'begin'
			{
			match("begin"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:33:7: ( 'boolean' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:33:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:34:7: ( 'do' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:34:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:35:7: ( 'else' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:35:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:36:7: ( 'end' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:36:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:37:7: ( 'false' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:37:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:38:7: ( 'for' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:38:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:39:7: ( 'goto' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:39:9: 'goto'
			{
			match("goto"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:40:7: ( 'if' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:40:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:41:7: ( 'integer' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:41:9: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:42:7: ( 'label' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:42:9: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:43:7: ( 'own' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:43:9: 'own'
			{
			match("own"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:44:7: ( 'procedure' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:44:9: 'procedure'
			{
			match("procedure"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:45:7: ( 'real' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:45:9: 'real'
			{
			match("real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:46:7: ( 'step' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:46:9: 'step'
			{
			match("step"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:47:7: ( 'string' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:47:9: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:48:7: ( 'switch' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:48:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:49:8: ( 'then' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:49:10: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:50:8: ( 'true' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:50:10: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:51:8: ( 'until' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:51:10: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:52:8: ( 'value' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:52:10: 'value'
			{
			match("value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:53:8: ( 'while' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:53:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:54:8: ( '~' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:54:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:528:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:528:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:528:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:528:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:528:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:534:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OCTAL_ESC )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\\') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='\"'||LA2_1=='\''||LA2_1=='\\'||LA2_1=='b'||LA2_1=='f'||LA2_1=='n'||LA2_1=='r'||LA2_1=='t') ) {
					alt2=1;
				}
				else if ( ((LA2_1 >= '0' && LA2_1 <= '7')) ) {
					alt2=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:534:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:535:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:540:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\\') ) {
				int LA3_1 = input.LA(2);
				if ( ((LA3_1 >= '0' && LA3_1 <= '3')) ) {
					int LA3_2 = input.LA(3);
					if ( ((LA3_2 >= '0' && LA3_2 <= '7')) ) {
						int LA3_4 = input.LA(4);
						if ( ((LA3_4 >= '0' && LA3_4 <= '7')) ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						alt3=3;
					}

				}
				else if ( ((LA3_1 >= '4' && LA3_1 <= '7')) ) {
					int LA3_3 = input.LA(3);
					if ( ((LA3_3 >= '0' && LA3_3 <= '7')) ) {
						alt3=2;
					}

					else {
						alt3=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:540:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:541:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:542:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:547:2: ( Letter ( Letter | ( '0' .. '9' ) )* )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:547:8: Letter ( Letter | ( '0' .. '9' ) )*
			{
			mLetter(); 

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:547:14: ( Letter | ( '0' .. '9' ) )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:553:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:557:5: ( INT '.' ( '0' .. '9' )* ( EXPONENT )? | '.' INT ( EXPONENT )? | INT ( EXPONENT )? )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:557:9: INT '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					mINT(); 

					match('.'); 
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:557:17: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:557:29: ( EXPONENT )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='E'||LA6_0=='e') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:557:29: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:558:9: '.' INT ( EXPONENT )?
					{
					match('.'); 
					mINT(); 

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:558:17: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:558:17: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:559:9: INT ( EXPONENT )?
					{
					mINT(); 

					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:559:13: ( EXPONENT )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:559:13: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:564:6: ( ( '0' .. '9' )+ )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:564:8: ( '0' .. '9' )+
			{
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:564:8: ( '0' .. '9' )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:568:10: ( ( 'e' | 'E' ) ( '+' | '-' )? INT )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:568:12: ( 'e' | 'E' ) ( '+' | '-' )? INT
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:568:22: ( '+' | '-' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='+'||LA11_0=='-') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:572:5: ( 'comment' (~ ( ';' ) )* ';' )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:572:9: 'comment' (~ ( ';' ) )* ';'
			{
			match("comment"); 

			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:572:19: (~ ( ';' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= ':')||(LA12_0 >= '<' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= ':')||(input.LA(1) >= '<' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			match(';'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:576:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:576:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:8: ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | STRING | Identifier | Number | COMMENT | WS )
		int alt13=53;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:10: T__58
				{
				mT__58(); 

				}
				break;
			case 2 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:16: T__59
				{
				mT__59(); 

				}
				break;
			case 3 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:22: T__60
				{
				mT__60(); 

				}
				break;
			case 4 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:28: T__61
				{
				mT__61(); 

				}
				break;
			case 5 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:34: T__62
				{
				mT__62(); 

				}
				break;
			case 6 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:40: T__63
				{
				mT__63(); 

				}
				break;
			case 7 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:46: T__64
				{
				mT__64(); 

				}
				break;
			case 8 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:52: T__65
				{
				mT__65(); 

				}
				break;
			case 9 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:58: T__66
				{
				mT__66(); 

				}
				break;
			case 10 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:64: T__67
				{
				mT__67(); 

				}
				break;
			case 11 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:70: T__68
				{
				mT__68(); 

				}
				break;
			case 12 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:76: T__69
				{
				mT__69(); 

				}
				break;
			case 13 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:82: T__70
				{
				mT__70(); 

				}
				break;
			case 14 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:88: T__71
				{
				mT__71(); 

				}
				break;
			case 15 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:94: T__72
				{
				mT__72(); 

				}
				break;
			case 16 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:100: T__73
				{
				mT__73(); 

				}
				break;
			case 17 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:106: T__74
				{
				mT__74(); 

				}
				break;
			case 18 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:112: T__75
				{
				mT__75(); 

				}
				break;
			case 19 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:118: T__76
				{
				mT__76(); 

				}
				break;
			case 20 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:124: T__77
				{
				mT__77(); 

				}
				break;
			case 21 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:130: T__78
				{
				mT__78(); 

				}
				break;
			case 22 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:136: T__79
				{
				mT__79(); 

				}
				break;
			case 23 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:142: T__80
				{
				mT__80(); 

				}
				break;
			case 24 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:148: T__81
				{
				mT__81(); 

				}
				break;
			case 25 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:154: T__82
				{
				mT__82(); 

				}
				break;
			case 26 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:160: T__83
				{
				mT__83(); 

				}
				break;
			case 27 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:166: T__84
				{
				mT__84(); 

				}
				break;
			case 28 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:172: T__85
				{
				mT__85(); 

				}
				break;
			case 29 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:178: T__86
				{
				mT__86(); 

				}
				break;
			case 30 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:184: T__87
				{
				mT__87(); 

				}
				break;
			case 31 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:190: T__88
				{
				mT__88(); 

				}
				break;
			case 32 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:196: T__89
				{
				mT__89(); 

				}
				break;
			case 33 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:202: T__90
				{
				mT__90(); 

				}
				break;
			case 34 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:208: T__91
				{
				mT__91(); 

				}
				break;
			case 35 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:214: T__92
				{
				mT__92(); 

				}
				break;
			case 36 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:220: T__93
				{
				mT__93(); 

				}
				break;
			case 37 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:226: T__94
				{
				mT__94(); 

				}
				break;
			case 38 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:232: T__95
				{
				mT__95(); 

				}
				break;
			case 39 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:238: T__96
				{
				mT__96(); 

				}
				break;
			case 40 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:244: T__97
				{
				mT__97(); 

				}
				break;
			case 41 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:250: T__98
				{
				mT__98(); 

				}
				break;
			case 42 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:256: T__99
				{
				mT__99(); 

				}
				break;
			case 43 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:262: T__100
				{
				mT__100(); 

				}
				break;
			case 44 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:269: T__101
				{
				mT__101(); 

				}
				break;
			case 45 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:276: T__102
				{
				mT__102(); 

				}
				break;
			case 46 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:283: T__103
				{
				mT__103(); 

				}
				break;
			case 47 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:290: T__104
				{
				mT__104(); 

				}
				break;
			case 48 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:297: T__105
				{
				mT__105(); 

				}
				break;
			case 49 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:304: STRING
				{
				mSTRING(); 

				}
				break;
			case 50 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:311: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 51 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:322: Number
				{
				mNumber(); 

				}
				break;
			case 52 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:329: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 53 :
				// /home/walid/Bureau/COMPILATION/tester-file/Algol60.g:1:337: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA9_eotS =
		"\1\uffff\1\3\3\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\2\71\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\3\1\1";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\4\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "556:1: Number : ( INT '.' ( '0' .. '9' )* ( EXPONENT )? | '.' INT ( EXPONENT )? | INT ( EXPONENT )? );";
		}
	}

	static final String DFA13_eotS =
		"\3\uffff\1\50\3\uffff\1\52\1\54\1\uffff\1\57\1\61\1\63\2\45\2\uffff\20"+
		"\45\2\uffff\1\45\11\uffff\1\116\6\uffff\1\45\1\120\3\45\1\124\5\45\1\132"+
		"\15\45\2\uffff\1\151\1\uffff\3\45\1\uffff\1\45\1\156\1\45\1\160\1\45\1"+
		"\uffff\2\45\1\164\13\45\1\uffff\3\45\1\u0083\1\uffff\1\45\1\uffff\1\u0085"+
		"\2\45\1\uffff\1\45\1\u0089\1\u008a\2\45\1\u008d\1\u008e\4\45\1\u0093\1"+
		"\u0094\1\45\1\uffff\1\u0096\1\uffff\1\45\1\u0098\1\45\2\uffff\2\45\2\uffff"+
		"\1\u009c\1\u009d\1\u009e\1\45\2\uffff\1\45\1\uffff\1\45\1\uffff\1\45\1"+
		"\u00a3\1\u00a4\3\uffff\1\45\1\u00a6\1\u00a7\1\45\2\uffff\1\45\2\uffff"+
		"\2\45\1\uffff\1\u00ac\1\uffff";
	static final String DFA13_eofS =
		"\u00ad\uffff";
	static final String DFA13_minS =
		"\1\11\2\uffff\1\52\3\uffff\1\57\1\75\1\uffff\1\75\1\76\1\75\1\116\1\122"+
		"\2\uffff\1\162\1\145\1\157\1\154\1\141\1\157\1\146\1\141\1\167\1\162\1"+
		"\145\1\164\1\150\1\156\1\141\1\150\2\uffff\1\157\11\uffff\1\76\6\uffff"+
		"\1\104\1\60\1\162\1\147\1\157\1\60\1\163\1\144\1\154\1\162\1\164\1\60"+
		"\1\164\1\142\1\156\1\157\1\141\1\145\1\151\1\145\1\165\1\164\1\154\1\151"+
		"\1\155\2\uffff\1\60\1\uffff\1\141\1\151\1\154\1\uffff\1\145\1\60\1\163"+
		"\1\60\1\157\1\uffff\2\145\1\60\1\143\1\154\1\160\1\151\1\164\1\156\1\145"+
		"\1\151\1\165\1\154\1\155\1\uffff\1\171\1\156\1\145\1\60\1\uffff\1\145"+
		"\1\uffff\1\60\1\147\1\154\1\uffff\1\145\2\60\1\156\1\143\2\60\1\154\3"+
		"\145\2\60\1\141\1\uffff\1\60\1\uffff\1\145\1\60\1\144\2\uffff\1\147\1"+
		"\150\2\uffff\3\60\1\156\2\uffff\1\156\1\uffff\1\162\1\uffff\1\165\2\60"+
		"\3\uffff\1\164\2\60\1\162\2\uffff\1\0\2\uffff\1\145\1\0\1\uffff\1\60\1"+
		"\uffff";
	static final String DFA13_maxS =
		"\1\176\2\uffff\1\52\3\uffff\1\57\1\75\1\uffff\2\76\1\75\1\116\1\122\2"+
		"\uffff\1\162\2\157\1\156\2\157\1\156\1\141\1\167\1\162\1\145\1\167\1\162"+
		"\1\156\1\141\1\150\2\uffff\1\157\11\uffff\1\76\6\uffff\1\104\1\172\1\162"+
		"\1\147\1\157\1\172\1\163\1\144\1\154\1\162\1\164\1\172\1\164\1\142\1\156"+
		"\1\157\1\141\1\162\1\151\1\145\1\165\1\164\1\154\1\151\1\155\2\uffff\1"+
		"\172\1\uffff\1\141\1\151\1\154\1\uffff\1\145\1\172\1\163\1\172\1\157\1"+
		"\uffff\2\145\1\172\1\143\1\154\1\160\1\151\1\164\1\156\1\145\1\151\1\165"+
		"\1\154\1\155\1\uffff\1\171\1\156\1\145\1\172\1\uffff\1\145\1\uffff\1\172"+
		"\1\147\1\154\1\uffff\1\145\2\172\1\156\1\143\2\172\1\154\3\145\2\172\1"+
		"\141\1\uffff\1\172\1\uffff\1\145\1\172\1\144\2\uffff\1\147\1\150\2\uffff"+
		"\3\172\1\156\2\uffff\1\156\1\uffff\1\162\1\uffff\1\165\2\172\3\uffff\1"+
		"\164\2\172\1\162\2\uffff\1\uffff\2\uffff\1\145\1\uffff\1\uffff\1\172\1"+
		"\uffff";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\5\1\6\1\7\2\uffff\1\14\5\uffff\1\27\1\30\20"+
		"\uffff\1\60\1\61\1\uffff\1\63\1\62\1\65\1\4\1\3\1\11\1\10\1\13\1\12\1"+
		"\uffff\1\20\1\15\1\22\1\21\1\24\1\23\31\uffff\1\17\1\16\1\uffff\1\26\3"+
		"\uffff\1\34\5\uffff\1\42\16\uffff\1\25\4\uffff\1\36\1\uffff\1\40\3\uffff"+
		"\1\45\16\uffff\1\35\1\uffff\1\41\3\uffff\1\47\1\50\2\uffff\1\53\1\54\4"+
		"\uffff\1\31\1\32\1\uffff\1\37\1\uffff\1\44\3\uffff\1\55\1\56\1\57\4\uffff"+
		"\1\51\1\52\1\uffff\1\33\1\43\2\uffff\1\64\1\uffff\1\46";
	static final String DFA13_specialS =
		"\u00a5\uffff\1\1\3\uffff\1\0\3\uffff}>";
	static final String[] DFA13_transitionS = {
			"\2\46\2\uffff\1\46\22\uffff\1\46\1\uffff\1\42\5\uffff\1\1\1\2\1\3\1\4"+
			"\1\5\1\6\1\44\1\7\12\44\1\10\1\11\1\12\1\13\1\14\2\uffff\1\15\15\45\1"+
			"\16\13\45\1\17\1\uffff\1\20\3\uffff\1\21\1\22\1\43\1\23\1\24\1\25\1\26"+
			"\1\45\1\27\2\45\1\30\2\45\1\31\1\32\1\45\1\33\1\34\1\35\1\36\1\37\1\40"+
			"\3\45\3\uffff\1\41",
			"",
			"",
			"\1\47",
			"",
			"",
			"",
			"\1\51",
			"\1\53",
			"",
			"\1\55\1\56",
			"\1\60",
			"\1\62",
			"\1\64",
			"\1\65",
			"",
			"",
			"\1\66",
			"\1\67\11\uffff\1\70",
			"\1\71",
			"\1\72\1\uffff\1\73",
			"\1\74\15\uffff\1\75",
			"\1\76",
			"\1\77\7\uffff\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105\2\uffff\1\106",
			"\1\107\11\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"",
			"",
			"\1\114",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\115",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\117",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\121",
			"\1\122",
			"\1\123",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140\14\uffff\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"",
			"",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"",
			"\1\155",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\157",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\161",
			"",
			"\1\162",
			"\1\163",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"\1\u0084",
			"",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u0086",
			"\1\u0087",
			"",
			"\1\u0088",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u008b",
			"\1\u008c",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u0095",
			"",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"\1\u0097",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u0099",
			"",
			"",
			"\1\u009a",
			"\1\u009b",
			"",
			"",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u009f",
			"",
			"",
			"\1\u00a0",
			"",
			"\1\u00a1",
			"",
			"\1\u00a2",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"",
			"",
			"",
			"\1\u00a5",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			"\1\u00a8",
			"",
			"",
			"\60\u00aa\12\u00a9\7\u00aa\32\u00a9\6\u00aa\32\u00a9\uff85\u00aa",
			"",
			"",
			"\1\u00ab",
			"\60\u00aa\12\u00a9\7\u00aa\32\u00a9\6\u00aa\32\u00a9\uff85\u00aa",
			"",
			"\12\45\7\uffff\32\45\6\uffff\32\45",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | STRING | Identifier | Number | COMMENT | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_169 = input.LA(1);
						s = -1;
						if ( ((LA13_169 >= '\u0000' && LA13_169 <= '/')||(LA13_169 >= ':' && LA13_169 <= '@')||(LA13_169 >= '[' && LA13_169 <= '`')||(LA13_169 >= '{' && LA13_169 <= '\uFFFF')) ) {s = 170;}
						else if ( ((LA13_169 >= '0' && LA13_169 <= '9')||(LA13_169 >= 'A' && LA13_169 <= 'Z')||(LA13_169 >= 'a' && LA13_169 <= 'z')) ) {s = 169;}
						else s = 37;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_165 = input.LA(1);
						s = -1;
						if ( ((LA13_165 >= '0' && LA13_165 <= '9')||(LA13_165 >= 'A' && LA13_165 <= 'Z')||(LA13_165 >= 'a' && LA13_165 <= 'z')) ) {s = 169;}
						else if ( ((LA13_165 >= '\u0000' && LA13_165 <= '/')||(LA13_165 >= ':' && LA13_165 <= '@')||(LA13_165 >= '[' && LA13_165 <= '`')||(LA13_165 >= '{' && LA13_165 <= '\uFFFF')) ) {s = 170;}
						else s = 37;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
