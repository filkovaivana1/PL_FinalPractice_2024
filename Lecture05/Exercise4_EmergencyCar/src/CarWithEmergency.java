public class CarWithEmergency {
    private Engine engine;
    private Wheel[] wheels;
    private  GasTank gasTank;
    private boolean isTrunkClosed;

    public CarWithEmergency(int numWheels, double tankCapacity) {
        engine = new Engine();
        wheels = new Wheel[numWheels];
        for (int i = 0; i < numWheels; i++) {
            wheels[i] = new Wheel();
        }
        gasTank = new GasTank(tankCapacity);
        isTrunkClosed = true;
    }

    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void inflateWheel(int wheelIndex) {
        wheels[wheelIndex].inflate();
    }

    public void deflateWheel(int wheelIndex) {
        wheels[wheelIndex].deflate();
    }

    public void emptyGasTank() {
        gasTank.emptyTank();
    }

    public void refillGasTank() {
        gasTank.refillTank();
    }

    public void consumeFuel(double amount) {
        gasTank.consumeFuel(amount);
    }

    public void openTrunk() {
        if (isTrunkClosed) {
            isTrunkClosed = false;
            System.out.println("Trunk opened");
        } else {
            System.out.println("Trunk is already open");
        }
    }

    public void closeTrunk() {
        if (!isTrunkClosed) {
            isTrunkClosed = true;
            System.out.println("Trunk closed");
        } else {
            System.out.println("Trunk is already closed");
        }
    }

    public void checkAllWheelPressure() {
        for (int i=0; i<wheels.length; i++) {
            System.out.println("Checking wheel: " + (i+1));
            wheels[i].checkPressure();
        }
    }

    //    private Engine engine;
//    private Wheel[] wheels;
//    private GasTank gasTank;
//    private boolean isTrunkClosed;
//
//    // Car constructor
//    public CarWithEmergency(int numberOfWheels, double gasTankCapacity) {
//        engine = new Engine();
//        wheels = new Wheel[numberOfWheels];
//        gasTank = new GasTank(gasTankCapacity);
//        isTrunkClosed = true;
//
//        // Initialize wheels
//        for (int i = 0; i < numberOfWheels; i++) {
//            wheels[i] = new Wheel();
//        }
//    }
//
//    // Methods to interact with car parts
//    public void startEngine() {
//        engine.start();
//    }
//
//    public void stopEngine() {
//        engine.stop();
//    }
//
//    public void deflateWheel(int wheelIndex) {
//        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
//            wheels[wheelIndex].deflate();
//        } else {
//            System.out.println("Invalid wheel index.");
//        }
//    }
//
//    public void checkAllWheelsPressure() {
//        for (int i = 0; i < wheels.length; i++) {
//            System.out.print("Wheel " + (i + 1) + ": ");
//            wheels[i].checkPressure();
//        }
//    }
//
//    public void refillGasTank() {
//        gasTank.refillTank();
//    }
//
//    public void consumeFuel(double amount) {
//        gasTank.consumeFuel(amount);
//    }

}



