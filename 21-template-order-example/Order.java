public interface Order {
    default final void placeOrder() {
        verifyOrder();
        processOrder();
        confirmOrder();
    }

    void verifyOrder();

    void processOrder();

    void confirmOrder();
}
