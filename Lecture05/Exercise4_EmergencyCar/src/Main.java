public class Main {
    public static void main(String[] args) {
        // Create a Car with 4 wheels and a 60-liter gas tank

        CarWithEmergency carWithEmergency =  new CarWithEmergency(4, 60.0);

        carWithEmergency.startEngine();
        carWithEmergency.startEngine();
        carWithEmergency.openTrunk();
        carWithEmergency.emptyGasTank();
        carWithEmergency.refillGasTank();
        carWithEmergency.consumeFuel(40.0);
        carWithEmergency.consumeFuel(50.0);
        carWithEmergency.deflateWheel(3);
        carWithEmergency.inflateWheel(0);
        carWithEmergency.checkAllWheelPressure();
        carWithEmergency.closeTrunk();
        carWithEmergency.stopEngine();

//        CarWithEmergency heroCar = new CarWithEmergency(4, 60.0);
//
//        // Start the engine
//        heroCar.startEngine();
//
//        // Simulate fuel consumption
//        heroCar.consumeFuel(50.0);
//
//        // Empty the gas tank
//        heroCar.consumeFuel(15.0); // This will trigger fuel exhaustion
//
//        // Stop the engine
//        heroCar.stopEngine();
//
//        // Deflate the second wheel
//        heroCar.deflateWheel(1);
//
//        // Check all wheels' pressure
//        heroCar.checkAllWheelsPressure();
//
//        // Refuel the gas tank
//        heroCar.refillGasTank();
    }
}