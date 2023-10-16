public class ChipotleSauce extends CondimentDecorator {
    public ChipotleSauce(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public String getDescription() {
        return sandwich.getDescription() + ", Chipotle Sauce";
    }

    public double cost() {
        return 0.25 + sandwich.cost();
    }
}