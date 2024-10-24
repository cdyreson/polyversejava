package edu.usu.polyverse.scalar;

import edu.usu.polyverse.Config;
import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.metadata.PolyverseSemantics;
import java.util.*;
import edu.usu.polyverse.grammar.JavaLexer;

/**
 * A PolyverseBoolean is two lists of boolean PolyverseContext(s), a false
 list and a true list.
 *
 * @author curt
 */
public class PolyverseBoolean {

    //List<UniversesBoolean> values;
    PolyverseContext truePolyverses;
    PolyverseContext falsePolyverses;

    public PolyverseBoolean() {
        //values = new ArrayList<UniversesBoolean>();
        truePolyverses = new PolyverseContext();
        falsePolyverses = new PolyverseContext();
    }

    public PolyverseBoolean(PolyverseContext t, PolyverseContext f) {
        truePolyverses = t;
        falsePolyverses = f;
    }

    public PolyverseContext getTruePolyverses() {
        return truePolyverses;
    }

    public PolyverseContext getFalsePolyverses() {
        return truePolyverses;
    }

    public void append(boolean v, PolyverseContext mv) {
        if (v) {
            truePolyverses.add(mv);
        } else {
            falsePolyverses.add(mv);
        }
    }

    /* 
     * binaryOperation operates on two Booleans
     */
    public PolyverseBoolean binaryOperation(PolyverseContext vTop, int operation, PolyverseBoolean other) {
        PolyverseContext trueResult = new PolyverseContext();
        PolyverseContext falseResult = new PolyverseContext();
        PolyverseContext mv = Config.semantics.meld(vTop, this.truePolyverses, other.truePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.LOGICAL_OR:
                case JavaLexer.LOGICAL_AND:
                case JavaLexer.AND:
                case JavaLexer.OR:
                case JavaLexer.EQUAL:
                    trueResult.add(mv);
                    break;
                case JavaLexer.XOR:
                case JavaLexer.NOT_EQUAL:
                    falseResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        mv = Config.semantics.meld(vTop, this.truePolyverses, other.falsePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.LOGICAL_OR:
                case JavaLexer.OR:
                case JavaLexer.XOR:
                case JavaLexer.NOT_EQUAL:
                    trueResult.add(mv);
                    break;
                case JavaLexer.LOGICAL_AND:
                case JavaLexer.AND:
                case JavaLexer.EQUAL:
                    falseResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        mv = Config.semantics.meld(vTop, this.falsePolyverses, other.truePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.LOGICAL_OR:
                case JavaLexer.OR:
                case JavaLexer.XOR:
                case JavaLexer.NOT_EQUAL:
                    trueResult.add(mv);
                    break;
                case JavaLexer.LOGICAL_AND:
                case JavaLexer.AND:
                case JavaLexer.EQUAL:
                    falseResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        mv = Config.semantics.meld(vTop, this.falsePolyverses, other.falsePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.EQUAL:
                case JavaLexer.XOR:
                    trueResult.add(mv);
                    break;
                case JavaLexer.LOGICAL_OR:
                case JavaLexer.OR:
                case JavaLexer.LOGICAL_AND:
                case JavaLexer.AND:
                case JavaLexer.NOT_EQUAL:
                    falseResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        return new PolyverseBoolean(trueResult, falseResult);
    }

    /* 
     * unaryOperation operates on a single PolyverseBoolean
     */
    public PolyverseBoolean unaryOperation(PolyverseContext vTop, int operation) {
        PolyverseContext trueResult = new PolyverseContext();
        PolyverseContext falseResult = new PolyverseContext();
        PolyverseContext mv = Config.semantics.meld(vTop, this.truePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.NOT:
                    falseResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        mv = Config.semantics.meld(vTop, this.falsePolyverses);
        if (mv != null) {
            switch (operation) {
                case JavaLexer.NOT:
                    trueResult.add(mv);
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
        }
        return new PolyverseBoolean(trueResult, falseResult);
    }

    @Override
    public String toString() {
        String s = "";
        /*
        for (PolyverseContext p : truePolyverses) {
            s += "true " + p + " ";
        }
        for (PolyverseContext p : falsePolyverses) {
            s += "true " + p + " ";
        }
*/
        return s;
    }
}
