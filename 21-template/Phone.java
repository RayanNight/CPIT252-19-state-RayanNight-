import java.util.Scanner;

public class Phone extends MessageBroadcaster{
  private String phoneNumber;

  public Phone(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean showDialog(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calling and leaving a voice message? (y|n) ");
    String answer = scanner.next();
    if(answer.contains("y")){
      return true;
    }
    return false;
  }

  @Override
  public void closeDialog(){
    System.out.println("Closing the phone dialog.");
  }

  @Override
  public boolean send(String message){
    simulateNetworkLatency();
    System.out.println("Message: '" + message + "' was delivered as a voice message to " + this.phoneNumber);
    return true;
  }

}
