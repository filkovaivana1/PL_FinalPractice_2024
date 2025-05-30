public class Car {
    private String type;
    private int noSeats;
    private String fuelType;
    private String color;

    public Car() {
        this.type = "Sedan";
        this.noSeats = 5;
        this.fuelType = "Petrol";
        this.color = "White";
    }

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayDetails() {
        System.out.println("Car details: ");
        System.out.println("Type: " + type);
        System.out.println("Number of seats: " + noSeats);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Color: " + color);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Car car1 = new Car("SUV", 7, "Diesel", "Black");
        Car car2 = new Car();

        car2.setType("Hatchback");
        car2.setNoSeats(4);
        car2.setFuelType("Electric");
        car2.setColor("Red");

        car1.displayDetails();
        car2.displayDetails();
    }
}