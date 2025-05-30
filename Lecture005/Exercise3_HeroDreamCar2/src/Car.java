public class Car {
    private Engine engine;
    private Door[] doors;
    private Wheel[] wheels;
    private boolean trunkOpened;

    public Car(int numDoors, int numWheels) {
        engine = new Engine();
        this.trunkOpened = false;
        doors = new Door[numDoors];
        wheels = new Wheel[numWheels];

        for(int i = 0; i<numDoors; i++){
            doors[i] = new Door();
        }

        for(int j = 0; j<numWheels; j++){
            wheels[j] = new Wheel();
        }
    }

    public void startEngine(){
        engine.startEngine();
    }

    public void stopEngine(){
        engine.stopEngine();
    }

    public void openAllDoors(){
        for(int i =0; i<doors.length; i++){
            doors[i].openDoor();
        }
    }

    public void inflateWheels(int index){
        wheels[index].inflateWheel();
    }

    public void deflateWheels(int index){
        wheels[index].deflateWheel();
    }

    public void openTrunk(){
        if(this.trunkOpened){
            System.out.println("The trunk is opened.");
        }
        else{
            this.trunkOpened = true;
            System.out.println("Trunk opened");
        }
    }

    public void closeTrunk(){
        if(this.trunkOpened){
            this.trunkOpened = false;
            System.out.println("Trunk closed");
        }
        else{
            System.out.println("The trunk is closed.");
        }
    }
}
