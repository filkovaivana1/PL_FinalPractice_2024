class GasTank {
    private double capacity;
    private double currentFuel;

    public GasTank(double capacity) {
        this.capacity = capacity;
        this.currentFuel = capacity;
    }

    public void emptyTank() {
        currentFuel = 0;
        System.out.println("Gas tank is now empty! ");
    }

    public void refillTank() {
        currentFuel = capacity;
        System.out.println("Gas tank refilled");
    }

    public void consumeFuel(double amount) {
        if (amount <= currentFuel) {
            System.out.println("Consumed " + amount + " liters of fuel");
            currentFuel -= amount;
        } else {
            currentFuel = 0;
            System.out.println("Fuel exhausted");
        }
    }


    //    private double capacity; // in liters
//    private double currentFuel;
//
//    public GasTank(double capacity) {
//        this.capacity = capacity;
//        this.currentFuel = capacity; // start with full tank
//    }
//
//    public void emptyTank() {
//        currentFuel = 0;
//        System.out.println("Gas tank is now empty!");
//    }
//
//    public void refillTank() {
//        currentFuel = capacity;
//        System.out.println("Gas tank refilled.");
//    }
//
//    public double getCurrentFuel() {
//        return currentFuel;
//    }
//
//    public void consumeFuel(double amount) {
//        if (currentFuel >= amount) {
//            currentFuel -= amount;
//            System.out.println("Consumed " + amount + " liters of fuel.");
//        } else {
//            currentFuel = 0;
//            System.out.println("Fuel exhausted!");
//        }
//    }
}