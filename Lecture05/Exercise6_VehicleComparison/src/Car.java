public class Car {

    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return year == car.year && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public String toString() {
        return "Car: " + model + "(" + color + ", " + year + ")";
    }


    //    private String model;
//    private String color;
//    private int year;
//
//    public Car(String model, String color, int year) {
//        this.model = model;
//        this.color = color;
//        this.year = year;
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
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Car car = (Car) obj;
//        return year == car.year && color.equals(car.color) && model.equals(car.model);
//    }
//
//    @Override
//    public String toString() {
//        return model + "(" + color + ", " + year + ")";
//    }

}

//Goal: Compare cars using both the == operator and the equals() method. Introduce object references and memory management.
//To-Do:
//Create several Car objects with different attributes (model, color, etc.).
//Use object comparison to check if two cars are identical based on their attributes.
//Modify one car and observe how changes affect object references and equality. Gradual Challenge: Teach the difference between reference equality (==) and value equality (equals()).

//// CarComparison.java
//public class CarComparison {
//    // Car class with basic attributes
//    static class Car {
//        private String model;
//        private String color;
//        private int year;
//
//        // Constructor
//        public Car(String model, String color, int year) {
//            this.model = model;
//            this.color = color;
//            this.year = year;
//        }
//
//        // Overriding equals() method for value comparison
//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj)
//                return true;
//            if (obj == null || getClass() != obj.getClass())
//                return false;
//            Car car = (Car) obj;
//            return year == car.year &&
//                   model.equals(car.model) &&
//                   color.equals(car.color);
//        }
//
//        // Overriding toString() for better output readability
//        @Override
//        public String toString() {
//            return model + " (" + color + ", " + year + ")";
//        }
//    }
//
//    // Lecture11.Main method to compare cars
//    public static void main(String[] args) {
//        // Create several Car objects
//        Car car1 = new Car("Falcon", "Red", 2020);
//        Car car2 = new Car("Falcon", "Red", 2020);
//        Car car3 = car1; // Reference to car1
//        Car car4 = new Car("Eagle", "Blue", 2021);
//
//        // Using '==' operator to compare
//        System.out.println("Using '==' operator:");
//        System.out.println("car1 == car2: " + (car1 == car2)); // false
//        System.out.println("car1 == car3: " + (car1 == car3)); // true
//
//        // Using 'equals()' method to compare
//        System.out.println("\nUsing 'equals()' method:");
//        System.out.println("car1.equals(car2): " + car1.equals(car2)); // true
//        System.out.println("car1.equals(car3): " + car1.equals(car3)); // true
//        System.out.println("car1.equals(car4): " + car1.equals(car4)); // false
//
//        // Modify car2's color
//        System.out.println("\nAfter modifying car2's color:");
//        // Since attributes are private, let's assume we have setters or recreate car2
//        car2 = new Car("Falcon", "Green", 2020);
//        System.out.println("car1.equals(car2): " + car1.equals(car2)); // false
//
//        // Observe object references
//        System.out.println("\nObject References:");
//        System.out.println("car1: " + car1);
//        System.out.println("car2: " + car2);
//        System.out.println("car3: " + car3);
//        System.out.println("car4: " + car4);
//    }
//}
