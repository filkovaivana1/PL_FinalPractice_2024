public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        FIsh fIsh = new FIsh();
        Bird bird = new Bird();

        System.out.println("Lion output:");
        lion.move();
        lion.sleep();
        lion.sound();


        System.out.println("Fish output:");
        fIsh.move();
        fIsh.sleep();
        fIsh.sound();

        System.out.println("Bird output:");
        bird.move();
        bird.sleep();
        bird.sound();
    }
}

//Create an interface Animal with methods sound(), move(), and sleep().
//Define constants like String KINGDOM_NAME = "Animalia".
//Create classes Lion, Bird, and Fish that implement the Animal interface.
//Implement the methods uniquely in each class: Lion might roar, Bird chirp, and Fish make bubbling sounds.
//Add a main class AnimalKingdomCouncil that creates objects of each type and calls their methods.