package edu.usu.polyverse.metadata.temporal;

/**
 * The <code>Instant</code> class implements a semantics for operations on
 * instants.
 * 
* Below is an example of how one might use this semantics.
 * <pre>
 *     Instant j = new Instant(100);
 *     Instant i = new Instant(20);
 *     i.precedes(j);
 * </pre> Just a few operations are currently represented to give an idea of the
 * eventual interface. All the operations are on individual kinds of time
 * values, e.g., Instant, Period, Interval. We need to expand this with a
 * complete set of temporal operators implementing Allen's algebra.
 * 
* @author Curtis Dyreson
 *
 */
public class Instant {

    protected long time;

    public Instant(long v) {
        time = v;
    }

    /**
     * Does one Instant precede another, that is, is this < beta? @
     *
     *
     * param beta - Instant to compare
     * @return alpha < beta
     *
     */
    public boolean precedes(Instant beta) {
        return time < beta.time;
    }

    /**
     * Does an Instant precede the start of a Period, that is, is alpha <
     * beta.start? @param
     *
     * alpha - Instant to compare @param beta - Period to compare @return alpha
     * < beta.
     *
     * s
     * tart @throws TemporalDataTypeFormationException @throws
     * CalendricSystemServiceException
     *
     */
    public boolean precedes(Period beta) {
        return time < beta.start.time;
    }

    /**
     * Does this Instant represent the same times as another? An instant is
     * equalTo another if it is at the same time. This operation is symmetric.
     *
     * @param beta - Instant to compare
     * @return this == beta
     *
     */
    public boolean equalTo(Instant beta) {
        return this.time == beta.time;
    }

    @Override
    public String toString() {
        return time + "";
    }

}
