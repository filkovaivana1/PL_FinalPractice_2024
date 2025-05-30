public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Falcon", "red", 2020);
        Car car2 = new Car("Falcon", "red", 2020);
        Car car3 = car1;
        Car car4 = new Car("Eagle", "Blue", 2021);

        System.out.println("Using == operator: ");
        System.out.println("car1 == car2: " + (car1 == car2));
        System.out.println("car1 == car3: " + (car1 == car3));

        System.out.println("Using equals method: ");
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.equals(car3): " + car1.equals(car3));
        System.out.println("car1.equals(car4): " + car1.equals(car4));


        car2.setColor("White");
        System.out.println("car1.equals(car2): " + car1.equals(car2));

        System.out.println("Car details:");
        System.out.println("Car1: " + car1);
        System.out.println("Car2: " + car2);
        System.out.println("Car3: " + car3);
        System.out.println("Car4: " + car4);



//        Car car1 = new Car("Falcon", "Red", 2020);
//        Car car2 = new Car("Falcon", "Red", 2020);
//        Car car3 = car1;
//        Car car4 = new Car("Eagle", "Blue", 2021);
//
//        System.out.println("Using == operator: ");
//        System.out.println("car1 == car2: " + (car1 == car2));
//        System.out.println("car1 == car3: " + (car1 == car3));
//
//        System.out.println("Using equals() method: ");
//        System.out.println("car1.equals(car2): " + car1.equals(car2));
//        System.out.println("car1.equals(car3): " + car1.equals(car3));
//        System.out.println("car1.equals(car4): " + car1.equals(car4));
//
//        car2.setColor("White");
//        System.out.println("car1.equals(car2): " + car1.equals(car2));
//
//        System.out.println("References: ");
//        System.out.println("Car1: " + car1);
//        System.out.println("Car2: " + car1);
//        System.out.println("Car3: " + car1);
//        System.out.println("Car4: " + car1);



    }
}

//public static void main(String[] args) {
////        // Create several Car objects
////        Car car1 = new Car("Falcon", "Red", 2020);
////        Car car2 = new Car("Falcon", "Red", 2020);
////        Car car3 = car1; // Reference to car1
////        Car car4 = new Car("Eagle", "Blue", 2021);
////
////        // Using '==' operator to compare
////        System.out.println("Using '==' operator:");
////        System.out.println("car1 == car2: " + (car1 == car2)); // false
////        System.out.println("car1 == car3: " + (car1 == car3)); // true
////
////        // Using 'equals()' method to compare
////        System.out.println("\nUsing 'equals()' method:");
////        System.out.println("car1.equals(car2): " + car1.equals(car2)); // true
////        System.out.println("car1.equals(car3): " + car1.equals(car3)); // true
////        System.out.println("car1.equals(car4): " + car1.equals(car4)); // false
////
////        // Modify car2's color
////        System.out.println("\nAfter modifying car2's color:");
////        // Since attributes are private, let's assume we have setters or recreate car2
////        car2 = new Car("Falcon", "Green", 2020);
////        System.out.println("car1.equals(car2): " + car1.equals(car2)); // false
////
////        // Observe object references
////        System.out.println("\nObject References:");
////        System.out.println("car1: " + car1);
////        System.out.println("car2: " + car2);
////        System.out.println("car3: " + car3);
////        System.out.println("car4: " + car4);
////    }