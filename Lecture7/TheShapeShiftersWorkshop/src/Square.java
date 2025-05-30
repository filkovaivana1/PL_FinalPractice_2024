public class Square implements TwoDimensionalShape{
    private double side;

    public Square(double side) {
        System.out.println("A new Square has been created");
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
