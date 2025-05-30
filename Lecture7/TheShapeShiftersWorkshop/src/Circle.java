public class Circle implements TwoDimensionalShape {
private double radius;

    public Circle(double radius) {
        System.out.println("A new Circle has been created");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
