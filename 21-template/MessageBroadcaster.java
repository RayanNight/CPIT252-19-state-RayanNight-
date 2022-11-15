//import java.lang.Thread;
//import java.lang.InterruptedException;

/*
 * Basic class for broadcasting messages
 */
public abstract class MessageBroadcaster{

  // The send broadcast template method. It shows a dialog, 
  // sends a message, and closes the dialog.
  public final boolean sendBroadcast(String message){
    // Show a dialog to confirm before sending.
    // Every implementation uses a different dialog.
    if(showDialog()){
      boolean result = send(message);
      closeDialog();
      return result;
    }
    return false; // sending a message was cancelled.
  }
  // Hooks 
  public abstract boolean showDialog();
  public abstract boolean send(String text);
  public abstract void closeDialog();

  // Simulate network latency
  protected void simulateNetworkLatency() {
    try {
      System.out.println();
      for (int i=0; i < 10; i++) {
        System.out.print(".");
        Thread.sleep(500);
      }
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }
}
