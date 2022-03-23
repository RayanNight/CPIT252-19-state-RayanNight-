package vehicles;
import main.Person;

public abstract class Vehicle{

  private String make;
  private String model;
  private int year;
  private String color; 
  private int numWheels;
  private int mileage;
  private String plateNumber;
  private String vin;
  private Person owner;

  public Vehicle(String make, String model, int year, 
      String color, int numWheels, String vin, Person owner) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
    this.numWheels = numWheels;
    this.mileage = 0;
    this.plateNumber = "";
    this.vin = vin;
    this.owner = owner;
  }

  @Override
  public abstract Vehicle clone();

  /* basic get and set accessors a.k.a getters/setters(mutators) */

  public String getMake() {
    return this.make;
  }

  public void setMake(String make){
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model){
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year){
    this.year = year;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color){
    this.color = color;
  }

  public int getNumberOfWheels() {
    return this.numWheels;
  }

  public void setNumberOfWheels(int numWheels){
    this.numWheels = numWheels;
  }

  public int getMileage() {
    return this.mileage;
  }

  public void setMileage(int newMileage) {
    if (newMileage < this.mileage) {
      throw new IllegalArgumentException();
    }
    this.mileage = newMileage;
  }
  public String getPlateNumber() {
    return this.plateNumber;
  }

  public void setPlateNumber(String plate) {
    this.plateNumber = plate;
  }

  public String getVin(){
    return this.vin;
  }

  public void setVin(String vin){
    this.vin = vin;
  }

  public Person getOwner(){
    return this.owner;
  }

  public void setOwner(Person owner){
    this.owner = owner;
  }

  @Override
  public String toString() {
    return "Make: " + this.make + "\nModel: " + this.model +
      "\nYear: " + this.year + "\nColor: " + this.color + "\nWheels: " +
      this.numWheels + "\nMileage: " + this.mileage + "\nPlate number: " 
      + this.plateNumber + "\nVIN: " + this.vin + "\nOwner: " + this.owner;
  }
}
