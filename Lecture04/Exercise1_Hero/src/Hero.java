public class Hero {
    public int health;
    public int strength;

    public Hero(int health, int strength) {
        this.health = 5;
        this.strength = 3;
    }

    public void displayStats() {
        System.out.println("Hero stats: ");
        System.out.println("Health: " + health);
        System.out.println("Strength: " + strength);
        System.out.println("------------------------");

    }

    public void takeDamage(int damage) {
        health -=damage;
        if(health < 0) {
            health = 0;
        }
        System.out.println("Hero took damage " + damage);

    }

    public void powerUp(int increaseStrength) {
        strength += increaseStrength;
        System.out.println("Hero's strength increased by: " + increaseStrength);
    }

    public static void main(String[] args) {
//        Hero hero = new Hero();

//        hero.displayStats();
//        hero.takeDamage(20);
//        hero.powerUp(10);
//        hero.displayStats();
    }
}