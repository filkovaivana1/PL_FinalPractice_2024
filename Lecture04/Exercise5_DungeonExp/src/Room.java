import java.util.Random;

public class Room {
    private int creatureStrength;
    private int creatureHealth;

    public Room(int creatureStrength, int creatureHealth) {
        this.creatureStrength = creatureStrength;
        this.creatureHealth = creatureHealth;
    }

    public Room() {
        Random random = new Random();
        creatureStrength = random.nextInt(50) + 10;
        creatureHealth = random.nextInt(100) + 20;
    }

    public int getCreatureStrength() {
        return creatureStrength;
    }

    public int getCreatureHealth() {
        return creatureHealth;
    }

    public void setCreatureStrength(int creatureStrength) {
        this.creatureStrength = creatureStrength;
    }

    public void setCreatureHealth(int creatureHealth) {
        this.creatureHealth = creatureHealth;
    }
}
