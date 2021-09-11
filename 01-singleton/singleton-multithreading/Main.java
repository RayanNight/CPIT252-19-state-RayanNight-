package singletonMultiThreadingExample;

public class Main{
  public static void main(String[] args){
    // create a single instance
    DBConnection instance1 = DBConnection.getInstance();
    // create another instance to show that it's exactly the same single instance
    DBConnection instance2 = DBConnection.getInstance();
    // Compare object identity to determine whether these two objects share and 
    // reference the same object (same memory address)
    if (instance1 == instance2) {
      System.out.println("ONE single instance of the class was created.");
    }
    else {
      System.err.println("Error: Multiple instances were created!");
    }
  }
}
