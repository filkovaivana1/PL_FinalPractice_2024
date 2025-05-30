//1.	Create a class Product with attributes name (String), price (double), and quantity (int).
//2.	Implement methods to increase or decrease the product quantity based on sales or restocking.
//3.	In the main class, create an array of 5 Product objects.
//4.	Use loops to display product details, restock some items, and update their quantities after sales.
//5.	Include a method that finds the product with the highest quantity and displays its details.
public class Product {
    private String name;
    private  Double price;
    private int quantity;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        if(amount > 0) {
            quantity += amount;
            System.out.println(amount + "units added to product " + name);
        } else {
            System.out.println("Invalid restock amount for product " + name);
        }
    }

    public void decreaseQuantity(int amount) {
        if(amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + "units sold from product " + name);
        } else {
            System.out.println("Invalid sale amount for product " + name);
        }
    }

    public void displayDetails(){
        System.out.println("Product: " + name + ", quantity: " + quantity + ", price: " + price);
    }


    //    private String name;
//    private double price;
//    private int quantity;
//
//    // Constructor
//    public Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    // Getter methods
//    public String getName() {
//        return name;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    // Method to increase quantity (restocking)
//    public void increaseQuantity(int amount) {
//        if (amount > 0) {
//            quantity += amount;
//            System.out.println(amount + " units added to " + name + ".");
//        } else {
//            System.out.println("Invalid restock amount for " + name + ".");
//        }
//    }
//
//    // Method to decrease quantity (sales)
//    public void decreaseQuantity(int amount) {
//        if (amount > 0 && amount <= quantity) {
//            quantity -= amount;
//            System.out.println(amount + " units sold from " + name + ".");
//        } else {
//            System.out.println("Invalid sale amount for " + name + ".");
//        }
//    }
//
//    // Method to display product details
//    public void displayDetails() {
//        System.out.println("Product: " + name + ", Price: $" + price + ", Quantity: " + quantity);
//    }
}
