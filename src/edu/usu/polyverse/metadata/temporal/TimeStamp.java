package edu.usu.polyverse.metadata.temporal;

/**
 * This class represents a Time value. Currently it is just a Period.
 *
 * @author curt
 */
public class TimeStamp extends Period implements Comparable<TimeStamp> {

    public TimeStamp(long s, long e) {
        super(s, e);
    }

    public TimeStamp(Instant s, Instant e) {
        super(s, e);
    }

    public long getStartAsLong() {
        return this.start.time;
    }
    
    public long getEndAsLong() {
        return this.end.time;
    }
    
    @Override
    public int compareTo(TimeStamp other) {
        return this.compareTo((Period) other);
    }

    /**
     * Compute the intersection of two timeStamps.
     *
     * @param beta - Period to intersect
     * @return null if they do not interest, the intersection otherwise
     *
     */
    public TimeStamp intersect(TimeStamp beta) {
        //if (!overlaps(beta)) {
        //    return null;
        //}
        return new TimeStamp((this.start.time < beta.start.time) ? beta.start : this.start,
                (this.end.time < beta.end.time) ? this.end : beta.end);
    }
}
