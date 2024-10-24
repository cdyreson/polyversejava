package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeMap;
import java.util.*;

/**
 * A sequenced Boolean is a List of boolean values, each of which is
 * timestamped. The List is sorted by the start time.
 *
 * @author curt
 */
public class MergedPairIterable<Q extends Pair> implements Iterable<Q> {  
    MergedPairIterator<Q> iter;

    public MergedPairIterable(TimeMap t, Iterator<Q> a) {
        iter = new MergedPairIterator(t, a);
    }

    @Override
    public Iterator iterator() {
        return iter;
    }
}
