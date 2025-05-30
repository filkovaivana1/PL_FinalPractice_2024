
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MainCourse> mainCourses = new ArrayList<>();
        ArrayList<Dessert> desserts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        class MenuItemData {
            public static ArrayList<String[]> getMainCourses() {
                ArrayList<String[]> items = new ArrayList<>();
                items.add(new String[]{"Grilled Chicken Sandwich", "450.00", "Marinated chicken breast, lettuce, tomato, onion", "false", "2"});
                items.add(new String[]{"Falafel Wrap", "400.00", "Falafel, hummus, cucumber, olives", "true", "1"});
                items.add(new String[]{"Beef Burger", "550.00", "100% beef patty, cheddar, pickles, special sauce", "false", "1"});
                items.add(new String[]{"Vegetable Curry", "500.00", "Seasonal vegetables, coconut milk, curry spices", "true", "4"});
                items.add(new String[]{"Tagliatelle Albanesi", "520.00", "Tagliatelle pasta, beef ragu, Parmigiano-Reggiano", "false", "2"});
                return items;
            }

            public static ArrayList<String[]> getDesserts() {
                ArrayList<String[]> items = new ArrayList<>();
                items.add(new String[]{"Chocolate Brownie", "250.00", "Warm brownie, vanilla ice cream, chocolate sauce", "true", "Warm"});
                items.add(new String[]{"Cheesecake", "280.00", "Graham cracker crust, berry compote", "false", "Chilled"});
                items.add(new String[]{"Baklava", "220.00", "Layered pastry, honey syrup, pistachios", "true", "Room temp"});
                items.add(new String[]{"Fruit Salad", "200.00", "Seasonal fresh fruits, citrus dressing", "false", "Chilled"});
                items.add(new String[]{"Kadaif", "240.00", "Shredded pastry, walnuts, lemon syrup", "true", "Room temp"});
                return items;
            }

            public static void printDetails(MainCourse mainCourse) {
            }

            public static void printDetails(Dessert dessert) {
            }
        }

        while (true) {
            System.out.println("1. Add Main Course: ");
            System.out.println("2. Add Dessert: ");
            System.out.println("3. Display all menu items: ");
            System.out.println("4. Find least expensive item: ");
            System.out.println("5. Find most expensive item: ");
            System.out.println("6. Calculate average price: ");
            System.out.println("7. Exit");
            System.out.println("8. Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String mdName = scanner.nextLine();
                    System.out.println("Enter price($): ");
                    double mdPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter Description:");
                    String mdDescription = scanner.nextLine();
                    System.out.println("Enter is it Vegetarian(true/false): ");
                    boolean isVegetarian = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter spice level(1-5):");
                    int mdspiceLevel = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter if contains Nuts: ");
                    boolean containsNuts = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter Serving Temperature:");
                    String mdservingTemperature = scanner.nextLine();
                    mainCourses.add(new MainCourse(mdName, mdPrice, mdDescription, isVegetarian, mdspiceLevel, containsNuts, mdservingTemperature));
                    break;

                case 2:
                    System.out.println("Enter name: ");
                    String dsName = scanner.nextLine();
                    System.out.println("Enter price: ");
                    double dsPrice = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter Description:");
                    String dsDescription = scanner.nextLine();
                    System.out.println("Enter is it Vegetarian: ");
                    boolean disVegetarian = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter spice level(1-5):");
                    int dsspiceLevel = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter if contains Nuts: ");
                    boolean dcontainsNuts = Boolean.parseBoolean(scanner.nextLine());
                    System.out.println("Enter Serving Temperature:");
                    String dsservingTemperature = scanner.nextLine();
                    desserts.add(new Dessert(dsName,dsPrice,dsDescription,dsservingTemperature,dsspiceLevel,disVegetarian,dcontainsNuts));
                    break;

                case 3:
                    System.out.println("---------------Main Courses--------------");
                    mainCourses.forEach(MenuItemData::printDetails);
                    System.out.println("----------------Desserts------------------");
                    desserts.forEach(MenuItemData::printDetails);
                    break;

                case 4:
                    MenuItem mostExpensive = mainCourses.stream()
                            .map(item -> (MenuItem) item)
                            .max(Comparator.comparingDouble(MenuItem::getPrice))
                            .orElse(null);

                    Dessert expensiveDessert = desserts.stream()
                            .max(Comparator.comparingDouble(MenuItem::getPrice))
                            .orElse(null);

                    if (expensiveDessert != null && (mostExpensive == null || expensiveDessert.getPrice() > mostExpensive.getPrice())) {
                        mostExpensive = expensiveDessert;
                    }

                    if (mostExpensive != null) {
                        System.out.println("Most Expensive Item:");
                        mostExpensive.printDetails();
                    } else {
                        System.out.println("No menu items available.");
                    }
                    break;

                case 6:
                    double totalPrice = mainCourses.stream().mapToDouble(MenuItem::getPrice).sum()
                            + desserts.stream().mapToDouble(MenuItem::getPrice).sum();
                    int totalItems = mainCourses.size() + desserts.size();
                    if (totalItems > 0) {
                        System.out.println("Average Price: $" + (totalPrice / totalItems));
                    } else {
                        System.out.println("No menu items to calculate average price.");
                    }
                    break;

                case 7:
                    System.out.println("Invalid Input");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}