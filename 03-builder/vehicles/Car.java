package vehicles;

import people.Person;

public class Car extends Vehicle {
  private int seatingCapacity;
  public Car(String make, String model, int year, String trim,
      TrimType trimType, String color, String vin, Person owner, 
      int seatingCapacity) {
    super(make, model, year, trim , trimType, color, 4, vin, owner);
    this.seatingCapacity = seatingCapacity;
  }

  // getters/setters(mutators)

  public int getSeatingCapacity(){
    return this.seatingCapacity;
  }

  public void setSeatingCapacity(int seatingCapacity){
    this.seatingCapacity = seatingCapacity;
  }

}
