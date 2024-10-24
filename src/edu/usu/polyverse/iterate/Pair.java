package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeStamp;

/**
 * A BooleanPair is a boolean value and a TimeStamp
 *
 * @author curt
 */
public class Pair implements Comparable<Pair> {
    TimeStamp time;

    public Pair(TimeStamp t) {
        time = t;
    }

    public TimeStamp getTime() {
        return time;
    }

    public Pair newTime(TimeStamp q) {
        return new Pair(q);
    }

    @Override
    public int compareTo(Pair other) {
        int returnVal = time.compareTo(other.time);
        //if (returnVal == 0) {
         //   returnVal = this.value.compareTo(other);
        //}
        return returnVal;
    }
    
}
