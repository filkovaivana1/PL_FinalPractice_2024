public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Toyota Corolla", 5, 50.0, 7.5);
        Vehicle vehicle2 = new Vehicle("Bugatti Veyron", 4, 70.0, 12.5);

        System.out.println(vehicle1.calculateDistance());
        System.out.println(vehicle2.calculateDistance());

        vehicle1.compareRange(vehicle2);
        vehicle2.compareRange(vehicle1);
    }
}

//Create the Vehicle class with the required attributes and methods.
//Instantiate a vehicle object in the main method.
//Calculate and print how many kilometers the vehicle can travel on a full tank.
//Add a method to compare the range of multiple vehicles to help the hero choose the best one.
//Gradual Challenge: Start by designing the basic vehicle, then expand to comparing several vehicles using overloading.