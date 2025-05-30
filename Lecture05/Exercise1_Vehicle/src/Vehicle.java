public class Vehicle {
    private String model;
    private int numberOfPassengers;
    private double gasTankCapacity; // in liters
    private double fuelConsumption; // liters per 100 km

    public Vehicle(String model, int numberOfPassengers, double gasTankCapacity, double fuelConsumption) {
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
        this.gasTankCapacity = gasTankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public double calculateRange() {
        double litersPerOneKm = fuelConsumption / 100;
        return gasTankCapacity / litersPerOneKm;
    }

    public void compareRange(Vehicle other) {
        if (this.calculateRange() > other.calculateRange()) {
            System.out.println(this.model + "(" + this.calculateRange() +") have bigger range then" + other.model + "(" + other.calculateRange() + ")");
        } else if (this.calculateRange() < other.calculateRange()) {
            System.out.println(other.model + "(" + other.calculateRange() +") have bigger range then" + this.model + "(" + this.calculateRange() + ")");        } else {
            System.out.println(this.model + " and " + other.model + " have the same range");
        }
    }


    // Attributes
//    private String model;
//    private int numberOfPassengers;
//    private double gasTankCapacity; // in liters
//    private double fuelConsumption; // liters per 100 km
//
//    // Constructor
//    public Vehicle(String model, int numberOfPassengers, double gasTankCapacity, double fuelConsumption) {
//        this.model = model;
//        this.numberOfPassengers = numberOfPassengers;
//        this.gasTankCapacity = gasTankCapacity;
//        this.fuelConsumption = fuelConsumption;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    // Method to calculate range with a full tank
//    public double calculateRange() {
//        return (gasTankCapacity / fuelConsumption) * 100;
//    }
//
//    // Method to compare range with another vehicle
//    public String compareRange(Vehicle other) {
//        double thisRange = this.calculateRange();
//        double otherRange = other.calculateRange();
//
//        if (thisRange > otherRange) {
//            return this.model + " can go farther (" + thisRange + " km) than " + other.model + " (" + otherRange + " km).";
//        } else if (thisRange < otherRange) {
//            return other.model + " can go farther (" + otherRange + " km) than " + this.model + " (" + thisRange + " km).";
//        } else {
//            return this.model + " and " + other.model + " have the same range (" + thisRange + " km).";
//        }
//    }

}
