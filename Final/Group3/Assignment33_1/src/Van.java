public class Van extends Vehicle{

    int cargoCapacity;
    int numSeats;

    public Van(String make, String model, int year, double dailyRate, int cargoCapacity, int numSeats) {
        super(make, model, year, dailyRate);
        this.cargoCapacity = cargoCapacity;
        this.numSeats = numSeats;
    }


    @Override
    public double getDailyRate() {
        return dailyRate;
    }

    @Override
    public void printDetails() {
        System.out.println("Make: " + make + " Model: " + model + " Year: " + year + " daily rate: " + dailyRate + " Cargo capacity: " + cargoCapacity + "kg, Num of seats: " +numSeats);
    }

    @Override
    public String getModel(){
        return model;
    }
}