public class Car {
    private String type;
    private int noSeats;
    private String fuelType;
    private String color;


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

    public void displayCar() {
        System.out.println("Car details: ");
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("FuelType: " + fuelType);
        System.out.println("Number of seats: " + noSeats);
        System.out.println();
    }

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public Car() {
        this.type = "Toyota";
        this.noSeats = 5;
        this.fuelType ="DIesel";
        this.color = "Pink";
    }
}

//Create a Car class with attributes: type (String), noSeats (int), fuelType (String), and color (String).
//Provide getter and setter methods for each attribute.
//Create a constructor that initializes all attributes, and another default constructor that assigns default values.
//In the main class, create two Car objects: one using the parameterized constructor and another using the default constructor.
//Use setter methods to change the second car’s attributes and print the details of both cars using the getter methods.
