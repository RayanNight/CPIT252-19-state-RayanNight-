package vehicles;

import main.Person;

public class Car extends Vehicle {
  private int seatingCapacity ;

  public Car(Car target) {
    super(target.getMake(), target.getModel(), 
        target.getYear(), target.getColor(), target.getNumberOfWheels(),
        target.getVin(), target.getOwner());
    this.seatingCapacity = target.getSeatingCapacity();
  }

  public Car(String make, String model, int year, 
      String color, String vin, Person owner, int seatingCapacity) {
    super(make, model, year, color, 4, vin, owner);
    this.seatingCapacity = seatingCapacity;
  }

  /* Clone this object by returning a new copy of the Car object. 
     This is a shallow clone (i.e. the vehicle's owner of type Person is shared
     with both the original object and the new cloned object.)
     */
  @Override
  public Vehicle clone(){
    return new Car(this);
  }

  // getters/setters(mutators)

  public int getSeatingCapacity(){
    return this.seatingCapacity;
  }

  public void setSeatingCapacity(int seatingCapacity){
    this.seatingCapacity = seatingCapacity;
  }

}
