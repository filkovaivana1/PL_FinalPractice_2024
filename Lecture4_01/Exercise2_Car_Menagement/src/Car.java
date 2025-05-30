import java.util.zip.CheckedOutputStream;

public class Car {
    private String type;
    private int noSeats;
    private String fuelType;
    private String color;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
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

    public Car() {
        type = "lambo";
        noSeats = 5;
        color = "red";
        fuelType = "Jet Fuel";
    }

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public void displayCarProperties() {
        System.out.println("Type: " + type);
        System.out.println("Number of Steas: " + noSeats);
        System.out.println("Type of Fuel: " + fuelType);
        System.out.println("Color: " + color);
    }



}
//Create an array of 5 Car objects representing different cars in the fleet.
//Use a loop to assign values to each car (some with default values).
//Implement a method that prints the details of each car in the array.
//Use a loop to find the car with the most seats and output its details.