/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.scalar;

import edu.usu.polyverse.Config;
import java.util.List;
import java.util.ArrayList;
import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.grammar.JavaLexer;
import edu.usu.polyverse.metadata.PolyverseSemantics;

/**
 *
 * @author dyreson
 */
public class PolyverseInteger {

    // A list of integer values paird with metadata
    private List<UniversesInteger> values;
    boolean debug = false;

    public PolyverseInteger() {
        values = new ArrayList<UniversesInteger>();
    }

    public PolyverseInteger(UniversesInteger value) {
        values = new ArrayList<UniversesInteger>();
        values.add(value);
    }

    public PolyverseInteger(List<UniversesInteger> v) {
        values = v;
    }

    public PolyverseInteger(int v, PolyverseContext m) {
        values = new ArrayList<UniversesInteger>();
        values.add(new UniversesInteger(v, m));
    }

    public void append(UniversesInteger x) {
        values.add(x);
    }

    public void append(int v, PolyverseContext m) {
        UniversesInteger x = new UniversesInteger(v, m);
        values.add(x);
    }

    public List<UniversesInteger> getValue() {
        return this.values;
    }

    public String toString() {
        String s = "";
        for (UniversesInteger temp : values) {
            return " value " + temp.scalar + " Metadata( " + temp.metadata + ")\n";
        }
        return s;
    }

    /*
     Implementation of all operations
     */
    public PolyverseBoolean booleanOperation(PolyverseContext vTop, int operation, PolyverseInteger other) {
        PolyverseBoolean result = new PolyverseBoolean();
        for (UniversesInteger thisValue : this.values) {
            for (UniversesInteger otherValue : other.values) {
                PolyverseContext metadata = Config.semantics.meld(vTop, thisValue.metadata, otherValue.metadata);;
                if (metadata == null) {
                    continue;
                }
                boolean comparison = false;
                switch (operation) {
                    case JavaLexer.EQUAL:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    case JavaLexer.NOT_EQUAL:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    case JavaLexer.GREATER_OR_EQUAL:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    case JavaLexer.GREATER_THAN:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    case JavaLexer.LESS_OR_EQUAL:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    case JavaLexer.LESS_THAN:
                        comparison = thisValue.scalar == otherValue.scalar;
                        break;
                    default:
                        System.err.println("Bad operator in Integer " + operation);
                        System.exit(-1);
                }
                result.append(comparison, metadata);
            }
        }
        return result;
    }

    public PolyverseInteger unaryOperationSelf(PolyverseContext vTop, int operation) {
        List<UniversesInteger> newValues = new ArrayList();
        for (UniversesInteger thisValue : this.values) {
            PolyverseContext metadata = Config.semantics.meld(vTop, thisValue.metadata);
            if (metadata == null) {
                continue;
            }
            int value = 0;
            switch (operation) {
                case JavaLexer.DEC:
                    value = thisValue.scalar - 1;
                    break;
                case JavaLexer.INC:
                    value = thisValue.scalar + 1;
                    break;
                default:
                    System.err.println("Bad operator in Boolean " + operation);
                    System.exit(-1);
            }
            newValues.add(new UniversesInteger(value, metadata));
        }
        values = newValues;
        return this;
    }

    public PolyverseInteger unaryOperation(PolyverseContext vTop, int operation) {
        PolyverseInteger result = new PolyverseInteger();
        for (UniversesInteger thisValue : this.values) {
            PolyverseContext metadata = Config.semantics.meld(vTop, thisValue.metadata);;
            if (metadata == null) {
                continue;
            }
            int value = 0;
            switch (operation) {
                case JavaLexer.LOGICAL_NOT:
                    value = ~thisValue.scalar;
            }
            result.append(new UniversesInteger(value, metadata));
        }
        return result;
    }

