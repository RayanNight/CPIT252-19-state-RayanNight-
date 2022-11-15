import java.util.Scanner;

public class Email extends MessageBroadcaster{
  private String emailAddress;

  public Email(String emailAddress){
    this.emailAddress = emailAddress;
  }

  @Override
  public boolean showDialog(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Sending an Email message? (y|n) ");
    String answer = scanner.next();
    if(answer.contains("y")){
      return true;
    }
    return false;
  }

  @Override
  public void closeDialog(){
    System.out.println("Closing the Email dialog.");
  }

  @Override
  public boolean send(String message){
    simulateNetworkLatency();
    System.out.println("Message: '" + message + "' was sent as an Email message to " + this.emailAddress);
    return true;
  }

}
