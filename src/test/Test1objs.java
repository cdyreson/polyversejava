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
import java.util.List;
import java.util.Set;

/*mv enter*/
public class Test1objs {

    static PolyverseContext<TemporalElement> defaultPolyverse = new PolyverseContext(new TemporalElement());

    public static void main(String[] args) throws IOException {
        //int x = 0;
        //int y = 1;
        //x = y;
        //y = z+3;
        Stopwatch sw = new Stopwatch();
        int max = Config.max;

        Integer y1 = 3;
        sw.start();
        for (int i = 0; i < max; i++) {

            if (y1 != 100) {
                y1 += 3;
            }

        }
        sw.stop();
        System.out.println(sw.readTime() + "java object ifassign time");
        sw.reset();
        y1 = 2;
        sw.start();
        for (int i = 0; i < max; i++) {

            if (y1 >= 100) {
                y1 += 3;
            }

        }
        sw.stop();
        System.out.println(sw.readTime() + " java object if time");
        sw.reset();
        int y = 3;
        sw.start();
        for (int i = 0; i < max; i++) {

            if (y != 100) {
                y += 3;
            }

        }
        sw.stop();
        System.out.println(sw.readTime() + "java ifassign time");
        sw.reset();
        y = 2;
        sw.start();
        for (int i = 0; i < max; i++) {

            if (y >= 100) {
                y += 3;
            }

        }
        sw.stop();
        System.out.println(sw.readTime() + " java if time");
        sw.reset();
        sw.start();
        for (int i = 0; i < max; i++) {

        }
        sw.stop();
        System.out.println(sw.readTime() + " loop time");
    }
}
