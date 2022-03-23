package vehicles;

import main.Person;

public class Minivan extends Vehicle {
  private int seatingCapacity;
  private boolean hasSlidingDoor;

  public Minivan(Minivan target) {
    super(target.getMake(), target.getModel(), 
        target.getYear(), target.getColor(), target.getNumberOfWheels(),
        target.getVin(), target.getOwner());
    this.hasSlidingDoor = target.getHasSlidingDoor();
  }

  public Minivan(String make, String model, int year, String color, String vin,
      Person owner, int seatingCapacity, boolean hasSlidingDoor) {
    super(make, model, year, color, 4, vin, owner);
    this.hasSlidingDoor = hasSlidingDoor;
    this.seatingCapacity = seatingCapacity;
  }

  /* Clone this object by returning a new copy of the Minivan object. 
     This is a shallow clone (i.e. the vehicle's owner of type Person is shared
     with both the original object and the new cloned object.)
     */
  @Override
  public Vehicle clone(){
    return new Minivan(this);
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
