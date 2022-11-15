package vehicles;

import people.Person;

public class Truck extends Vehicle {
  private int numberOfAxles;
  private float bedLength;

  public Truck(String make, String model, int year, String trim, TrimType trimType,
      String color, int numberOfWheels, String vin, Person owner, 
      int numberOfAxles, float bedLength) {
    super(make, model, year, trim ,trimType, color, numberOfWheels, vin, owner);
    // assuming the number of axles is the number of wheels divided by 2
    this.numberOfAxles = numberOfWheels / 2;
    this.bedLength = bedLength;
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
