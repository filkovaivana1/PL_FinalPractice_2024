public class FleetManager {

    public static void main(String[] args) {

        Car[] cars = new Car[5];
        cars[0] = new Car("Hatchback", 4, "Electric", "Red");
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car("Minivan", 8, "Gasoline", "Blue");
        cars[4] = new Car("Seat", 5, "Diesel", "Grey");

        for (Car car: cars) {
            car.displayDetails();
        }

        Car maxSeatsCar = cars[0];
        for (int i=1; i<cars.length; i++) {
            if (cars[i].getNoSeats() > maxSeatsCar.getNoSeats()) {
                maxSeatsCar = cars[i];
            }        }

        System.out.println("Car with most seats: ");
        maxSeatsCar.displayDetails();

//        Car[] fleet = new Car[5];
//
//        fleet[0] = new Car("SUV", 7, "Diesel", "BLack");
//        fleet[1] = new Car();
//        fleet[2] = new Car("Hatchback", 4, "Electric", "Red");
//        fleet[3] = new Car();
//        fleet[4] = new Car("Minivan", 8, "Gasoline", "Blue");
//
//        for (int i = 0; i < fleet.length; i++) {
//            System.out.print("Car " + (i + 1) + ": ");
//            fleet[i].displayDetails();
//        }
//
//        Car maxSeatsCar = fleet[0];
//        for (int i = 1; i < fleet.length; i++) {
//            if (fleet[i].getNoSeats() > maxSeatsCar.getNoSeats()) {
//                maxSeatsCar = fleet[i];
//            }
//        }
//
//        System.out.print("Car with most seats: ");
//        maxSeatsCar.displayDetails();


    }
}