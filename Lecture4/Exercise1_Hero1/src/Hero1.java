public class Hero1 {

    private int health;
    private int strength;

    public Hero1(int health, int strength) {
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
        Hero1 h = new Hero1(100,10);

        h.displayStats();

        h.takeDamage(20);

        h.powerUp(20);

    }
}



//Create a Hero class with attributes for health (int) and strength (int).
//Include a method displayStats that prints the hero’s current health and strength.
//Create a method takeDamage that reduces the hero's health based on an input damage value.
//Create a method powerUp that increases the hero’s strength by a given value.
//In the main method, create a Hero object, display its stats, apply damage and a power-up, and display the stats again.