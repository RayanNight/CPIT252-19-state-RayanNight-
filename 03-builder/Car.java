import features.*;
import transmissions.*;

public class Car {
    // Required parameters
    private String make;
    private String model;
    private int year;
    private TrimType trimType;
    private Transmission transmission;
    // Optional parameters
    private Radio radio;
    private Navigation navigation;
    private LeatherUpholstery leatherUpholstery;
    private HeatedSeats heatedSeats;
    private FrontSensors frontSensors;
    private RearSensors rearSensors;
    private VacuumCleaner vacuumCleaner;

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.trimType = builder.trimType;
        this.transmission = builder.transmission;
        this.radio = builder.radio;
        this.navigation = builder.navigation;
        this.leatherUpholstery = builder.leatherUpholstery;
        this.heatedSeats = builder.heatedSeats;
        this.frontSensors = builder.frontSensors;
        this.rearSensors = builder.rearSensors;
        this.vacuumCleaner = builder.vacuumCleaner;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car: " + this.make + " " + this.model + " " + this.year + " " +
                this.trimType + " " + this.transmission + "\n");
        sb.append("The following trim specific features are also included: ");
        if (radio != null) {
            sb.append("radio, ");
        }
        if (navigation != null) {
            sb.append("navigation, ");
        }
        if (leatherUpholstery != null) {
            sb.append("leather upholstery, ");
        }
        if (heatedSeats != null) {
            sb.append("heated seats, ");
        }
        if (frontSensors != null) {
            sb.append("front sensors, ");
        }
        if (rearSensors != null) {
            sb.append("rear sensors, ");
        }
        if (vacuumCleaner != null) {
            sb.append("vacuum cleaner, ");
        }
        // Remove the last comma and space and add a period
        sb.delete(sb.length() - 2, sb.length());
        sb.append(".\n");
        return sb.toString();
    }

    public static class Builder {
        // Required parameters
        private String make;
        private String model;
        private int year;
        private TrimType trimType;
        private Transmission transmission;
        // Optional parameters
        private Radio radio;
        private Navigation navigation;
        private LeatherUpholstery leatherUpholstery;
        private HeatedSeats heatedSeats;
        private FrontSensors frontSensors;
        private RearSensors rearSensors;
        private VacuumCleaner vacuumCleaner;

        // A car has two required parameters: trimType and transmission
        public Builder(String make, String model, int year, TrimType trimType, Transmission transmission) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.trimType = trimType;
            this.transmission = transmission;
        }

        public Builder withRadio() {
            this.radio = new Radio();
            return this;
        }

        public Builder withNavigation() {
            this.navigation = new Navigation();
            return this;
        }

        public Builder withLeatherUpholstery() {
            this.leatherUpholstery = new LeatherUpholstery();
            return this;
        }

        public Builder withHeatedSeats() {
            this.heatedSeats = new HeatedSeats();
            return this;
        }

        public Builder withFrontSensors() {
            this.frontSensors = new FrontSensors();
            return this;
        }

        public Builder withRearSensors() {
            this.rearSensors = new RearSensors();
            return this;
        }

        public Builder withVacuumCleaner() {
            this.vacuumCleaner = new VacuumCleaner();
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
