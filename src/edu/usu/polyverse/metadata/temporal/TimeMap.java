package edu.usu.polyverse.metadata.temporal;

import java.util.*;

/**
 * This class represents a collection of TimeStamps.
 *
 * @author curt
 */
public class TimeMap implements Iterable<TimeStamp> {

    PriorityQueue<TimeStamp> queue;

    public TimeMap() {
        queue = new PriorityQueue();
    }

    public void assignNonDestructive(TimeStamp t) {
        queue.add(t);
    }

    @Override
    public Iterator<TimeStamp> iterator() {
        return queue.iterator();
    }

    @Override
    public String toString() {
        String s = "";
        for (TimeStamp t : queue) {
            s += t;
        }
        return s;
    }

}
