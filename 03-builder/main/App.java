package main;

import vehicles.Vehicle;

public class App {
  public static void main(String[]args){
    VehicleCache cache = new VehicleCache();
    Vehicle v1 = cache.get("2020FordF150");
    Vehicle v2 = cache.get("2020FordF150");
    Vehicle v3 = cache.get("2021ToyotaSieena");
    Vehicle v4 = cache.get("2021ToyotaSieena");

    // compare object's identities
    if (v1 != v2) {
      System.out.println("The 2020FordF150 objects are two different objects");
    }else {
      System.err.println("Error: the 2020FordF150 objects are exactly the same object");
    }
    // printing their content
    System.out.println("***************** Content *****************");
    System.out.println("v1:\n"+ v1);
    System.out.println("v2:\n"+ v2);
    System.out.println("*******************************************");

    if (v3 != v4) {
      System.out.println("The 2021ToyotaSieena objects are two different objects");
    }else {
      System.err.println("Error: the 2021ToyotaSieena objects are exactly the same object");
    }
    // printing their content
    System.out.println("***************** Content *****************");
    System.out.println("v3:\n"+ v3);
    System.out.println("v4:\n"+ v4);
    System.out.println("*******************************************");
  }
}
