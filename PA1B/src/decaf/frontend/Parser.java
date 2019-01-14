package decaf.frontend;

import decaf.Driver;
import decaf.error.MsgError;
import decaf.tree.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Parser extends Table {
    /**
     * Lexer.
     */
    private Lexer lexer;

    /**
     * Set lexer.
     *
     * @param lexer the lexer.
     */
    public void setLexer(Lexer lexer) {
        this.lexer = lexer;
    }

    /**
     * Lookahead token (can be eof/eos).
     */
    public int lookahead = eof;

    /**
     * Undefined token (when lexer fails).
     */
    private static final int undefined_token = -2;

    /**
     * Lexer will write this when a token is parsed.
     */
    public SemValue val = new SemValue();

    /**
     * Helper function.
     * Create a `MsgError` with `msg` and append it to driver.
     *
     * @param msg the message string.
     */
    private void issueError(String msg) {
        Driver.getDriver().issueError(new MsgError(lexer.getLocation(), msg));
    }

    /**
     * Error handler.
     */
    private void error() {
        issueError("syntax error");
    }

    /**
     * Lexer caller.
     *
     * @return the token parsed by the lexer. If `undefined_token` is returned, then lexer failed.
     */
    private int lex() {
        int token = undefined_token;
        try {
            token = lexer.yylex();
        } catch (Exception e) {
            issueError("lexer error: " + e.getMessage());
        }
        return token;
    }

    /**
     * Parse function for each non-terminal with error recovery.
     * NOTE: the current implementation is buggy and may throw NullPointerException.
     * TODO: find a correct implementation for error recovery!
     * TODO: You are free to change the method body as you wish, but not the interface!
     *
     * @param symbol the non-terminal to be passed.
     * @return the parsed value of `symbol` if parsing succeeded, otherwise `null`.
     */
    private SemValue parse(int symbol, Set<Integer> follow) {
//    	System.out.println(symbol + " " + lookahead);
    	Map.Entry<Integer, List<Integer>> result = query(symbol, lookahead); // get production by lookahead symbol
        int prelookahead = lookahead;	// remember initial lookahead position for later reset
        // error recovery
        if (result == null)
        {
        	error();
//        	System.out.println("**** parse error: " + lookahead);
        	Set<Integer> bs = beginSet(symbol);	// begin set
        	Set<Integer> fs = followSet(symbol);// end set = follow set(fs) || follow
        	while (!bs.contains(lookahead) && !fs.contains(lookahead) && !follow.contains(lookahead)
        			&& lookahead != eof && lookahead != eos)
        	{
        		lookahead = lex();
        	}
        	if (bs.contains(lookahead))			// lookahead is in begin set, re-analyze symbol
        	{
//        		System.out.println("Error recover " + lookahead);
        		result = query(symbol, lookahead);
        	}
        	else								// lookahead is in end set
        	{
//        		System.out.println("Error skip " + lookahead);
    			lookahead = prelookahead;		// if return null, reset lookahead
//        		System.out.println("Continue " + lookahead);
        		return null;
        	}
        }
        
        int actionId = result.getKey(); // get user-defined action
        follow.addAll(followSet(symbol));	// refresh follow set
        List<Integer> right = result.getValue(); // right-hand side of production
        int length = right.size();
        SemValue[] params = new SemValue[length + 1];

        for (int i = 0; i < length; i++) { // parse right-hand side symbols one by one
            int term = right.get(i);
            params[i + 1] = isNonTerminal(term)
                    ? parse(term, follow) // for non terminals: recursively parse it
                    : matchToken(term) // for terminals: match token
                    ;
        }
        
        params[0] = new SemValue(); // initialize return value
        // error recovery 2: skip the error case
        for (SemValue sv : params)
        {
        	if (sv == null)
        	{
        		return null;
        	}
        }
        act(actionId, params); // do user-defined action
        return params[0];
    }

    /**
     * Match if the lookahead token is the same as the expected token.
     *
     * @param expected the expected token.
     * @return same as `parse`.
     */
    private SemValue matchToken(int expected) {
        SemValue self = val;
        if (lookahead != expected) {
//        	System.out.println("**** matchToken error: " + lookahead);
            error();
            return null;
        }

        lookahead = lex();
//        System.out.println(lookahead);
        return self;
    }

    /**
     * Explicit interface of the parser. Call it in `Driver` class!
     *
     * @return the program AST if successfully parsed, otherwise `null`.
     */
    public Tree.TopLevel parseFile() {
        lookahead = lex();
        SemValue r = parse(start, new HashSet<>());
        return r == null ? null : r.prog;
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol set.
     *
     * @param set symbol set.
     */
    private void printSymbolSet(Set<Integer> set) {
        StringBuilder buf = new StringBuilder();
        buf.append("{ ");
        for (Integer i : set) {
            buf.append(name(i));
            buf.append(" ");
        }
        buf.append("}");
        System.out.print(buf.toString());
    }

    /**
     * Helper function. (For debugging)
     * Pretty print a symbol list.
     *
     * @param list symbol list.
     */
    private void printSymbolList(List<Integer> list) {
        StringBuilder buf = new StringBuilder();
        buf.append(" ");
        for (Integer i : list) {
            buf.append(name(i));
            buf.append(" ");
        }
        System.out.print(buf.toString());
    }

    /**
     * Diagnose function. (For debugging)
     * Implement this by yourself on demand.
     */
    public void diagnose() {

    }

}
