package edu.usu.polyverse.iterate;

import edu.usu.polyverse.metadata.temporal.TimeMap;
import edu.usu.polyverse.metadata.temporal.TimeStamp;
import java.util.*;

/**
 * A sequenced Boolean is a List of boolean values, each of which is
 * timestamped. The List is sorted by the start time.
 *
 * @author curt
 */
public class MergedTripleIterator<Q extends Pair> implements Iterator<Triple> {

    Iterator<Q> alphaIter, betaIter;
    Triple nextTriple;
    Q betaPair, alphaPair;
    TimeStamp betaStamp, tStamp, alphaStamp;
    long alphaStart, alphaEnd, betaStart, betaEnd, tStart, tEnd, startBoundary, endBoundary;
    Iterator<TimeStamp> tIter;
    boolean earlyExit;

    public MergedTripleIterator(TimeMap t, Iterator<Q> a, Iterator<Q> b) {
        alphaIter = a;
        betaIter = b;
        tIter = t.iterator();
        earlyExit = false;
        advanceTimeMap();
        advanceAlpha();
        advanceBeta();
        startBoundary = getLatestStart();
        endBoundary = getEarliestEnd();
        //System.out.println("Boundaries start " + startBoundary + " end " + endBoundary);
    }

    private long getEarliestEnd() {
        if (earlyExit) {
            return Long.MIN_VALUE;
        }
        return (tEnd > alphaEnd) ? ((alphaEnd > betaEnd) ? betaEnd : alphaEnd) : ((tEnd > betaEnd) ? betaEnd : tEnd);
    }

    private long getLatestStart() {
        if (earlyExit) {
            return Long.MAX_VALUE;
        }
        return (tStart < alphaStart) ? ((alphaStart < betaStart) ? betaStart : alphaStart) : ((tStart < betaStart) ? betaStart : tStart);
    }

    /*
     Advance to the next overlap of the three 
     */
    private boolean advanceToOverlap() {
        //System.out.println("advanceToOverlap " + earlyExit);
        if (earlyExit) {
            return false;
        }
        while (alphaEnd < startBoundary) {
            if (!advanceAlpha()) {
                return false;
            }
        }

        while (betaEnd < startBoundary) {
            if (!advanceBeta()) {
                return false;
            }
        }

        while (tEnd < startBoundary) {
            if (!advanceTimeMap()) {
                return false;
            }
        }

        // Check to make sure we have overlap
        startBoundary = getLatestStart();
        endBoundary = getEarliestEnd();
        //System.out.println("Checking start " + startBoundary + " end " + endBoundary);
        if (startBoundary > endBoundary) {
            return advanceToOverlap();
        }
        return true;
    }

    /* 
     Advance past the end of the current intersection
     by moving one stamp ahead in the process. 
     */
    private boolean advanceFinisher(long e) {
        //System.out.println("advancefinsher " + e);
        boolean result = false;
        if (e == alphaEnd) {
            result = advanceAlpha();
        } else if (e == betaEnd) {
            result = advanceBeta();
        } else {
            result = advanceTimeMap();
        }
        startBoundary = getLatestStart();
        endBoundary = getEarliestEnd();
        return result;
    }

    private boolean advanceTimeMap() {
        if (tIter.hasNext()) {
            tStamp = tIter.next();
            tStart = tStamp.getStartAsLong();
            tEnd = tStamp.getEndAsLong();
            //System.out.println("advanceTimeMap " + tStamp);
            return true;
        }
        //System.out.println("advanceTimeMap exit ");
        earlyExit = true;
        return false;
    }

    private boolean advanceBeta() {
        if (betaIter.hasNext()) {
            betaPair = betaIter.next();
            betaStamp = betaPair.getTime();
            betaStart = betaStamp.getStartAsLong();
            betaEnd = betaStamp.getEndAsLong();
            //System.out.println("advanceBeta " + betaStamp);
            return true;
        }
        //System.out.println("advanceBeta exit ");
        earlyExit = true;
        return false;
    }

    private boolean advanceAlpha() {
        if (alphaIter.hasNext()) {
            alphaPair = alphaIter.next();
            alphaStamp = alphaPair.getTime();
            alphaStart = alphaStamp.getStartAsLong();
            alphaEnd = alphaStamp.getEndAsLong();
            //System.out.println("advanceAlpha " + alphaStamp);
            return true;
        }
        //System.out.println("advanceAlpha exit ");
        earlyExit = true;
        return false;
    }

    @Override
    public Triple next() {
        return nextTriple;
    }

    @Override
    public void remove() {

    }

    @Override
    public boolean hasNext() {
        if (earlyExit) {
            return false;
        }

        if (!advanceToOverlap()) {
            return false;
        }

        //System.out.println("Checking " + tStamp + " alpha " + alphaStamp + " beta " + betaStamp);
        // We have overlaps
        TimeStamp intersection = new TimeStamp(startBoundary, endBoundary);
        //System.out.println("insection " + intersection);
        nextTriple = new Triple(alphaPair, betaPair, intersection);
        // Advance someone
        return advanceFinisher(endBoundary);
    }

}
