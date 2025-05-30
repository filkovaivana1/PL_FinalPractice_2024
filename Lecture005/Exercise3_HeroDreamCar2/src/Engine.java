public class Engine {
    private boolean started;

    public Engine() {
        this.started = false;
    }

    public void startEngine() {
        if (this.started) {
            System.out.println("The engine is already started.");
        }
        else{
            this.started = true;
            System.out.println("Engine started");
        }
    }

    public void stopEngine() {
        if (this.started) {
            this.started = false;
            System.out.println("Engine stopped");
        }
        else{
            System.out.println("The engine is off.");
        }
    }
}
