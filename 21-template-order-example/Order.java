public interface Order {

    default void placeOrder() {
        verifyOrder();
        processOrder();
        confirmOrder();
    }

    abstract void verifyOrder();

    abstract void processOrder();

    abstract void confirmOrder();
}
