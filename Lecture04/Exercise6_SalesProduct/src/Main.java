public class Main {

    public static Product findHighestQuantity(Product[] products) {
        Product highest = products[0];
        for (int i = 1; i < products.length; i++) {
            if (products[i].getQuantity() > highest.getQuantity()) {
                highest = products[i];
            }
        }
        return highest;
    }


    //    public static Product findHighestQuantity(Product[] products) {
//        Product highest = products[0];
//        for (int i = 1; i < products.length; i++) {
//            if (products[i].getQuantity() > highest.getQuantity()) {
//                highest = products[i];
//            }
//        }
//        return highest;
//    }

    public static void main(String[] args) {
        // Create an array of 5 Product objects

        Product[] products = new Product[5];
        products[0] = new Product("Laptop", 999.99, 10);
        products[1] = new Product("Smartphone", 499.99, 25);
        products[2] = new Product("Headphones", 79.99, 50);
        products[3] = new Product("Monitor", 199.99, 15);
        products[4] = new Product("Keyboard", 49.99, 30);

        System.out.println("Initial products: ");
        for (Product p : products) {
            p.displayDetails();
        }


        products[0].increaseQuantity(5);
        products[2].increaseQuantity(20);
        products[1].decreaseQuantity(5);
        products[3].decreaseQuantity(10);
        products[4].decreaseQuantity(15);

        System.out.println("Updated products: ");
        for (Product p : products) {
            p.displayDetails();
        }

        Product highestProd = findHighestQuantity(products);
        System.out.println("Product with highest quantity: ");
        highestProd.displayDetails();


//        Product[] inventory = new Product[5];
//        inventory[0] = new Product("Laptop", 999.99, 10);
//        inventory[1] = new Product("Smartphone", 499.99, 25);
//        inventory[2] = new Product("Headphones", 79.99, 50);
//        inventory[3] = new Product("Monitor", 199.99, 15);
//        inventory[4] = new Product("Keyboard", 49.99, 30);
//
//        // Display initial product details
//        System.out.println("Initial Inventory:");
//        for (Product p : inventory) {
//            p.displayDetails();
//        }
//
//        System.out.println("\nRestocking Products:");
//        // Restock some products
//        inventory[0].increaseQuantity(5);  // Laptop: +5
//        inventory[2].increaseQuantity(20); // Headphones: +20
//
//        System.out.println("\nUpdating Sales:");
//        // Update quantities after sales
//        inventory[1].decreaseQuantity(5);  // Smartphone: -5
//        inventory[3].decreaseQuantity(10); // Monitor: -10
//        inventory[4].decreaseQuantity(15); // Keyboard: -15
//
//        // Display updated product details
//        System.out.println("\nUpdated Inventory:");
//        for (Product p : inventory) {
//            p.displayDetails();
//        }
//
//        // Find and display the product with the highest quantity
//        Product highestQtyProduct = findHighestQuantity(inventory);
//        System.out.println("\nProduct with the Highest Quantity:");
//        highestQtyProduct.displayDetails();

        }
}