public abstract class MenuItem {
    protected String name;
    protected double price;
    protected String description;

    public MenuItem(){}

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public abstract void printDetails();
    public abstract double getPrice();
}