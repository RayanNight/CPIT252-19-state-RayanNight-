package singletonMultiThreadingExample;

/**
 * Double-checked locking singelton implementation.
 */

public class DBConnection {
  // The volatile keyword guarantees visibility but NOT atomicity. It ensures that
  // multiple threads handle the variable correctly becuase it's always read from
  // main
  // memory and not the thread's cache.
  private static volatile DBConnection uniqueInstance;

  // properties or instance variables here
  private int portNumber;

  private String hostName;
  // TODO: Add tters and setters

  private DBConnection() {}

  public static DBConnection getInstance(){
    if (uniqueInstance == null) { // if there's no instance, enter the synchronized block
      synchronized (DBConnection.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new DBConnection();
        }
      }
    }
    return uniqueInstance;
  }
}
