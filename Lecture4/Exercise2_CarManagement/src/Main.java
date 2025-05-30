public class Main {


    public static void main(String[] args) {
//        Car car = new Car("Tesla", 5, "Electric", "White");
//        Car car2 = new Car();
//
//        car2.setNoSeats(2);
//        car2.setType("Type");
//        car2.setColor("Blue");
//
//        car.displayCar();
//        car2.displayCar();

        Car[] cars = new Car[5];
        cars[0] = new Car("Tesla", 6, "Electric", "White");
        cars[1] = new Car();
        cars[2] = new Car("Audi", 4, "Petrol", "Red");
        cars[3] = new Car();
        cars[4] = new Car("Seat", 5, "Petrol", "White");


        for (Car car: cars){
            car.displayCar();
        }

        Car maxSeatsCar = cars[0];
        for (int i=1; i< cars.length; i++){
            if(maxSeatsCar.getNoSeats() < cars[i].getNoSeats()){
                maxSeatsCar = cars[i];
            }
        }

        System.out.println("Car with max number of seats: ");
        maxSeatsCar.displayCar();

    }
}