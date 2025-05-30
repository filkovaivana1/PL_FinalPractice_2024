public class Main {

    public static Car mostseats(Car[] cars){
        Car car;
        car = cars[0];
        for(int i = 1; i < 5;i++){
            if(cars[i].getNoSeats() > car.getNoSeats()){
                car = cars[i];
            }
        }

        return car;
    }
    public static void main(String[] args) {
//        Car lambo1 = new Car();
//        lambo1.displayCarProperties();
//
//        Car passat = new Car("Passat 1.9", 5, "Disel", "Cyan");
//        passat.displayCarProperties();
//
//        passat.setColor("Red");
//        passat.displayCarProperties();
        Car[] cars = new Car[5];

        cars[0] = new Car("Seat",5,"Petrol","White");
        cars[2] = new Car("Golf",5,"Diesel","Grey");
        cars[4] = new Car("Tesla",7,"Electric","Pink");
        cars[1] = new Car();
        cars[3] = new Car();

        Car max_seat_car = mostseats(cars);
        max_seat_car.displayCarProperties();


    }
}
//Create an array of 5 Car objects representing different cars in the fleet.
//Use a loop to assign values to each car (some with default values).
//Implement a method that prints the details of each car in the array.
//Use a loop to find the car with the most seats and output its details.