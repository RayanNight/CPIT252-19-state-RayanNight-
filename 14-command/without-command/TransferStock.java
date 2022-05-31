package command;

public class TransferStock implements Order{

  private Stock mStock;

  public TransferStock(Stock stock){
    this.mStock = stock;
  }

  @Override
  public void execute(){
    mStock.transfer();
  }
}
