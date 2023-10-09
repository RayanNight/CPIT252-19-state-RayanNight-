package flyweightExample;

public class glyph {

    private char c;

    public glyph(char c) {
        this.c = c;
    }

    public String myPosition(int position) {
        return "" + position + " " + this.c + ": " + this;
    }

    public String toString() {
        return "glyph<" + this.c + ">";
    }
}
