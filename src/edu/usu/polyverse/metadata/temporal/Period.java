 /*
 * The <code>Period</code> class implements a semantics for operations on
 * Periods.
 * 
 * Below is an example of how one might use this semantics.
 * <pre>
 *     Period j = new Period(100,104);
 *     Period i = new Period(20,23);
 *     if (i.precedes(j)) ...
 * </pre> 
 * Just a few operations are currently represented to give an idea of the
 * eventual interface. All the operations are on individual kinds of time
 * values, e.g., Instant, Period, Interval. We need to expand this with a
 * complete set of temporal operators implementing Allen's algebra.
 */
package edu.usu.polyverse.metadata.temporal;

/**
 *
 * @author curt
 */
public class Period {

    Instant start;
    Instant end;

    public Period(Instant s, Instant e) {
        start = s;
        end = e;
    }

    public Period(long s, long e) {
        start = new Instant(s);
        end = new Instant(e);
    }

    /**
     * Does the end of a Period precede the start of another,
     *
     * @param beta - Period to compare
     * @return this.end < beta.start
     *
     */
    public boolean precedes(Period beta) {
        return this.end.time < beta.start.time;
    }

    /**
     * Does this Period begin at the same time as another, but end before it,
     *
     * @return this.start == beta.start AND this.end < beta.end
     *
     */
    public boolean starts(Period beta) {
        return this.start.time == beta.start.time && this.end.time < beta.end.time;
    }

    /**
     * Does this Period finish at the same time as another, but start after it,
     *
     * @param beta - Period to compare
     * @return this.end == beta.end AND this.start < beta.start
     *
     */
    public boolean finishes(Period beta) {
        return this.end.time == beta.end.time && this.start.time < beta.start.time;
    }

    /**
     * Does the end of a Period meet the start of another Period. This is the
     * inverse of metBy().
     *
     * @param beta - Period to compare
     * @return this.end == beta.start
     *
     */
    public boolean meets(Period beta) {
        return this.end.time == beta.start.time;
    }

    /**
     * Is the start of a Period metBy the start of another Period. This is the
     * inverse of meets().
     *
     * @param beta - Period to compare
     * @return this.start == beta.end
     *
     */
    public boolean metBy(Period beta) {
        return this.start.time == beta.end.time;
    }

    /**
     * Does one Period overlap another? Two Periods overlap if they intersect in
     * time. This operation is symmetric.
     *
     * @param beta - Period to compare
     * @return this overlaps beta
     *
     */
    public boolean overlaps(Period beta) {
        boolean result = true;
        if (beta.start.time <= this.start.time) {
            result = (this.start.time <= beta.end.time);
        } else {
            result = (beta.start.time <= this.end.time);
        }
        System.out.println("Overlaps result " + result + " this " + this + " beta " + beta);
        return result;
    }

    /**
     * Does this Period contain another? A periods contains another if it starts
     * before it and ends after it. The containment need not be strict.
     *
     * @param beta - Period to compare
     * @return this.start <= beta.start AND this.end >= beta.end
     *
     */
    public boolean contains(Period beta) {
        return this.start.time <= beta.start.time && this.end.time >= beta.end.time;
    }

    /**
     * Is this Period during another? A periods is during another if it starts
     * after it and ends before it. The containment need not be strict.
     *
     * @param beta - Period to compare
     * @return this.start >= beta.start AND this.end <= beta.end
     *
     */
    public boolean during(Period beta) {
        return this.start.time >= beta.start.time && this.end.time <= beta.end.time;
    }

    /**
     * Does this Period represent the same times as another? A period is equalTo
     * another if it both starts and finishes it. This operation is symmetric.
     *
     * @param beta - Period to compare
     * @return this.start == beta.start AND this.end == beta.end
     *
     */
    public boolean equalTo(Period beta) {
        return this.start.time == beta.start.time && this.end.time == beta.end.time;
    }

    /**
     * Compute the intersection of two periods.
     *
     * @param beta - Period to intersect
     * @return null if they do not interest, the intersection otherwise
     *
     */
    public Period intersect(Period beta) {
        //if (!overlaps(beta)) {
        //    return null;
        //}
        return new Period((this.start.time < beta.start.time) ? beta.start : this.start,
                (this.end.time < beta.end.time) ? this.end : beta.end);
    }
    
    /*
      comparetTo is negative if this < other
                    positive if this > other
               and  zero     if this == other
    */
    public int compareTo(Period other) {
        if (this.start.time < other.start.time) return -1;
        if (this.start.time > other.start.time) return 1;
        if (this.end.time < other.end.time) return -1;
        if (this.end.time > other.end.time) return 1;
        return 0;
    }
    
    @Override
    public String toString() {
        return "[" + start + "-" + end + "]";
    }

}
