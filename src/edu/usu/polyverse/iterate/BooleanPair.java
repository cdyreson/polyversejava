package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeStamp;

/**
 * A BooleanPair is a boolean value and a TimeStamp
 *
 * @author curt
 */
public class BooleanPair extends Pair implements Comparable<Pair> {

    boolean value;

    public BooleanPair(boolean v, TimeStamp t) {
        super(t);
        value = v;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public BooleanPair newTime(TimeStamp q) {
        return new BooleanPair(value, q);
    }
    
    public int compareTo(BooleanPair other) {
        int returnVal = time.compareTo(other.time);
        //if (returnVal == 0) {
        //   returnVal = this.value.compareTo(other);
        //}
        return returnVal;
    }

}
