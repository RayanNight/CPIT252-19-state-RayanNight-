public class BlueCheese extends CondimentDecorator {
    public BlueCheese(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Blue Cheese";
    }

    public double cost() {
        return 0.50 + sandwich.cost();
    }
}