package singletonExample;

public class DBConnection{
  private static DBConnection uniqueInstance;

  // properties or instance variables here
  private int portNumber;
  private String hostName;
  // TODO: Add getters and setters

  private DBConnection(){}

  public static DBConnection getInstance(){
    if (uniqueInstance == null){
      uniqueInstance = new DBConnection();
    }
    return uniqueInstance;
  }
}

