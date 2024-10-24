package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeStamp;

/**
 * A BooleanPair is a boolean value and a TimeStamp
 *
 * @author curt
 */
public class Triple<T extends Pair> implements Comparable<Triple> {

    T a;
    T b;
    TimeStamp time;

    public Triple(T a, T b, TimeStamp t) {
        this.a = a;
        this.b = b;
        time = t;
    }

    public TimeStamp getTime() {
        return time;
    }

    public T getPair1() {
        return a;
    }

    public T getPair2() {
        return b;
    }

    @Override
    public int compareTo(Triple other) {
        int returnVal = time.compareTo(other.time);
        //if (returnVal == 0) {
        //    returnVal = 
        //     (this.value1.compareTo(other.value1))?
        //      (this.value2 == other.value2)? 
        //        0 :
        //        ((this.value2)? 1 : -1) :
        //      ((this.value1)? 1 : -1);
        //}
        return returnVal;
    }
}
