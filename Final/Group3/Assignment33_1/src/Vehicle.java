public abstract class Vehicle {
    String make;
    String model;
    int year;
    double dailyRate;

    public abstract double getDailyRate();
    public abstract void printDetails();
    public abstract String getModel();

    public Vehicle(String make, String model, int year, double dailyRate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dailyRate = dailyRate;
    }
}