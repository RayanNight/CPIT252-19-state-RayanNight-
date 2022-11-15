package flyweightExample;

public class glyph {

    private char _c;

    public glyph(char c) {
        _c = c;
    }

    public String myPosition(int position) {
        return "" + position + " " + _c + ": " + this;
    }

    // public String toString() {
        // return "glyph<" + _c + ">";
    // }
}
