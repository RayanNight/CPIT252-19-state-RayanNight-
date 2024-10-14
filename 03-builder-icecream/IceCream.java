public class IceCream {

    // Required IceCream fields
    private String type; // cup or cone
    private String size; // regular, medium, large
    private String flavor; // chocolate, strawberry, etc.

    // optional fields
    private String[] toppings;
    private String sauce;

    private IceCream(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.flavor = builder.flavor;
        this.toppings = builder.toppings;
        this.sauce = builder.sauce;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ice cream:\n " +
                this.type + " \t" + this.size + "\t" + this.flavor);
        if (this.sauce != "") {
            sb.append("\nSauce: " + sauce);
        }
        if (this.toppings.length > 0) {
            sb.append("\nToppings:");
            for (String t : toppings) {
                sb.append("\t" + t);
            }
        }
        return sb.toString();
    }

    public static class Builder {
        // Required builder fields
        private String type; // cup or cone
        private String flavor;
        private String[] toppings;

        // Optional builder fields
        private String sauce;
        private String size; // regular, medium, large

        public Builder(String type, String size, String flavor) {
            this.type = type;
            this.size = size;
            this.flavor = flavor;
        }

        public Builder withToppings(String[] toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public IceCream build() {
            return new IceCream(this);
        }

    }

}