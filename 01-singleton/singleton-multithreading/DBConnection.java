package singletonMultiThreadingExample;

public class DBConnection{
  // Create an instance here early on and the JVM will guarantee that the 
  // instance will be created before any thread accessed it. 
  private static DBConnection uniqueInstance = new DBConnection();;

  // properties or instance variables here
  private int portNumber;
  private String hostName;
  // TODO: Add getters and setters

  private DBConnection(){}

  public static  DBConnection getInstance(){
    return uniqueInstance;
  }
}

