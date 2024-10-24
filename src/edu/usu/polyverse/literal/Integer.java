/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.usu.polyverse.literal;

import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.scalar.PolyverseBoolean;
import edu.usu.polyverse.scalar.PolyverseInteger;
import edu.usu.polyverse.scalar.UniversesInteger;

/**
 *
 * @author dyreson
 */
public class Integer {

    // A list of integer values paird with metadata
    private UniversesInteger value;
    boolean debug = false;

    public Integer(UniversesInteger v) {
        value = v;
    }

    public Integer(PolyverseContext m, int v) {
        value = new UniversesInteger(v, m);
    }

    public UniversesInteger getValue() {
        return this.value;
    }

    public String toString() {
        String s = "";
        s = " value " + value.getValue() + " Metadata( " + value.getPolyverseContext() + ")\n";
        return s;
    }

    /*
     Implementation of all operations
     */
    public PolyverseBoolean booleanOperation(PolyverseContext vTop, int operation, Integer other) {
        PolyverseInteger m = new PolyverseInteger(value);
        return m.booleanOperation(vTop, operation, new PolyverseInteger(other.value));
    }

    public PolyverseInteger unaryOperationSelf(PolyverseContext vTop, int operation) {
        PolyverseInteger m = new PolyverseInteger(value);
        return m.unaryOperationSelf(vTop, operation);
    }

    public PolyverseInteger unaryOperation(PolyverseContext vTop, int operation) {
        PolyverseInteger m = new PolyverseInteger(value);
        return m.unaryOperation(vTop, operation);
    }

    public PolyverseInteger binaryOperation(PolyverseContext vTop, int operation, Integer other) {
        PolyverseInteger m = new PolyverseInteger(value);
        return m.binaryOperation(vTop, operation, new PolyverseInteger(other.value));
    }

    public PolyverseInteger binaryOperationSelf(PolyverseContext vTop, int operation, Integer other) {
        PolyverseInteger m = new PolyverseInteger(value);
        return m.binaryOperationSelf(vTop, operation, new PolyverseInteger(other.value));
    }
}
