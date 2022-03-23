package vehicles;

import main.Person;

public class Truck extends Vehicle {
  private int numberOfAxles;
  private float bedLength;

  public Truck(Truck target) {
    super(target.getMake(), target.getModel(), 
        target.getYear(), target.getColor(), target.getNumberOfWheels(),
        target.getVin(), target.getOwner());
    this.numberOfAxles = target.getNumberOfAxles();
    this.bedLength = target.getBedLength();
  }

  public Truck(String make, String model, int year, 
      String color, int numberOfWheels, String vin, Person owner, 
      int numberOfAxles, float bedLength) {
    super(make, model, year, color, numberOfWheels, vin, owner);
    // assuming the number of axles is the number of wheels divided by 2
    this.numberOfAxles = numberOfWheels / 2;
    this.bedLength = bedLength;
  }

  /* Clone this object by returning a new copy of the Truck object. 
     This is a shallow clone (i.e. the vehicle's owner of type Person is shared
     with both the original object and the new cloned object.)
     */
  @Override
  public Vehicle clone(){
    return new Truck(this);
  }

  // getters/setters(mutators)

  public float getBedLength(){
    return this.bedLength;
  }

  public void setBedLength(float bedLength ){
    this.bedLength = bedLength;
  }

  public int getNumberOfAxles(){
    return this.numberOfAxles;
  }

  public void setNumberOfAxles(int numberOfAxles){
    this.numberOfAxles = numberOfAxles;
  }

}
