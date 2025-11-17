public abstract class Order {

    public final void placeOrder() {
        verifyOrder();
        processOrder();
        confirmOrder();
    }

    abstract void verifyOrder();

    abstract void processOrder();

    abstract void confirmOrder();
}
