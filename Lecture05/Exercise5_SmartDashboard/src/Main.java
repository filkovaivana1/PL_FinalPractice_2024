public class Main {
    public static void main(String[] args) {
//       Dashboard dashboard = new Dashboard(50.0, 7.0);
//       dashboard.displayDate();
//       dashboard.displayFuelLevel();
//       dashboard.displayTireStatus();
//       dashboard.calculateTireWear(100.0);
//       dashboard.displayTireStatus();
//       dashboard.displayEngineEfficiency();
//       dashboard.setFuelLevel(dashboard.getFuelLevel() - 45.0);
//       dashboard.displayFuelLevel();

       Dashboard dashboard = new Dashboard(50.0, 7.0);
       dashboard.displayDate();
       dashboard.displayFuelLevel();
       dashboard.displayTireStatus();
       dashboard.calculateTireWear(100.0);
       dashboard.displayTireStatus();
       dashboard.displayEngineEfficiency();
       dashboard.setFuelLevel(dashboard.getFuelLevel()-50.0);
       dashboard.displayFuelLevel();

    }
}
//Goal: Use Java’s Math and String API classes to enhance the hero's car dashboard, showing various statistics and alerts.
//To-Do:

//    public static void main(String[] args) {
//        // Create a SmartDashboard with 50 liters of fuel and an efficiency metric of 5.0
//        SmartDashboard dashboard = new SmartDashboard(50.0, 5.0);
//
//        // Display date and time
//        dashboard.displayDateTime();
//
//        // Display fuel level
//        dashboard.displayFuelLevel();
//
//        // Simulate driving 100 km
//        dashboard.calculateTireWear(100.0);
//
//        // Display tire status
//        dashboard.displayTireStatus();
//
//        // Display engine efficiency
//        dashboard.displayEngineEfficiency();
//
//        // Update fuel level after consumption
//        dashboard.fuelLevel -= 20.0;
//        System.out.println("\nAfter consuming 20 liters of fuel:");
//
//        // Display updated fuel level
//        dashboard.displayFuelLevel();
//    }
