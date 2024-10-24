/*
 * Testing code
 */
package edu.usu.polyverse;

import edu.usu.polyverse.scalar.PolyverseBoolean;
import edu.usu.polyverse.metadata.temporal.TimeMap;
import edu.usu.polyverse.metadata.temporal.TimeStamp;

/**
 *
 * @author Curt
 */
public class Test {

    public static void main(String[] args) {
        PolyverseBoolean b1 = new PolyverseBoolean();
        PolyverseBoolean b2 = new PolyverseBoolean();
        TimeStamp t1 = new TimeStamp(1, 3);
        TimeStamp t2 = new TimeStamp(5, 7);
        TimeStamp t3 = new TimeStamp(2, 6);
        TimeStamp t4 = new TimeStamp(9, 11);
        TimeMap tm1 = new TimeMap();
        tm1.assignNonDestructive(t3);
/*
        b1.assignNonDestructive(true, t1);
        b1.assignNonDestructive(false, t2);
        b2.assignNonDestructive(true, t3);
        b2.assignNonDestructive(false, t4);
        System.out.println("Global time map is " + tm1);
        System.out.println("b1 is " + b1);
        System.out.println("b2 is " + b2);
        System.out.println("Testing b1 | b2: " + b1.binaryOp(tm1, PolyverseBoolean.OR, b2));
        System.out.println("Testing b1 & b2: " +b1.binaryOp(tm1, PolyverseBoolean.AND, b2));
        System.out.println("Testing !b1: " +b1.unaryOp(tm1, PolyverseBoolean.NOT));
*/
    }
}
