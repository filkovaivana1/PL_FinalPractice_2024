import java.util.Random;

public class Player {
    private int strength;
    private int health;

    public Player(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }

    public Player() {
        Random random = new Random();
        this.strength = random.nextInt(50) + 10;
        this.health = random.nextInt(100) + 20;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


    public boolean fight(Player creature){
        System.out.println("Starting fight: ");
        System.out.println("Creature strength: " + creature.getStrength() + ", Player strength: " + getStrength());
        if(getStrength() >= creature.getStrength()) {
            System.out.println("Player defeats the creature ! ");
            return true;
        } else {
            setHealth(getHealth()-creature.getStrength());
            if(getHealth() > 0) {
                System.out.println("Player survived with " + getHealth() + " remaining");
                return  true;
            } else {
                System.out.println("Player was defeated");
                return false;
            }
        }
    }


}
