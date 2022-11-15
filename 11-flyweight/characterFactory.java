package flyweightExample;

import java.util.Map;
import java.util.HashMap;

public class characterFactory {

    private Map<Character, glyph> flyweights = new HashMap<Character, glyph>();

    public glyph getFlyweight(char c) {
        Character key = Character.valueOf(c);
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        } else {
            glyph g = new glyph(c);
            flyweights.put(key, g);
            return g;
        }
    }

    public int numberOfFlyweights() {
        return flyweights.size();
    }
}
