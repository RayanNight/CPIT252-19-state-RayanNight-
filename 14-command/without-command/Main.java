package command;

public class Main { 

  public static void main(String[] args) { 

    Stock abcStock = new Stock(); 

    Order buyStockOrder = new BuyStock(abcStock); 
    Order sellStockOrder = new SellStock(abcStock); 
    Order transferStockOrder = new TransferStock(abcStock);

    Broker broker = new Broker(); 

    broker.placeOrders(buyStockOrder);
    broker.placeOrders(sellStockOrder);
    broker.placeOrders(transferStockOrder);

    // Bad: Without command
    BadOrder badOrder = new BadOrder(abcStock);
    badOrder.execute(Utils.BUY);
    badOrder.execute(Utils.SELL);
    badOrder.execute(Utils.TRANSFER);


  } 
} 

