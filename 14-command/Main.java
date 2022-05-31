package command;

public class Main { 

  public static void main(String[] args) { 

    Stock abcStock = new Stock(); 

    Order buyStockOrder = new BuyStock(abcStock); 

    Order sellStockOrder = new SellStock(abcStock); 

    Broker broker = new Broker(); 

    broker.placeOrders(buyStockOrder);

    broker.placeOrders(sellStockOrder);
  } 
} 

