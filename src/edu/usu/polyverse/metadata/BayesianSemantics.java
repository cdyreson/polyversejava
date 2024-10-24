package edu.usu.polyverse.metadata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author curt
 */
public class BayesianSemantics implements Semantics<Double> {

    @Override
    public PolyverseContext<Double> meld(PolyverseContext<Double> alpha, PolyverseContext<Double> beta) {
        List<Double> result = new ArrayList();
        if (alpha.isList) {
            if (beta.isList) {
                for (Double a : alpha.valueList) {
                    for (Double b : beta.valueList) {
                        Double c = a * b;
                        result.add(c);
                    }
                }
            } else {
                for (Double a : alpha.valueList) {
                    Double c = a * beta.value;
                    result.add(c);
                }
            }
        } else {
            if (beta.isList) {
                for (Double b : beta.valueList) {
                    Double c = b * alpha.value;
                    result.add(c);
                }
            } else {
                Double c = alpha.value * beta.value;
                return new PolyverseContext<Double>(c);
            }
        }
        if (result.size() == 1) {
            return new PolyverseContext<Double>(result.get(0));
        }
        return new PolyverseContext<Double>(result);
    }

    @Override
    public PolyverseContext<Double> meld(PolyverseContext<Double> alpha, PolyverseContext<Double> beta, PolyverseContext<Double> gamma) {
        List<Double> result = new ArrayList();
        if (alpha.isList) {
            if (beta.isList) {
                if (gamma.isList) {
                    for (Double a : alpha.valueList) {
                        for (Double b : beta.valueList) {
                            Double c = a * b;
                            for (Double g : gamma.valueList) {
                                c = c * g;
                                result.add(c);
                            }
                        }
                    }
                } else {
                    for (Double a : alpha.valueList) {
                        for (Double b : beta.valueList) {
                            Double c = a * b;
                            c = c * gamma.value;
                            result.add(c);
                        }
                    }
                }
            } else {
                if (gamma.isList) {
                    for (Double a : alpha.valueList) {
                        Double c = a * beta.value;
                        for (Double g : gamma.valueList) {
                            c = c * g;
                            result.add(c);
                        }
                    }
                } else {
                    for (Double a : alpha.valueList) {
                        Double c = a * beta.value;
                        c = c * gamma.value;
                        result.add(c);
                    }
                }
            }
        } else {
            if (beta.isList) {
                if (gamma.isList) {
                    for (Double b : beta.valueList) {
                        Double c = alpha.value * b;
                        for (Double g : gamma.valueList) {
                            c = c * g;
                            result.add(c);
                        }
                    }
                } else {
                    for (Double b : beta.valueList) {
                        Double c = alpha.value * b;
                        c = c * gamma.value;
                        result.add(c);
                    }
                }
            } else {
                if (gamma.isList) {
                    Double c = alpha.value * beta.value;
                    for (Double g : gamma.valueList) {
                        c = c * g;
                        result.add(c);
                    }
                } else {
                    Double c = alpha.value * beta.value * gamma.value;
                    new PolyverseContext<Double>(c);
                }
            }
        }

        if (result.size()
                == 1) {
            return new PolyverseContext<Double>(result.get(0));
        }

        return new PolyverseContext<Double>(result);
    }

}
