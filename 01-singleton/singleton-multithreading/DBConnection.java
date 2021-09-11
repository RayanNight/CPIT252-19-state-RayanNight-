package singletonMultiThreadingExample;

public class DBConnection{
  private static DBConnection uniqueInstance;

  // properties or instance variables here
  private int portNumber;
  private String hostName;
  // TODO: Add getters and setters

  private DBConnection(){}
  // Adding synchronized will cause substantial overhead and can decrease performance
  // by a factor of 100.

  public static synchronized DBConnection getInstance(){
    if (uniqueInstance == null){
      uniqueInstance = new DBConnection();
    }
    return uniqueInstance;
  }
}