    public PolyverseInteger binaryOperation(PolyverseContext vTop, int operation, PolyverseInteger other) {
        PolyverseInteger result = new PolyverseInteger();
        for (UniversesInteger thisValue : this.values) {
            for (UniversesInteger otherValue : other.values) {
                PolyverseContext metadata = Config.semantics.meld(vTop, thisValue.metadata, otherValue.metadata);
                if (metadata == null) {
                    continue;
                }
                int value = 0;
                switch (operation) {
                    case JavaLexer.LOGICAL_AND:
                        value = thisValue.scalar & otherValue.scalar;
                        break;
                    case JavaLexer.LOGICAL_OR:
                        value = thisValue.scalar | otherValue.scalar;
                        break;
                    case JavaLexer.XOR:
                        value = thisValue.scalar ^ otherValue.scalar;
                        break;
                    case JavaLexer.BIT_SHIFT_RIGHT:
                        value = thisValue.scalar >>> otherValue.scalar;
                        break;
                    case JavaLexer.SHIFT_RIGHT:
                        value = thisValue.scalar >> otherValue.scalar;
                        break;
                    case JavaLexer.SHIFT_LEFT:
                        value = thisValue.scalar << otherValue.scalar;
                        break;
                    case JavaLexer.DIV:
                        value = thisValue.scalar / otherValue.scalar;
                        break;
                    case JavaLexer.STAR:
                        value = thisValue.scalar / otherValue.scalar;
                        break;
                    case JavaLexer.PLUS:
                        value = thisValue.scalar + otherValue.scalar;
                        break;
                    case JavaLexer.MINUS:
                        value = thisValue.scalar - otherValue.scalar;
                        break;
                    case JavaLexer.MOD:
                        value = thisValue.scalar % otherValue.scalar;
                        break;
                    default:
                        System.err.println("Bad operator in Integer binary operation " + operation);
                        System.exit(-1);
                }
                result.append(new UniversesInteger(value, metadata));
            }
        }
        return result;
    }

    public PolyverseInteger binaryOperationSelf(PolyverseContext vTop, int operation, PolyverseInteger other) {
        List<UniversesInteger> newValues = new ArrayList();
        for (UniversesInteger thisValue : this.values) {
            for (UniversesInteger otherValue : other.values) {
                PolyverseContext metadata = Config.semantics.meld(vTop, thisValue.metadata, otherValue.metadata);
                if (metadata == null) {
                    continue;
                }
                int value = 0;
                switch (operation) {
                    case JavaLexer.ASSIGN:
                        value = otherValue.scalar;
                        break;
                    case JavaLexer.XOR_ASSIGN:
                        value = thisValue.scalar ^ otherValue.scalar;
                        break;
                    case JavaLexer.BIT_SHIFT_RIGHT_ASSIGN:
                        value = thisValue.scalar >>> otherValue.scalar;
                        break;
                    case JavaLexer.SHIFT_RIGHT_ASSIGN:
                        value = thisValue.scalar >> otherValue.scalar;
                        break;
                    case JavaLexer.SHIFT_LEFT_ASSIGN:
                        value = thisValue.scalar << otherValue.scalar;
                        break;
                    case JavaLexer.DIV_ASSIGN:
                        value = thisValue.scalar / otherValue.scalar;
                        break;
                    case JavaLexer.STAR_ASSIGN:
                        value = thisValue.scalar / otherValue.scalar;
                        break;
                    case JavaLexer.PLUS_ASSIGN:
                        value = thisValue.scalar + otherValue.scalar;
                        break;
                    case JavaLexer.MINUS_ASSIGN:
                        value = thisValue.scalar - otherValue.scalar;
                        break;
                    case JavaLexer.MOD_ASSIGN:
                        value = thisValue.scalar % otherValue.scalar;
                        break;
                    default:
                        System.err.println("Bad operator in Integer binary operation self " + operation);
                        System.exit(-1);
                }
                newValues.add(new UniversesInteger(value, metadata));
            }
        }
        values = newValues;
        return this;
    }
}
