public class Dessert extends MenuItem {
    private boolean containsNuts;
    private String servingTemperature;

    public Dessert() {}

    public Dessert(String name, double price, String description, boolean containsNuts, String servingTemperature) {
        super(name, price, description);
        this.containsNuts = containsNuts;
        this.servingTemperature = servingTemperature;
    }

    public Dessert(String dsName, double dsPrice, String dsDescription, String dsservingTemperature, int dsspiceLevel, boolean isVegetarian, boolean containsNuts) {
    }

    @Override
    public void printDetails () {
        System.out.println("Main course: ");
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
        System.out.println("Contains nuts: " + (containsNuts ? "Yes" : "No"));
        System.out.println("Serving Temperature: " + servingTemperature + "C");
    }
    @Override
    public double getPrice() {
        return price;
    }

}