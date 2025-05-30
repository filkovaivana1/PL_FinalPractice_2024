import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an array of 5 Spaceship objects
        Spaceship[] fleet = new Spaceship[5];
        fleet[0] = new Spaceship("Nebula", 50, 200, 150);
        fleet[1] = new Spaceship("Orion", 60, 180, 160);
        fleet[2] = new Spaceship("Phoenix", 55, 220, 140);
        fleet[3] = new Spaceship("Titan", 65, 190, 155);
        fleet[4] = new Spaceship("Eclipse", 58, 210, 145);

        Random rand = new Random();

        // Simulate a battle
        System.out.println("Battle Simulation Begins!\n");
        for (int i = 0; i < fleet.length; i++) {
            System.out.println("Processing " + fleet[i].getName() + ":");
            // Random event: 0 for firepower increase, 1 for shield repair
            int event = rand.nextInt(2);
            if (event == 0) {
                // Increase firepower by a random amount between 10 and 30
                int increase = rand.nextInt(21) + 10;
                fleet[i].increaseFirePower(increase);
            } else {
                // Repair shields by a random amount between 5 and 25
                int repair = rand.nextInt(21) + 5;
                fleet[i].increaseShieldStrength(repair);
            }
            System.out.println();
        }

        // Find the spaceship with the highest firepower
        Spaceship highestFirepowerShip = fleet[0];
        for (int i = 1; i < fleet.length; i++) {
            if (fleet[i].getFirepower() > highestFirepowerShip.getFirepower()) {
                highestFirepowerShip = fleet[i];
            }
        }

        // Display all spaceships
        System.out.println("Fleet Status After Battle:");
        for (Spaceship ship : fleet) {
            ship.displayDetails();
        }

        // Display the spaceship with the highest firepower
        System.out.println("\nSpaceship with the Highest Firepower:");
        highestFirepowerShip.displayDetails();

    }
}