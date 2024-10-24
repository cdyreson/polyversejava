/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import edu.usu.polyverse.scalar.UniversesInteger;
import edu.usu.polyverse.scalar.PolyverseBoolean;
import edu.usu.polyverse.metadata.PolyverseContext;
import edu.usu.polyverse.scalar.PolyverseInteger;
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
public class TestLoop {

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
            List<UniversesInteger> a = new ArrayList();
            for (int j = 0; j < ((10 * i) + 1); j++) {
                a.add(new UniversesInteger(j, vtop));
            }
            //vars.add(new PolyverseInteger(a));
            PolyverseInteger x = new PolyverseInteger(a);
            PolyverseInteger y = new PolyverseInteger(a);
            sw.start();
            for (int k = 0; k < max; k++) {
                //PolyverseBoolean tp1 = x.booleanOperation(vtop, JavaLexer.NOT_EQUAL, new PolyverseInteger(3, vtop));
                PolyverseBoolean tp1 = x.booleanOperation(vtop, JavaLexer.NOT_EQUAL, y);
                PolyverseContext trueMVs = tp1.getTruePolyverses();
                if (!trueMVs.isEmpty()) {
                    //x.binaryOperationSelf(trueMVs, JavaLexer.PLUS, new PolyverseInteger(3, vtop));
                    x.binaryOperationSelf(trueMVs, JavaLexer.PLUS, y);
                }

            }
            sw.stop();
            System.out.println(sw.readTime());
            sw.reset();
        }

    }
}
