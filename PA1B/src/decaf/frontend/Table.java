/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: D:\PA1B\src\decaf\frontend\Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Oct 28 19:04:02 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int DEFAULT = 276; //# line 18
    public static final int IN = 277; //# line 18
    public static final int FOREACH = 278; //# line 18
    public static final int PARGUARD = 279; //# line 18
    public static final int LEFTCOMPREHEN = 280; //# line 18
    public static final int RIGHTCOMPREHEN = 281; //# line 18
    public static final int SCOPY = 282; //# line 19
    public static final int SEALED = 283; //# line 19
    public static final int VAR = 284; //# line 19
    public static final int ARRAYCOPY = 285; //# line 19
    public static final int ARRAYAPPEND = 286; //# line 19
    public static final int IDENTIFIER = 287; //# line 20
    public static final int AND = 288; //# line 20
    public static final int OR = 289; //# line 20
    public static final int STATIC = 290; //# line 20
    public static final int INSTANCEOF = 291; //# line 20
    public static final int LESS_EQUAL = 292; //# line 21
    public static final int GREATER_EQUAL = 293; //# line 21
    public static final int EQUAL = 294; //# line 21
    public static final int NOT_EQUAL = 295; //# line 21
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int IfBlock = 298;
    public static final int BoundVariable = 299;
    public static final int Oper3 = 300;
    public static final int Oper6 = 301;
    public static final int StmtWithIf = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int IfSubStmt = 306;
    public static final int Expr8 = 307;
    public static final int AfterSimpleTypeExpr = 308;
    public static final int Constants = 309;
    public static final int IfCompreClause = 310;
    public static final int Expr2 = 311;
    public static final int Oper2 = 312;
    public static final int ExprTac = 313;
    public static final int WhileClause = 314;
    public static final int ExprT10 = 315;
    public static final int Expr6 = 316;
    public static final int ExprT9 = 317;
    public static final int BreakStmt = 318;
    public static final int ExprT2 = 319;
    public static final int StmtList = 320;
    public static final int Constant = 321;
    public static final int SubVariableList = 322;
    public static final int PrintStmt = 323;
    public static final int ForStmt = 324;
    public static final int Expr9 = 325;
    public static final int Expr1 = 326;
    public static final int FuncVariable = 327;
    public static final int ForeachStmt = 328;
    public static final int ArrayConstant = 329;
    public static final int Oper1 = 330;
    public static final int ElseClause = 331;
    public static final int FieldList = 332;
    public static final int IfBranch = 333;
    public static final int SubExprList = 334;
    public static final int AfterParenExpr = 335;
    public static final int ClassDef = 336;
    public static final int ReturnStmt = 337;
    public static final int ExprList = 338;
    public static final int ExprArrayCopy = 339;
    public static final int StmtBlock = 340;
    public static final int ArrayConst = 341;
    public static final int FunctionField = 342;
    public static final int AfterIdentExpr = 343;
    public static final int Program = 344;
    public static final int Expr = 345;
    public static final int Type = 346;
    public static final int Expr5 = 347;
    public static final int AfterNewExpr = 348;
    public static final int Assignment = 349;
    public static final int ExtendsClause = 350;
    public static final int Oper5 = 351;
    public static final int ArrayType = 352;
    public static final int Expr3 = 353;
    public static final int Actuals = 354;
    public static final int ExprArrayAppend = 355;
    public static final int Variable = 356;
    public static final int ExprT3 = 357;
    public static final int Stmt = 358;
    public static final int SimpleStmt = 359;
    public static final int SimpleType = 360;
    public static final int WhileStmt = 361;
    public static final int ExprTaa = 362;
    public static final int ExprT1 = 363;
    public static final int Expr4 = 364;
    public static final int ExprT4 = 365;
    public static final int ReturnExpr = 366;
    public static final int OCStmt = 367;
    public static final int ExprT6 = 368;
    public static final int ExprT8 = 369;
    public static final int Expr7 = 370;
    public static final int ClassList = 371;
    public static final int Oper4 = 372;
    public static final int Field = 373;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "DEFAULT",
        "IN", "FOREACH", "PARGUARD", "LEFTCOMPREHEN", "RIGHTCOMPREHEN",
        "SCOPY", "SEALED", "VAR", "ARRAYCOPY", "ARRAYAPPEND",
        "IDENTIFIER", "AND", "OR", "STATIC", "INSTANCEOF",
        "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "VariableDef",
        "ExprT5", "IfBlock", "BoundVariable", "Oper3", "Oper6",
        "StmtWithIf", "VariableList", "Formals", "Oper7", "IfSubStmt",
        "Expr8", "AfterSimpleTypeExpr", "Constants", "IfCompreClause", "Expr2",
        "Oper2", "ExprTac", "WhileClause", "ExprT10", "Expr6",
        "ExprT9", "BreakStmt", "ExprT2", "StmtList", "Constant",
        "SubVariableList", "PrintStmt", "ForStmt", "Expr9", "Expr1",
        "FuncVariable", "ForeachStmt", "ArrayConstant", "Oper1", "ElseClause",
        "FieldList", "IfBranch", "SubExprList", "AfterParenExpr", "ClassDef",
        "ReturnStmt", "ExprList", "ExprArrayCopy", "StmtBlock", "ArrayConst",
        "FunctionField", "AfterIdentExpr", "Program", "Expr", "Type",
        "Expr5", "AfterNewExpr", "Assignment", "ExtendsClause", "Oper5",
        "ArrayType", "Expr3", "Actuals", "ExprArrayAppend", "Variable",
        "ExprT3", "Stmt", "SimpleStmt", "SimpleType", "WhileStmt",
        "ExprTaa", "ExprT1", "Expr4", "ExprT4", "ReturnExpr",
        "OCStmt", "ExprT6", "ExprT8", "Expr7", "ClassList",
        "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, LEFTCOMPREHEN},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {RIGHTCOMPREHEN, IF},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {ARRAYCOPY, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {WHILE, Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), DEFAULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf(':')},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {FOREACH},
        {Integer.valueOf('[')},
        {OR},
        {ELSE, PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {PARGUARD, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, FOREACH},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {ARRAYAPPEND, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {OR, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {SCOPY},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS, SEALED, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {IN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PARGUARD, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PARGUARD, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), IDENTIFIER, NEW, LEFTCOMPREHEN, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), RIGHTCOMPREHEN, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, RIGHTCOMPREHEN, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, ARRAYAPPEND, RIGHTCOMPREHEN, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, ARRAYCOPY, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, LEFTCOMPREHEN, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 78; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 50
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 563
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case AND:
                    case IF:
                    case ARRAYCOPY:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 917
            case IfBlock: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1006
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 300
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 346
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 875
            case StmtWithIf: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Integer.valueOf('{'), IfBlock, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 171
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(FuncVariable, SubVariableList));
                    default: return null;
                }
            }
            //# line 161
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList());
                    default: return null;
                }
            }
            //# line 363
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 947
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 619
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(Expr9, ExprT8));
                    case LEFTCOMPREHEN:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(LEFTCOMPREHEN, Expr, FOR, IDENTIFIER, IN, Expr, IfCompreClause));
                    default: return null;
                }
            }
            //# line 788
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 974
            case Constants: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(Integer.valueOf(','), Constant, Constants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList());
                    default: return null;
                }
            }
            //# line 643
            case IfCompreClause: {
                switch (lookahead) {
                    case RIGHTCOMPREHEN:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(RIGHTCOMPREHEN));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(IF, Expr, RIGHTCOMPREHEN));
                    default: return null;
                }
            }
            //# line 411
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 293
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 534
            case ExprTac: {
                switch (lookahead) {
                    case ARRAYCOPY:
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(ARRAYCOPY, Expr5, ExprTac));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 995
            case WhileClause: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(WHILE, Expr, Integer.valueOf(')'), Stmt));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 710
            case ExprT10: {
                switch (lookahead) {
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ARRAYCOPY:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(ExprT8));
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(DEFAULT, Expr9));
                    default: return null;
                }
            }
            //# line 580
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 686
            case ExprT9: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(Integer.valueOf(']'), ExprT10));
                    case ':':
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 869
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 423
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case RIGHTCOMPREHEN:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 204
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 812
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 181
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(Integer.valueOf(','), FuncVariable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 905
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 863
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 732
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 382
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 192
            case FuncVariable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 989
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, WhileClause));
                    default: return null;
                }
            }
            //# line 953
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Integer.valueOf('['), ArrayConst, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 286
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 885
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(ELSE, Stmt));
                    case PARGUARD:
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 121
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList());
                    default: return null;
                }
            }
            //# line 932
            case IfBranch: {
                switch (lookahead) {
                    case PARGUARD:
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(PARGUARD, IfSubStmt, IfBranch));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList());
                    default: return null;
                }
            }
            //# line 844
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList());
                    default: return null;
                }
            }
            //# line 800
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 103
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 892
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 836
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 522
            case ExprArrayCopy: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(Expr5, ExprTac));
                    default: return null;
                }
            }
            //# line 198
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 959
            case ArrayConst: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Constant, Constants));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList());
                    default: return null;
                }
            }
            //# line 153
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 725
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ARRAYCOPY:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 28
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 376
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 84
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 551
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 774
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 277
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 114
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 334
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 93
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList());
                    default: return null;
                }
            }
            //# line 440
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 826
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList());
                    default: return null;
                }
            }
            //# line 498
            case ExprArrayAppend: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(ExprArrayCopy, ExprTaa));
                    default: return null;
                }
            }
            //# line 56
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 452
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case RIGHTCOMPREHEN:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 212
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(IF, StmtWithIf));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(OCStmt, Integer.valueOf(';')));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 262
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 62
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 857
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 510
            case ExprTaa: {
                switch (lookahead) {
                    case ARRAYAPPEND:
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(ARRAYAPPEND, ExprArrayAppend));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case RIGHTCOMPREHEN:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 394
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case RIGHTCOMPREHEN:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 469
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(ExprArrayAppend, ExprT4));
                    default: return null;
                }
            }
            //# line 481
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(Oper4, ExprArrayAppend, ExprT4));
                    case ']':
                    case FOR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case RIGHTCOMPREHEN:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 898
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 911
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 592
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case '+':
                    case AND:
                    case IF:
                    case ARRAYCOPY:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 650
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Integer.valueOf('['), Expr, ExprT9));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case ARRAYAPPEND:
                    case RIGHTCOMPREHEN:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ARRAYCOPY:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 609
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case LEFTCOMPREHEN:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 39
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 312
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 137
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 51
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 564
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 918
                params[0].guards = new ArrayList<Guard>();
                params[0].guards.add(params[1].guard);
                if (params[2].guards != null)
                {
                	params[0].guards.addAll(params[2].guards);
                }
                return;
            }
            case 4: {
                //# line 927
                params[0].guards = new ArrayList<Guard>();
                return;
            }
            case 5: {
                //# line 1007
                params[0].bVar = new Tree.BoundVariable(params[2].ident, null, params[2].loc);
                return;
            }
            case 6: {
                //# line 1011
                params[0].bVar = new Tree.BoundVariable(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 7: {
                //# line 301
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 306
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 347
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 352
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 357
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 876
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 13: {
                //# line 880
                params[0].stmt = new Tree.ParGuard(params[2].guards, params[1].loc);
                return;
            }
            case 14: {
                //# line 172
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 15: {
                //# line 162
                params[0].vlist = params[1].vlist;
                return;
            }
            case 16: {
                //# line 166
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 17: {
                //# line 364
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 369
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 19: {
                //# line 948
                params[0].guard = new Tree.Guard(params[1].expr, params[3].stmt, params[2].loc);
                return;
            }
            case 20: {
                //# line 620
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 21: {
                //# line 638
                params[0].expr = new Tree.Comprehension(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 22: {
                //# line 789
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 23: {
                //# line 794
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 24: {
                //# line 975
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                if (params[3].elist != null)
                {
                	params[0].elist.addAll(params[3].elist);
                }
                return;
            }
            case 25: {
                //# line 984
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 26: {
                /* no action */
                return;
            }
            case 27: {
                //# line 645
                params[0].expr = params[2].expr;
                return;
            }
            case 28: {
                //# line 412
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 29: {
                //# line 294
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 30: {
                //# line 535
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(Tree.ARRAYCOPY);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 31: {
                /* no action */
                return;
            }
            case 32: {
                //# line 996
                params[0].expr = params[2].expr;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 33: {
                //# line 1001
                params[0].stmt = params[2].stmt;
                return;
            }
            case 34: {
                //# line 711
                params[0].vec = new Vector<SemValue>();
                                  if (params[1].vec != null) {
                                      params[0].vec.addAll(params[1].vec);
                                  }
                return;
            }
            case 35: {
                //# line 718
                params[0].loc = params[1].loc;
                params[0].counter = Tree.DEFAULT;
                params[0].expr = params[2].expr;
                return;
            }
            case 36: {
                //# line 581
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 37: {
                //# line 687
                params[0].loc = params[2].loc;
                params[0].counter = params[2].counter;
                if (params[0].counter == Tree.DEFAULT)
                {
                	params[0].expr = params[2].expr;
                }
                else
                {
                	params[0].vec = new Vector<SemValue>();
                	if (params[2].vec != null) {
                		params[0].vec.addAll(params[2].vec);
                	}
                }
                return;
            }
            case 38: {
                //# line 703
                params[0].loc = params[1].loc;
                params[0].counter = Tree.COLON;
                                  params[0].expr = params[2].expr;
                return;
            }
            case 39: {
                //# line 870
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 40: {
                //# line 424
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 41: {
                /* no action */
                return;
            }
            case 42: {
                //# line 205
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 43: {
                /* no action */
                return;
            }
            case 44: {
                //# line 813
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 45: {
                //# line 817
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 46: {
                //# line 821
                params[0].expr = params[1].expr;
                return;
            }
            case 47: {
                //# line 182
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 48: {
                /* no action */
                return;
            }
            case 49: {
                //# line 906
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 50: {
                //# line 864
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 51: {
                //# line 733
                params[0].expr = params[1].expr;
                return;
            }
            case 52: {
                //# line 737
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 53: {
                //# line 741
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 54: {
                //# line 745
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 55: {
                //# line 749
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 56: {
                //# line 757
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 57: {
                //# line 761
                params[0].expr = params[2].expr;
                return;
            }
            case 58: {
                //# line 765
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 59: {
                //# line 383
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 60: {
                //# line 193
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 61: {
                //# line 990
                params[0].stmt = new Tree.Foreach(params[3].bVar, params[5].expr, params[6].expr, params[6].stmt, params[1].loc);
                return;
            }
            case 62: {
                //# line 954
                params[0].expr = new ArrayConst(params[2].elist, params[2].loc);
                return;
            }
            case 63: {
                //# line 287
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 64: {
                //# line 886
                params[0].stmt = params[2].stmt;
                return;
            }
            case 65: {
                /* no action */
                return;
            }
            case 66: {
                //# line 122
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 67: {
                //# line 132
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 68: {
                //# line 933
                params[0].guards = new ArrayList<Guard>();
                params[0].guards.add(params[2].guard);
                if (params[3].guards != null)
                {
                	params[0].guards.addAll(params[3].guards);
                }
                return;
            }
            case 69: {
                //# line 942
                params[0].guards = new ArrayList<Guard>();
                return;
            }
            case 70: {
                //# line 845
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 71: {
                //# line 851
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 72: {
                //# line 801
                params[0].expr = params[1].expr;
                return;
            }
            case 73: {
                //# line 805
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 74: {
                //# line 104
                params[0].cdef = new Tree.ClassDef(false, params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 75: {
                //# line 109
                params[0].cdef = new Tree.ClassDef(true, params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 76: {
                //# line 893
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 77: {
                //# line 837
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 78: {
                //# line 523
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 79: {
                //# line 199
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 80: {
                //# line 960
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                if (params[2].elist != null)
                {
                	params[0].elist.addAll(params[2].elist);
                }
                return;
            }
            case 81: {
                //# line 969
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 82: {
                //# line 154
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 83: {
                /* no action */
                return;
            }
            case 84: {
                //# line 726
                params[0].elist = params[2].elist;
                return;
            }
            case 85: {
                /* no action */
                return;
            }
            case 86: {
                //# line 29
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 87: {
                //# line 377
                params[0].expr = params[1].expr;
                return;
            }
            case 88: {
                //# line 85
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 89: {
                //# line 552
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 90: {
                //# line 775
                params[0].ident = params[1].ident;
                return;
            }
            case 91: {
                //# line 779
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 92: {
                //# line 278
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 93: {
                /* no action */
                return;
            }
            case 94: {
                //# line 115
                params[0].ident = params[2].ident;
                return;
            }
            case 95: {
                /* no action */
                return;
            }
            case 96: {
                //# line 335
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 97: {
                //# line 340
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 98: {
                //# line 94
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 99: {
                //# line 98
                params[0].counter = 0;
                return;
            }
            case 100: {
                //# line 441
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 101: {
                //# line 827
                params[0].elist = params[1].elist;
                return;
            }
            case 102: {
                //# line 831
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 103: {
                //# line 499
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 104: {
                //# line 57
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 105: {
                //# line 453
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 106: {
                /* no action */
                return;
            }
            case 107: {
                //# line 213
                params[0].stmt = params[1].vdef;
                return;
            }
            case 108: {
                //# line 217
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 109: {
                //# line 225
                params[0].stmt = params[2].stmt;
                return;
            }
            case 110: {
                //# line 229
                params[0].stmt = params[1].stmt;
                return;
            }
            case 111: {
                //# line 233
                params[0].stmt = params[1].stmt;
                return;
            }
            case 112: {
                //# line 237
                params[0].stmt = params[1].stmt;
                return;
            }
            case 113: {
                //# line 241
                params[0].stmt = params[1].stmt;
                return;
            }
            case 114: {
                //# line 245
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 249
                params[0].stmt = params[1].stmt;
                return;
            }
            case 116: {
                //# line 253
                params[0].stmt = params[1].stmt;
                return;
            }
            case 117: {
                //# line 257
                params[0].stmt = params[1].stmt;
                return;
            }
            case 118: {
                //# line 263
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 119: {
                //# line 271
                params[0].stmt = new Tree.VarAssign(params[2].ident, params[4].expr, params[3].loc);
                return;
            }
            case 120: {
                /* no action */
                return;
            }
            case 121: {
                //# line 63
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 122: {
                //# line 67
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 123: {
                //# line 71
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 124: {
                //# line 75
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 125: {
                //# line 79
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 126: {
                //# line 858
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 127: {
                //# line 511
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(Tree.ARRAYAPPEND);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                return;
            }
            case 128: {
                /* no action */
                return;
            }
            case 129: {
                //# line 395
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 130: {
                /* no action */
                return;
            }
            case 131: {
                //# line 470
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 132: {
                //# line 482
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 133: {
                /* no action */
                return;
            }
            case 134: {
                //# line 899
                params[0].expr = params[1].expr;
                return;
            }
            case 135: {
                /* no action */
                return;
            }
            case 136: {
                //# line 912
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 137: {
                //# line 593
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 138: {
                /* no action */
                return;
            }
            case 139: {
                //# line 651
                                  SemValue sem = new SemValue();
                if (params[3].counter == Tree.COLON)
                {
                	sem.expr = new Tree.Range(params[2].expr, params[3].expr, params[3].loc);
                }
                else if (params[3].counter == Tree.DEFAULT)
                {
                	sem.expr = new Tree.Default(params[2].expr, params[3].expr, params[3].loc);
                }
                else
                {
                	sem.expr = params[2].expr;
                }
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[3].vec != null) {
                	params[0].vec.addAll(params[3].vec);
                }
                return;
            }
            case 140: {
                //# line 672
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 141: {
                /* no action */
                return;
            }
            case 142: {
                //# line 610
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 143: {
                //# line 614
                params[0].expr = params[1].expr;
                return;
            }
            case 144: {
                //# line 40
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 145: {
                /* no action */
                return;
            }
            case 146: {
                //# line 313
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 147: {
                //# line 318
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 148: {
                //# line 323
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 149: {
                //# line 328
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 150: {
                //# line 138
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 151: {
                //# line 143
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
