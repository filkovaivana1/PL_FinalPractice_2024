public class DungeonExplorer2 {
    private int playerStrength;
    private int playerHealth;

    public DungeonExplorer2(int playerStrength, int playerHealth) {
        this.playerStrength = playerStrength;
        this.playerHealth = playerHealth;
    }

    public boolean fight(Room room) {
        System.out.println("Starting a fight with creature with strength: " + room.getCreatureStrength() + ", and health: " + room.getCreatureHealth());
        if (playerStrength >= room.getCreatureStrength()) {
            System.out.println("Player defeats the creature!");
            return true;
        } else {
            playerHealth -= room.getCreatureStrength();
            System.out.println("Creature attacks! Player's health reduced by " + room.getCreatureStrength());
            if (playerHealth > 0) {
                System.out.println("Player survives with " + playerHealth + " health remaining.");
                return true;
            } else {
                System.out.println("Player has been defeated!");
                return false;
            }

        }

    }

    public static void main(String[] args) {
        DungeonExplorer2 player = new DungeonExplorer2(50, 100);

        Room[] dungeon = new Room[5];
        for (int i = 0; i < dungeon.length; i++) {
            dungeon[i] = new Room();
        }

        boolean escaped = true;
        for (int i = 0; i < dungeon.length; i++) {
            System.out.println("\nEntering Room " + (i + 1));
            boolean result = player.fight(dungeon[i]);
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