public class MaintenanceOrder implements Order {

    private String id;

    public MaintenanceOrder(String id) {
        this.id = id;
    }

    @Override
    public void verifyOrder() {
        System.out.println("We're verifying a new mainteance order");
    }

    @Override
    public void processOrder() {
        System.out.println("We're processing the mainteance order");
    }

    @Override
    public void confirmOrder() {
        System.out.println(
            "We're confirming the completion of the mainteance order"
        );
    }

    public String toSTring() {
        return "Order: " + this.id;
    }
}
