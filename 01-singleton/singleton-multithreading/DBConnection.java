package singletonMultiThreadingExample;

/**
 * Enum based singelton implementation.
 */

public enum DBConnection {
  INSTANCE;

  // properties or instance variables here
  private int portNumber;

  private String hostName;
  // TODO: Add setters and setters
  //
  public void setPortNumber(int portNumber){
    this.portNumber = portNumber;
  }

  public int getPortNumber(){
    return this.portNumber;
  }
}
