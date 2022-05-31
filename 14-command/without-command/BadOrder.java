package command;

public class BadOrder{

  private Stock stock;

  public BadOrder(Stock stock){
    this.stock = stock;
  }
  public void execute(String type){
    if (type == "purchase"){
      stock.buy();
    }
    else if(type == "sell"){
      stock.sell();
    }
    else if(type == "transfer"){
      stock.transfer();
    }
  }
}

