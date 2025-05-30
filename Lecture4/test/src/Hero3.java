public class Hero3 {
    private int health;
    private int strength;

    public Hero3(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public void displayStats(){
        System.out.println("Current health: " + health + ", current strength: " + strength);
    }

    public void takeDamage(int damage){
        health = health - damage;
    }

    public void powerUp(int increase){
        strength = strength + increase;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}