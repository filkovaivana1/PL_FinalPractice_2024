import java.util.Random;

public class Player {
    private int health;
    private int strength;

    public Player() {
        Random random = new Random();
        this.health = random.nextInt(50);
        this.strength = random.nextInt(100);
    }

    public Player(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}

//Create a class Room with attributes creatureStrength (int) and creatureHealth (int).
//Create an array of 5 Room objects, each with random values for creature strength and health.
//Implement a method fight where the player (with fixed strength and health) fights the creatures in each room.
//If the player wins (based on the strength comparison), they proceed to the next room.
//Output a message indicating whether the player escaped the dungeon or was defeated.
