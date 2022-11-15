package flyweightExample;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class useFlyweight {

    public static void main(String[] args) {
        characterFactory factory = new characterFactory();

        List<glyph> l = new LinkedList<glyph>();

        System.out.println(
            "Number of flyweights: " +
            factory.numberOfFlyweights());

        // try changing the number of this loop to experiment with
        // the effects of the flyweight pattern.

        for (int i = 0; i < 1000; i++) {
            char c = (char)(Math.random() * 26 + 'a');
            glyph g = factory.getFlyweight(c);
            l.add(g);
        }

        int j = 0;

        for (glyph g : l) {
            System.out.println(g.myPosition(j++));
        }

        System.out.println(
            "Number of flyweights: " +
            factory.numberOfFlyweights());

    }
}
