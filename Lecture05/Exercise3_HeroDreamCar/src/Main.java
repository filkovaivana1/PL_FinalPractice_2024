public class Main {
    public static void main(String[] args) {
        // Create a Car with 4 wheels and 2 doors
        Car heroCar = new Car(4, 2);

        // Start the engine
        heroCar.startEngine();

        // Open all doors
        heroCar.openAllDoors();

        // Inflate the first wheel (if needed)
        heroCar.inflateWheel(0);

        // Open the trunk
        heroCar.openTrunk();

        // Close the trunk
        heroCar.closeTrunk();

        // Stop the engine
        heroCar.stopEngine();
    }
}