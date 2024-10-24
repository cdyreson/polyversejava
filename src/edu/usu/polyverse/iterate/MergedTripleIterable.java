package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeMap;
import java.util.*;

/**
 * A sequenced Boolean is a List of boolean values, each of which is
 * timestamped. The List is sorted by the start time.
 *
 * @author curt
 */
public class MergedTripleIterable<T extends Pair> implements Iterable<Triple> {    
    MergedTripleIterator iter;

    public MergedTripleIterable(TimeMap t, Iterator<T> a, Iterator<T> b) {
        iter = new MergedTripleIterator(t, a, b);
    }

    @Override
    public Iterator<Triple> iterator() {
        return iter;
    }
}
