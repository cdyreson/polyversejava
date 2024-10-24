/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.metadata.TemporalElement;
import edu.usu.polyverse.Config;
import edu.usu.utils.Stopwatch;
import edu.usu.polyverse.grammar.JavaLexer;
import edu.usu.utils.Stopwatch;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*mv enter*/
public class TestLoopObj {

    static PolyverseContext<TemporalElement> defaultPolyverse = new PolyverseContext(new TemporalElement());

    public static void main(String[] args) throws IOException {
        //int x = 0;
        //int y = 1;
        //x = y;
        //y = z+3;
        Stopwatch sw = new Stopwatch();
        int max = Config.max;
        //List<PolyverseInteger> vars = new ArrayList();
        PolyverseContext vtop = Config.defaultContext;
        for (int i = 0; i < 10; i++) {
            List<Integer> a = new ArrayList();
            List<Integer> b = new ArrayList();
            for (int j = 0; j < ((10 * i) + 1); j++) {
                a.add(j);
                                b.add(j);
            }
            //Integer foo[] = new Integer[a.size() * b.size()];
            int count = 0;
            sw.start();
            for (int k = 0; k < max; k++) {
                //PolyverseBoolean tp1 = x.booleanOperation(vtop, JavaLexer.NOT_EQUAL, new PolyverseInteger(3, vtop));

                for (Integer x : a) {
                    for (Integer y : b) {
                        if (x.intValue() != y.intValue()) {
                        //    foo[count++] = x * y;
                        Integer z = x*y;
                        //} else {
                        //    foo[count] = 0;
                        }
                    }
                }
            }
            sw.stop();
            System.out.println(sw.readTime());
            /*
            if (foo.length > 1) {
                System.out.println(foo[Math.max(foo.length - 1, a.size())]);
            } else {
                System.out.println("asdf");
            }
            */
            sw.reset();
        }

    }
}
