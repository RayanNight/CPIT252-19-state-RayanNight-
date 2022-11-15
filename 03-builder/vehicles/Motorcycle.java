package vehicles;

import people.Person;

public class Motorcycle extends Vehicle {
  private String frameType;
  private boolean hasSidecar;

  public Motorcycle(String make, String model, int year, String trim, 
      TrimType trimType, String color, String vin, Person owner, 
      String frameType, boolean hasSidecar) {
    super(make, model, year, trim, trimType, color, 2, vin, owner);
    this.frameType = frameType;
    this.hasSidecar = hasSidecar;
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
