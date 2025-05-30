public class MainCourse extends MenuItem {
    private boolean isVegetarian;
    private int spiceLevel;

    public MainCourse() {}

    public MainCourse(String name, double price, String description, boolean isVegetarian, int spiceLevel) {
        super(name, price, description);
        this.isVegetarian = isVegetarian;
        this.spiceLevel = spiceLevel;
    }

    public MainCourse(String mdName, double mdPrice, String mdDescription, boolean isVegetarian, int mdspiceLevel, boolean containsNuts, String mdservingTemperature) {
    }


    @Override
    public void printDetails () {
        System.out.println("Main course: ");
        System.out.println("Name: " + name);
        System.out.println("Price: $ " + price);
        System.out.println("Description: " + description);
        System.out.println("Vegetarian: " + (isVegetarian ? "Yes" : "No" ));
        System.out.println("Spice level of this course: " + spiceLevel);
    }
    @Override
    public double getPrice() {
        return price;
    }
    public int getSpiceLevel() {
        return spiceLevel;
    }

}