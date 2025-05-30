import java.util.Random;

public class Hero {
  private int health;
  private int strength;

    public Hero(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }
    public Hero () {
        Random random = new Random();
        health = random.nextInt(101);
        strength = random.nextInt(101);
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public void displayStatus() {
      System.out.println("Hero details:");
      System.out.println("Health: " + health);
      System.out.println("Strength: " + strength);
  }

  public void takeDamage(int damage) {
      health -= damage;
  }

  public void powerUp(int increase) {
      strength += increase;
  }
}

//Create a Hero class with attributes for health (int) and strength (int).
//Include a method displayStats that prints the hero’s current health and strength.
//Create a method takeDamage that reduces the hero's health based on an input damage value.
//Create a method powerUp that increases the hero’s strength by a given value.
//In the main method, create a Hero object, display its stats, apply damage and a power-up, and display the stats again.