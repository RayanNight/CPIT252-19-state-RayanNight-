public class Sooubway {
    public static void main(String[] args) {
        Sandwich chickenSandwich = new Chicken();
        System.out.println(chickenSandwich.getDescription() + " $" + chickenSandwich.cost());

        Sandwich chickSandwichWithCond = new Chicken();
        chickSandwichWithCond = new ChipotleSauce(chickSandwichWithCond);
        chickenSandwich = new Mayonnaise(chickSandwichWithCond);

        System.out.println(chickenSandwich.getDescription() + " $" + chickenSandwich.cost());

    }
}
