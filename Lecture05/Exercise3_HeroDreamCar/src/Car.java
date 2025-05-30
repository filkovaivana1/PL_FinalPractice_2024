public class Car {
    private Engine engine;
    private Wheel[] wheels;
    private Door[] doors;
    private boolean isTrunkClosed;

    // Car constructor
    public Car(int numberOfWheels, int numberOfDoors) {
        engine = new Engine();
        wheels = new Wheel[numberOfWheels];
        doors = new Door[numberOfDoors];
        isTrunkClosed = true;

        // Initialize wheels and doors
        for (int i = 0; i < numberOfWheels; i++) {
            wheels[i] = new Wheel();
        }
        for (int i = 0; i < numberOfDoors; i++) {
            doors[i] = new Door();
        }
    }

    // Methods to interact with car parts
    public void startEngine() {
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void openAllDoors() {
        for (Door door : doors) {
            door.open();
        }
    }

    public void closeAllDoors() {
        for (Door door : doors) {
            door.close();
        }
    }

    public void inflateWheel(int wheelIndex) {
        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
            wheels[wheelIndex].inflate();
        } else {
            System.out.println("Invalid wheel index.");
        }
    }

    public void deflateWheel(int wheelIndex) {
        if (wheelIndex >= 0 && wheelIndex < wheels.length) {
            wheels[wheelIndex].deflate();
        } else {
            System.out.println("Invalid wheel index.");
        }
    }

    public void closeTrunk() {
        if (!isTrunkClosed) {
            isTrunkClosed = true;
            System.out.println("Trunk closed.");
        } else {
            System.out.println("Trunk is already closed.");
        }
    }

    public void openTrunk() {
        if (isTrunkClosed) {
            isTrunkClosed = false;
            System.out.println("Trunk opened.");
        } else {
            System.out.println("Trunk is already open.");
        }
    }

}
