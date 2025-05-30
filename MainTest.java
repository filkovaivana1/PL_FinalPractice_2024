public class MainTest {
    public static void main(String[] args) {

        if(args.length < 3) {
            System.out.println("Usage: java DataLogger <MissionName> <MissionDate> <FuelConsumed>");
            System.out.println("Example:  java DataLogger RescueMission 2024-09-15 35.5");
            return;
        }


        String missionName = args[0];
        String missionDate = args[1];
        String fuelConsumedStr = args[2];

        try{
            double fuelConsumed = Double.parseDouble(fuelConsumedStr);

            System.out.println("Mission name: " + missionName);
            System.out.println("Mission date: " + missionDate);
            System.out.println("Fuel consumed: " + fuelConsumed + "liters");

            int fuelInt = (int) fuelConsumed;
            String binary = Integer.toBinaryString(fuelInt);
            String octal = Integer.toOctalString(fuelInt);
            String hexadecimal = Integer.toHexString(fuelInt).toUpperCase();

            System.out.println("Fuel consumed (Binary): " + binary);
            System.out.println("Fuel consumed (Octal): " + octal);
            System.out.println("Fuel consumed (Hexadecimal): " + hexadecimal);

        } catch (NumberFormatException e) {
            System.out.println("Error: FuelConsumed must be a numeric value");}
    }
}
