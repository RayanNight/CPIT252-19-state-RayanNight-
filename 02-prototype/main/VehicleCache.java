package main;

import java.util.HashMap;
import java.util.Map;
import vehicles.Vehicle;
import vehicles.Car;
import vehicles.Minivan;
import vehicles.Motorcycle;
import vehicles.Truck;

public class VehicleCache {

  private Map<String, Vehicle> cache = new HashMap<>();

  public VehicleCache(){

    Car car = new Car("Honda", "Accord", 2020, "silver", "WBAKE3C52DE700756",
        new Person("Muhammad"), 5);
    Minivan van = new Minivan("Toyota", "Sieena", 2021, "white", "1N4CL2AP2BC107702",
        new Person("Bilal"), 8, true);
    Truck truck = new Truck("Ford", "F-150", 2021, "red", 4, "5TBRT34133S402382",
        new Person("Omar"), 2, 2.4f);
    Motorcycle bike = new Motorcycle("BMW", "R-1250", 2021, "black", "1M8PDMTA3TP010033",
        new Person("Ali"), "aluminum", false);

    // populate the cache
    cache.put("2020HondaAccord", car);
    cache.put("2021ToyotaSieena", van);
    cache.put("2020FordF150", truck);
    cache.put("2020BMWR1250", bike);
  }

  public Vehicle put(String key, Vehicle vehicle) {
    cache.put(key, vehicle);
    return vehicle;
  }

  // Return a cloned from the cache
  public Vehicle get(String key) {
    return cache.get(key).clone();
  }
}

