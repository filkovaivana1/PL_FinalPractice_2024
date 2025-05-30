public class Car extends Vehicle{
    int numDoors;
    String fuelType;

    public Car(String make, String model, int year, double dailyRate, int numDoors, String fuelType) {
        super(make, model, year, dailyRate);
        this.numDoors = this.numDoors;
        this.fuelType = this.fuelType;
    }

    @Override
    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public void printDetails() {
        System.out.println("Make: " + make + " Model: " + model + " Year: " + year + " daily rate: " + dailyRate + " Num of doors: " + numDoors + " Fuel Type: " +fuelType);
    }
    @Override
    public String getModel(){
        return model;
    }
}