package edu.usu.polyverse.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author curt
 */
public class SequencedSemantics implements Semantics<TemporalElement> {

    @Override
    public PolyverseContext<TemporalElement> meld(PolyverseContext<TemporalElement> alpha, PolyverseContext<TemporalElement> beta) {
        List<TemporalElement> result = new ArrayList();
        if (alpha.isList) {
            if (beta.isList) {
                for (TemporalElement a : alpha.valueList) {
                    for (TemporalElement b : beta.valueList) {
                        TemporalElement c = a.intersect(b);
                        if (!c.isEmpty()) {
                            result.add(c);
                        }
                    }
                }
            } else {
                for (TemporalElement a : alpha.valueList) {
                    TemporalElement c = a.intersect(beta.value);
                    if (!c.isEmpty()) {
                        result.add(c);
                    }
                }
            }
        } else {
            if (beta.isList) {
                for (TemporalElement b : beta.valueList) {
                    TemporalElement c = b.intersect(alpha.value);
                    if (!c.isEmpty()) {
                        result.add(c);
                    }
                }
            } else {
                TemporalElement c = alpha.value.intersect(beta.value);
                if (!c.isEmpty()) {
                    return new PolyverseContext<TemporalElement>(c);
                }
            }
        }
        if (result.size() == 1) {
            return new PolyverseContext<TemporalElement>(result.get(0));
        }
        return new PolyverseContext<TemporalElement>(result);
    }

    @Override
    public PolyverseContext<TemporalElement> meld(PolyverseContext<TemporalElement> alpha, PolyverseContext<TemporalElement> beta, PolyverseContext<TemporalElement> gamma) {
        List<TemporalElement> result = new ArrayList();
        if (alpha.isList) {
            if (beta.isList) {
                if (gamma.isList) {
                    for (TemporalElement a : alpha.valueList) {
                        for (TemporalElement b : beta.valueList) {
                            TemporalElement c = a.intersect(b);
                            if (!c.isEmpty()) {
                                for (TemporalElement g : gamma.valueList) {
                                    c = c.intersect(g);
                                    if (!c.isEmpty()) {
                                        result.add(c);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (TemporalElement a : alpha.valueList) {
                        for (TemporalElement b : beta.valueList) {
                            TemporalElement c = a.intersect(b);
                            if (!c.isEmpty()) {
                                c = c.intersect(gamma.value);
                                if (!c.isEmpty()) {
                                    result.add(c);
                                }
                            }
                        }
                    }
                }
            } else {
                if (gamma.isList) {
                    for (TemporalElement a : alpha.valueList) {
                        TemporalElement c = a.intersect(beta.value);
                        if (!c.isEmpty()) {
                            for (TemporalElement g : gamma.valueList) {
                                c = c.intersect(g);
                                if (!c.isEmpty()) {
                                    result.add(c);
                                }
                            }
                        }
                    }
                } else {
                    for (TemporalElement a : alpha.valueList) {
                        TemporalElement c = a.intersect(beta.value);
                        if (!c.isEmpty()) {
                            c = c.intersect(gamma.value);
                            if (!c.isEmpty()) {
                                result.add(c);
                            }
                        }
                    }
                }
            }
        } else {
            if (beta.isList) {
                if (gamma.isList) {
                    for (TemporalElement b : beta.valueList) {
                        TemporalElement c = alpha.value.intersect(b);
                        if (!c.isEmpty()) {
                            for (TemporalElement g : gamma.valueList) {
                                c = c.intersect(g);
                                if (!c.isEmpty()) {
                                    result.add(c);
                                }
                            }
                        }
                    }
                } else {
                    for (TemporalElement b : beta.valueList) {
                        TemporalElement c = alpha.value.intersect(b);
                        if (!c.isEmpty()) {
                            c = c.intersect(gamma.value);
                            if (!c.isEmpty()) {
                                result.add(c);
                            }
                        }
                    }
                }
            } else {
                if (gamma.isList) {
                    TemporalElement c = alpha.value.intersect(beta.value);
                    if (!c.isEmpty()) {
                        for (TemporalElement g : gamma.valueList) {
                            c = c.intersect(g);
                            if (!c.isEmpty()) {
                                result.add(c);
                            }
                        }
                    }
                } else {
                    TemporalElement c = alpha.value.intersect(beta.value);
                    if (!c.isEmpty()) {
                        c = c.intersect(gamma.value);
                        if (!c.isEmpty()) {
                            new PolyverseContext<TemporalElement>(c);
                        }
                    }
                }
            }
        }
        if (result.size() == 1) {
            return new PolyverseContext<TemporalElement>(result.get(0));
        }
        return new PolyverseContext<TemporalElement>(result);
    }

}
