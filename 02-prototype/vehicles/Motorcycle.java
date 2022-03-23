package vehicles;

import main.Person;

public class Motorcycle extends Vehicle {
  private String frameType;
  private boolean hasSidecar;

  public Motorcycle(Motorcycle target) {
    super(target.getMake(), target.getModel(), 
        target.getYear(), target.getColor(), target.getNumberOfWheels(),
        target.getVin(), target.getOwner());
    this.frameType = this.getFrameType();
    this.hasSidecar = target.getHasSidecar();
  }

  public Motorcycle(String make, String model, int year, 
      String color, String vin, Person owner, 
      String frameType, boolean hasSidecar) {
    super(make, model, year, color, 2, vin, owner);
    this.frameType = frameType;
    this.hasSidecar = hasSidecar;
  }

  /* Clone this object by returning a new copy of the Motorcycle object. 
     This is a shallow clone (i.e. the vehicle's owner of type Person is shared
     with both the original object and the new cloned object.)
     */
  @Override
  public Vehicle clone(){
    return new Motorcycle(this);
  }

  // getters/setters(mutators)

  public String getFrameType(){
    return this.frameType;
  }

  public void setFrameType(String frameType){
    this.frameType = frameType;
  }
  public boolean getHasSidecar(){
    return this.hasSidecar;
  }
  public void setHasSidecar(boolean hasSidecar){
    this.hasSidecar = hasSidecar;
  }

}
