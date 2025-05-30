public class Car {

    private String type;
    private int noSeats;
    private String fuelType;
    private String color;

    public Car(String type, int noSeats, String fuelType, String color) {
        this.type = type;
        this.noSeats = noSeats;
        this.fuelType = fuelType;
        this.color = color;
    }

    public Car() {
        this.type = "Sedan";
        this.noSeats = 5;
        this.fuelType = "Petrol";
        this.color = "White";
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
        System.out.println("Type: " + type + ", noSeats: " + noSeats + ", fuelType: " + fuelType + ", color: " + color);
    }

    //    private String type;
//    private int noSeats;
//    private String fuelType;
//    private String color;
//
//    public Car(String type, int noSeats, String fuelType, String color) {
//        this.type = type;
//        this.noSeats = noSeats;
//        this.fuelType = fuelType;
//        this.color = color;
//    }
//
//    public Car() {
//        this.type = "Sedan";
//        this.noSeats = 5;
//        this.fuelType = "Petrol";
//        this.color = "White";
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getNoSeats() {
//        return noSeats;
//    }
//
//    public void setNoSeats(int noSeats) {
//        this.noSeats = noSeats;
//    }
//
//    public String getFuelType() {
//        return fuelType;
//    }
//
//    public void setFuelType(String fuelType) {
//        this.fuelType = fuelType;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void displayDetails() {
//        System.out.println("Type: " + type + ", Seats: " + noSeats + ", Fuel: " + fuelType + ", Color: " + color);
//    }

}
