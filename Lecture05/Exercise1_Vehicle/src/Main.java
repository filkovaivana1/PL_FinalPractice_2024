public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Speedster", 2, 50.00, 5.0);
        Vehicle vehicle2 = new Vehicle("RoadRunner", 4, 60.00, 6.0);

        System.out.println(vehicle1.getModel() + " can travel " + vehicle1.calculateRange() + "km on full tank");
        System.out.println(vehicle2.getModel() + " can travel " + vehicle2.calculateRange() + "km on full tank");

        vehicle1.compareRange(vehicle2);

//        // Instantiate vehicle objects
//        Vehicle vehicle1 = new Vehicle("Speedster", 2, 50.0, 5.0);
//        Vehicle vehicle2 = new Vehicle("RoadRunner", 4, 60.0, 6.0);
//
//        // Calculate and print ranges
//        System.out.println(vehicle1.getModel() + " can travel " + vehicle1.calculateRange() + " km on a full tank.");
//        System.out.println(vehicle2.getModel() + " can travel " + vehicle2.calculateRange() + " km on a full tank.");
//
//        // Compare ranges
//        System.out.println(vehicle1.compareRange(vehicle2));
    }
}