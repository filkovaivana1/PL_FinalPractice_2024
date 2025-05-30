public class DungeonExp {

    private int playerStrength;
    private int playerHealth;

    public DungeonExp(int playerStrength, int playerHealth) {
        this.playerStrength = playerStrength;
        this.playerHealth = playerHealth;
    }

    public static boolean fight(Room room, Room player) {
        System.out.println("Starting a fight with creature with strength: " + room.getCreatureStrength() + ", and health: " + room.getCreatureHealth());
        if (player.getCreatureStrength() >= room.getCreatureStrength()) {
            System.out.println("Player defeats the creature!");
            return true;
        } else {
            player.setCreatureHealth(player.getCreatureHealth() - room.getCreatureStrength());
            System.out.println("Creature attacks! Player's health reduced by " + room.getCreatureStrength());
            if (player.getCreatureHealth() > 0) {
                System.out.println("Player survives with " + player.getCreatureHealth() + " health remaining.");
                return true;
            } else {
                System.out.println("Player has been defeated!");
                return false;
            }

        }

    }

    public static void main(String[] args) {

        Room player = new Room(50, 100);

        Room[] dungeon = new Room[5];
        for (int i = 0; i < dungeon.length; i++) {
            dungeon[i] = new Room();
        }

        boolean escaped = true;
        for (int i = 0; i < dungeon.length; i++) {
            System.out.println("\nEntering Room " + (i + 1));
            boolean result = fight(dungeon[i],player);
            if (!result) {
                escaped = false;
                break;
            }
        }

        if (escaped) {
            System.out.println("\nCongratulations! You have escaped the dungeon.");
        } else {
            System.out.println("\nYou were defeated in the dungeon.");
        }
    }
}