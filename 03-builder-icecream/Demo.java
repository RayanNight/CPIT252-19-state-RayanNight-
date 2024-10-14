public class Demo{
    public static void main(String[] args) {
        IceCream chocolateIcecream = 
        new IceCream.Builder("cone", "small", "chocolate")
        .withSauce("Caramel")
        .withToppings(new String[]{"Chocolate chip cookie", "Oreo crumbs", "M&M's"})
        .build();
        System.out.println(chocolateIcecream);
    }
}