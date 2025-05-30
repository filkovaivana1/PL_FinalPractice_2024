public class EndlessLoopOfDoom {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){

            if(i%2==0){
                System.out.println("Iteration: " + i + ", skipping print");
                continue;
            }

            if (i%7==0) {
                System.out.println("Iteration " + i + " reached. Breaking the loop");
                break;
            }

            System.out.println("Iteration: " + i + ", num: " + i);
        }
    }
}