public class Dungeon {

//    public static boolean fight(Player player, Player creature){
//        System.out.println("Starting fight: ");
//        System.out.println("Creature strength: " + creature.getStrength() + ", Player strength: " + player.getStrength());
//        if(player.getStrength() >= creature.getStrength()) {
//            System.out.println("Player defeats the creature ! ");
//            return true;
//        } else {
//            player.setHealth(player.getHealth()- creature.getStrength());
//            if(player.getHealth() > 0) {
//                System.out.println("Player survived with " + player.getHealth() + " remaining");
//                return  true;
//            } else {
//                System.out.println("Player was defeated");
//                return false;
//            }
//        }
//    }

    public static void main(String[] args) {

        Player player = new Player(40, 100);
        Player[] dungeon = new Player[5];

        for (int i=0; i<dungeon.length; i++) {
            dungeon[i] = new Player();
        }

        boolean survived = true;
        for (int i = 0; i < dungeon.length; i++) {
            boolean result = player.fight(dungeon[i]);
            if (!result) {
                survived = false;
                break;
            }
        }

        if(survived) {
            System.out.println("Congratulations, you've escaped the dungeon !");
        } else {
            System.out.println("You were defeated in the dungeon. ");
        }

    }
}