public class Mayonnaise extends CondimentDecorator {

    public Mayonnaise(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Mayonnaise";
    }

    public double cost() {
        return .10 + sandwich.cost();
    }
}