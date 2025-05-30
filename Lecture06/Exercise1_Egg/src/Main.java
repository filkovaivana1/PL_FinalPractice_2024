public class Main {
    public static void main(String[] args) {

        Egg regularEgg = new Egg();
        System.out.println("Regular egg: ");
        regularEgg.EGG();
        regularEgg.print();

        OstrichEgg ostrichEgg = new OstrichEgg();
        System.out.println("Ostrich egg: ");
        ostrichEgg.EGG();
        ostrichEgg.print();
    }
}

//// Parent class Egg
//class Egg {
//    // Method EGG() displaying a common message
//    public void EGG() {
//        System.out.println("Each egg has an albumen and a yolk.");
//    }
//
//    // Method print() displaying egg properties
//    public void print() {
//        System.out.println("The egg is a nutritional product.");
//    }
//}
//
//// Subclass OstrichEgg inheriting from Egg
//class OstrichEgg extends Egg {
//    // Overriding the EGG() method to provide specific implementation
//    @Override
//    public void EGG() {
//        System.out.println("The albumen and yolk of an ostrich egg are the largest.");
//    }
//}
//
//// Lecture11.Main class to test the Egg and OstrichEgg classes
//public class TaleOfTheEgg {
//    public static void main(String[] args) {
//        // Instantiate an Egg object
//        Egg regularEgg = new Egg();
//        System.out.println("Regular Egg:");
//        regularEgg.EGG();     // Calls Egg's EGG() method
//        regularEgg.print();   // Calls Egg's print() method
//
//        System.out.println();
//
//        // Instantiate an OstrichEgg object
//        OstrichEgg ostrichEgg = new OstrichEgg();
//        System.out.println("Ostrich Egg:");
//        ostrichEgg.EGG();    // Calls OstrichEgg's overridden EGG() method
//        ostrichEgg.print();  // Calls Egg's print() method (inherited)
//    }
//}