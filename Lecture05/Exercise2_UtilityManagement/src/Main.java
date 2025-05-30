public class Main {
    public static void main(String[] args) {

        Utility[] utilities = new Utility[3];

        utilities[0] = new Utility("Electricity", 120.35);
        utilities[1] = new Utility("Water", 45.67);
        utilities[2] = new Utility("Internet", 70.00);

        double totalCost = 0;
        Utility mostExpensive = utilities[0];

        for (Utility utility: utilities) {
            totalCost += utility.getPrice();
            if (mostExpensive.getPrice() < utility.getPrice()) {
                mostExpensive = utility;
            }
        }

        double average = totalCost / utilities.length;
        System.out.println("Total cost is: " + totalCost);
        System.out.println("MOst expensive utiility is: " + mostExpensive.getName() + "($" + mostExpensive.getPrice() + ")");
        System.out.println("Average price: " + average);


        //        // Create an array of 6 Utility objects
//        Utility[] utilities = new Utility[6];
//        utilities[0] = new Utility("Heating", 120.50);
//        utilities[1] = new Utility("Electricity", 85.75);
//        utilities[2] = new Utility("Water", 45.30);
//        utilities[3] = new Utility("Internet", 60.00);
//        utilities[4] = new Utility("Security System", 150.00);
//        utilities[5] = new Utility("Garbage Collection", 30.25);
//
//        double totalCost = 0;
//        double maxPrice = utilities[0].getPrice();
//        String mostExpensive = utilities[0].getName();
//
//        // Calculate total cost and find the most expensive utility
//        for (Utility utility : utilities) {
//            totalCost += utility.getPrice();
//            if (utility.getPrice() > maxPrice) {
//                maxPrice = utility.getPrice();
//                mostExpensive = utility.getName();
//            }
//        }
//
//        // Calculate average price
//        double averagePrice = totalCost / utilities.length;
//
//        // Display the results
//        System.out.println("Total Utility Cost: $" + totalCost);
//        System.out.println("Most Expensive Utility: " + mostExpensive + " ($" + maxPrice + ")");
//        System.out.println("Average Utility Price: $" + averagePrice);

    }
}