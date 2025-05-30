public class Main {
    public static void main(String[] args) {
//     Hero hero = new Hero(50, 100);
//     hero.displayStatus();
//     hero.powerUp(40);
//     hero.takeDamage(50);
//     hero.displayStatus();
    Hero[] creatures = new Hero[5];
    Hero player = new Hero(100, 10);
    for(int i = 0; i < 5; i++) {
        creatures[i] = new Hero();
    }
        System.out.println("Player stats: ");
    player.displayStatus();
        System.out.println("Creatures: ");
    for(Hero creature :creatures) {
        creature.displayStatus();
    }


    for(Hero creature : creatures) {
       boolean resultn= fight(player, creature);
       if (!resultn)
           break;
    }
    }
    public static boolean fight(Hero player, Hero creature) {
        if(player.getStrength() > creature.getStrength()) {
            System.out.println("The player has won his battle!");
            return true;
        } else {
            player.setHealth(player.getHealth() - creature.getStrength());
            if (player.getHealth() > 0) {
                System.out.println("The player has survived his battle!");
                return true;
            } else {
                System.out.println("The player has fallen!");
                return false;

            }
        }
    }
}
//Create a class Room with attributes creatureStrength (int) and creatureHealth (int).
//Create an array of 5 Room objects, each with random values for creature strength and health.
//Implement a method fight where the player (with fixed strength and health) fights the creatures in each room.
//If the player wins (based on the strength comparison), they proceed to the next room.
//Output a message indicating whether the player escaped the dungeon or was defeated.
