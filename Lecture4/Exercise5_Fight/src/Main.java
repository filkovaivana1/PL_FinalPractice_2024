public class Main {

    public static boolean fight(Player player, Player creature){
        if(player.getStrength() > creature.getStrength()) {
            System.out.println("Player 1 wins the creature");
            return true;
        } else {
            player.setHealth(player.getHealth() - creature.getStrength());
            if (player.getHealth() <= 0) {
                System.out.println("Player 1 is defeated by the creature");
                return false;
            } else {
                System.out.println("Player run away");
                return true;
            }
        }

    }

    public static void main(String[] args) {
            Player player1 = new Player(55, 30);
            Player[] creatures = new Player[5];
            for (int i=0; i<creatures.length; i++){
                creatures[i] = new Player();
            }



            boolean passed = true;
            for(Player player: creatures){
               boolean result = fight(player1, player);
               if(!result) {
                   System.out.println("Game over player got defeated by the creatures");
                   passed = false;
                   break;
               }
            }
            if(passed) {
                System.out.println("PLayer 1 win");
            }




    }
}