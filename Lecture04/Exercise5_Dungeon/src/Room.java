import java.util.Random;

public class Room {

    private int creatureStrength;
    private int creatureHealth;

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
}
