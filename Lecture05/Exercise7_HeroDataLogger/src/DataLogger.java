public class DataLogger {
    public static void main(String[] args) {

        if(args.length < 3) {
            System.out.println("Usage: java DataLogger <MissionName> <MissionDate> <FuelConsumed>");
            System.out.println("Example: java DataLogger RescueMission 2024-9-15 35.5");
            return;
        }

        String missionName = args[0];
        String missionDate = args[1];
        String fuelConsumedStr = args[2];

        try {
            double fuelConsumed = Double.parseDouble(fuelConsumedStr);

            System.out.println("Misssion name: " + missionName);
            System.out.println("Misssion date: " + missionDate);
            System.out.println("Fuel consumed: " + fuelConsumed + " liters");

            int fuelInt = (int) fuelConsumed;
            String binary = Integer.toBinaryString(fuelInt);
            String octal = Integer.toOctalString(fuelInt);
            String hexadecimal = Integer.toHexString(fuelInt);

            System.out.println("Fuel consumed (Binary): " + binary);
            System.out.println("Fuel consumed (Octal): " + octal);
            System.out.println("Fuel consumed (Hexadecimal): " + hexadecimal);
        } catch (NumberFormatException e) {
            System.out.println("Error: fuelConsumed must be numeric value");
        }

    }
}

//// DataLogger.java
//public class DataLogger {
//    public static void main(String[] args) {
//        // Check if the required number of arguments are provided
//        if (args.length < 3) {
//            System.out.println("Usage: java DataLogger <MissionName> <MissionDate> <FuelConsumed>");
//            System.out.println("Example: java DataLogger RescueMission 2024-09-15 35.5");
//            return;
//        }
//
//        // Parse command-line arguments
//        String missionName = args[0];
//        String missionDate = args[1];
//        String fuelConsumedStr = args[2];
//
//        try {
//            // Convert fuelConsumed to double using Double wrapper class
//            double fuelConsumed = Double.parseDouble(fuelConsumedStr);
//
//            // Display mission data
//            System.out.println("Mission Name: " + missionName);
//            System.out.println("Mission Date: " + missionDate);
//            System.out.println("Fuel Consumed: " + fuelConsumed + " liters");
//
//            // Convert fuelConsumed to integer for binary, octal, and hexadecimal
//            int fuelInt = (int) fuelConsumed;
//
//            String binary = Integer.toBinaryString(fuelInt);
//            String octal = Integer.toOctalString(fuelInt);
//            String hexadecimal = Integer.toHexString(fuelInt).toUpperCase();
//
//            System.out.println("Fuel Consumed (Binary): " + binary);
//            System.out.println("Fuel Consumed (Octal): " + octal);
//            System.out.println("Fuel Consumed (Hexadecimal): " + hexadecimal);
//
//        } catch (NumberFormatException e) {
//            System.out.println("Error: FuelConsumed must be a numeric value.");
//        }
//    }
//}