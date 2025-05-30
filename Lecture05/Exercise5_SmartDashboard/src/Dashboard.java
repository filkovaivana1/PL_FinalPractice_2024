import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Dashboard {

    private double fuelLevel;
    private double[] tireWear;
    private double engineEfficiency;

    public Dashboard(double fuelLevel, double engineEfficiency) {
        this.fuelLevel = fuelLevel;
        this.engineEfficiency = engineEfficiency;
        tireWear = new double[4];
        for (int i = 0; i< 4; i++) {
            tireWear[i] = 0.0;
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void displayDate() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = simpleDateFormat.format(now);
        System.out.println("Current date and time: " + dateTime);
    }

    public void displayFuelLevel() {
        System.out.println("Current fuel level: " + fuelLevel);
        if(fuelLevel < 10) {
            System.out.println("Alert: Fuel level low!");
        }
    }

    public void displayTireStatus() {
        for (int i = 0; i< 4; i++) {
            System.out.println("Tire: " + (i+1) + ", Wear: " + tireWear[i] + "%");
            if (tireWear[i] > 75.0) {
                System.out.println("Tire " + (i+1) + " needs replacement");
            }
        }
    }

    public void calculateTireWear(double traveledDistance) {
        for (int i=0; i < 4; i++) {
            tireWear[i] += traveledDistance * 0.05;
            if (tireWear[i] > 100) {
                tireWear[i] = 100;
            }
        }
    }

    public void displayEngineEfficiency() {
        double efficiency = Math.round((fuelLevel / engineEfficiency) * 100) / 100.0;
        System.out.println("Engine efficiency: " + efficiency);
    }

    //    private double fuelLevel;
//    private double[] tireWear;
//    private double engineEfficiency;
//
//
//    public Dashboard(double fuelLevel, double engineEfficiency) {
//        this.fuelLevel = fuelLevel;
//        this.engineEfficiency = engineEfficiency;
//        tireWear = new double[4];
//        for (int i =0; i < 4; i++) {
//            tireWear[i] = 0.0;
//        }
//    }
//
//    public void setFuelLevel(double fuelLevel) {
//        this.fuelLevel = fuelLevel;
//    }
//
//    public double getFuelLevel() {
//        return fuelLevel;
//    }
//
//    public void displayDate() {
//
//        Date now = new Date(); //yyyy-MM-dd HH:mm:ss
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        String dateTime = simpleDateFormat.format(now);
//        System.out.println("CUrrent date and time: " + dateTime);
//
//    }
//
//    public void displayFuelLevel() {
//        System.out.println("Fuel level: " + fuelLevel + "liters");
//        if (fuelLevel < 10.0) {
//            System.out.println("Alert: Low fuel!");
//        }
//    }
//
//    public void displayTireStatus() {
//        for (int i=0; i<tireWear.length; i++) {
//            System.out.println("Tire: " + (i+1) + ", Wear: " + tireWear[i] + "%");
//            if(tireWear[i] > 75.0) {
//                System.out.println("Alert: Tire " + (i + 1) + "needs replacement.");
//            }
//        }
//    }
//
//    public void calculateTireWear(double distanceTraveled) {
//        for (int i=0; i<tireWear.length; i++) {
//            tireWear[i] += distanceTraveled * 0.05;
//            if(tireWear[i] > 100.0) {
//                tireWear[i] = 100.0;
//            }
//        }
//    }
//
//
//    public void displayEngineEfficiency() {
//        double efficiency = Math.round((fuelLevel / engineEfficiency) * 100) / 100.0;
//        System.out.println("Engine efficiency: " + efficiency);
//    }

//     public void displayEngineEfficiency() {
////        // Example: engine efficiency = fuelLevel / engineEfficiency metric
////        double efficiency = Math.round((fuelLevel / engineEfficiency) * 100.0) / 100.0;
////        System.out.println("Engine Efficiency: " + efficiency + " km/liter");
////    }

//    //    public void calculateTireWear(double distanceTraveled) {
////        // Simple wear calculation: wear increases by 0.05% per km
////        for (int i = 0; i < tireWear.length; i++) {
////            tireWear[i] += distanceTraveled * 0.05;
////            if (tireWear[i] > 100.0) {
////                tireWear[i] = 100.0;
////            }
////        }
////    }

//    public void displayTireStatus() {
//        for (int i = 0; i < tireWear.length; i++) {
//            System.out.println("Tire " + (i + 1) + " Wear: " + tireWear[i] + "%");
//            if (tireWear[i] > 75.0) {
//                System.out.println("Alert: Tire " + (i + 1) + " needs replacement.");
//            }
//        }

//    //    // Method to display fuel level
////    public void displayFuelLevel() {
////        System.out.println("Fuel Level: " + fuelLevel + " liters");
////        if (fuelLevel < 10.0) {
////            System.out.println("Alert: Low fuel!");
////        }
////    }

}

////Create a dashboard that displays the current date, time, fuel level, and tire status.
////Use Math methods to calculate tire wear, and string manipulation methods to alert the hero with custom messages (e.g., "Low fuel").
////Integrate Math class methods to calculate engine efficiency and display it on the dashboard. Gradual Challenge: Build familiarity with Java’s built-in API classes, starting with simple mathematical functions and progressing to string manipulation.

// import java.util.Date;
//import java.text.SimpleDateFormat;
//
//public class SmartDashboard {
//    // Attributes
//    private double fuelLevel; // in liters
//    private double[] tireWear; // percentage per tire
//    private double engineEfficiency; // example metric
//
//    // Constructor
//    public SmartDashboard(double fuelLevel, double engineEfficiency) {
//        this.fuelLevel = fuelLevel;
//        this.engineEfficiency = engineEfficiency;
//        // Initialize tire wear for 4 tires at 0%
//        tireWear = new double[4];
//        for (int i = 0; i < tireWear.length; i++) {
//            tireWear[i] = 0.0;
//        }
//    }
//
//    // Method to display current date and time
//    public void displayDateTime() {
//        Date now = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String dateTime = formatter.format(now);
//        System.out.println("Current Date and Time: " + dateTime);
//    }
//
//    // Method to display fuel level
//    public void displayFuelLevel() {
//        System.out.println("Fuel Level: " + fuelLevel + " liters");
//        if (fuelLevel < 10.0) {
//            System.out.println("Alert: Low fuel!");
//        }
//    }
//
//    // Method to display tire status
//    public void displayTireStatus() {
//        for (int i = 0; i < tireWear.length; i++) {
//            System.out.println("Tire " + (i + 1) + " Wear: " + tireWear[i] + "%");
//            if (tireWear[i] > 75.0) {
//                System.out.println("Alert: Tire " + (i + 1) + " needs replacement.");
//            }
//        }
//    }
//
//    // Method to calculate and display tire wear
//    public void calculateTireWear(double distanceTraveled) {
//        // Simple wear calculation: wear increases by 0.05% per km
//        for (int i = 0; i < tireWear.length; i++) {
//            tireWear[i] += distanceTraveled * 0.05;
//            if (tireWear[i] > 100.0) {
//                tireWear[i] = 100.0;
//            }
//        }
//    }
//
//    // Method to display engine efficiency
//    public void displayEngineEfficiency() {
//        // Example: engine efficiency = fuelLevel / engineEfficiency metric
//        double efficiency = Math.round((fuelLevel / engineEfficiency) * 100.0) / 100.0;
//        System.out.println("Engine Efficiency: " + efficiency + " km/liter");
//    }
//
//    // Lecture11.Main method to simulate the dashboard
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
//}