import java.util.Scanner;

public class SMS extends MessageBroadcaster{
  private String phoneNumber;

  public SMS(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean showDialog(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sending an SMS message? (y|n) ");
    String answer = scanner.next();
    if(answer.contains("y")){
      return true;
    }
    return false;
  }

  @Override
  public void closeDialog(){
    System.out.println("Closing the SMS dialog.");
  }

  @Override
  public boolean send(String message){
    simulateNetworkLatency();
    System.out.println("Message: '" + message + "' was sent as an SMS message to " + this.phoneNumber);
    return true;
  }

}
