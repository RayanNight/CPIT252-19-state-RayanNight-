import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    MessageBroadcaster mb = null;

    // Enter the message.
    System.out.print("Please enter the message text: ");
    String message = reader.readLine();

    System.out.println("\nChoose broadcast method for posting the message.\n" +
        "1 - SMS\n" +
        "2 - Phone\n" +
        "3 - Email");
    int choice = Integer.parseInt(reader.readLine());

    // Create proper network object and send the message.
    if (choice == 1) {
      System.out.print("Please enter the phone number: ");
      String phoneNumber = reader.readLine();
      mb = new SMS(phoneNumber);
    } else if (choice == 2) {
      System.out.print("Please enter the phone number: ");
      String phoneNumber = reader.readLine();
      mb = new Phone(phoneNumber);
    } else if (choice == 3) {
      System.out.print("Please enter the email address: ");
      String emailAddress = reader.readLine();
      mb = new Email(emailAddress);
    }
    mb.sendBroadcast(message);
  }
}
