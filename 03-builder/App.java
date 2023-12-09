import transmissions.*;

public class App {

    public static void main(String[] args) {
        // Create a car with a base trim and basic features
        Car baseStandardCar = new Car.Builder("Toyota", "Hilux", 2023,
                TrimType.BASE, new ManualTransmission(6))
                .withRadio()
                .withRearSensors()
                .build();
        System.out.println(baseStandardCar);

        System.out.println("\n--------------------------------------\n");

        // Create a car with a full trim
        Car fullOptionsCar = new Car.Builder("Ford", "F-150", 2023,
                TrimType.FULL, new AutomaticTransmission(10))
                .withRadio()
                .withRearSensors()
                .withFrontSensors()
                .withNavigation()
                .withLeatherUpholstery()
                .withHeatedSeats()
                .withVacuumCleaner()
                .build();
        System.out.println(fullOptionsCar);
    }
}