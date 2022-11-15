package vehicles;

import people.Person;

public class Minivan extends Vehicle {
  private int seatingCapacity;
  private boolean hasSlidingDoor;

  public Minivan(String make, String model, int year, 
      String trim, TrimType trimType,String color, String vin,
      Person owner, int seatingCapacity, boolean hasSlidingDoor) {
    super(make, model, year, trim, trimType, color, 4, vin, owner);
    this.hasSlidingDoor = hasSlidingDoor;
    this.seatingCapacity = seatingCapacity;
  }

  // getters/setters(mutators)

  public int getSeatingCapacity(){
    return this.seatingCapacity;
  }
  public void setSeatingCapacity(int seatingCapacity){
    this.seatingCapacity = seatingCapacity;
  }

  public boolean getHasSlidingDoor(){
    return this.hasSlidingDoor;
  }
  public void setHasSlidingDoor(boolean hasSlidingDoor){
    this.hasSlidingDoor = hasSlidingDoor;
  }

}
