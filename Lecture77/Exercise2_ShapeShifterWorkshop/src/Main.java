public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(4.0);
        Cube cube = new Cube(5.0);
        Square square = new Square(2.0);

        System.out.println("Square: ");
        System.out.println("Perimeter: "  + square.perimeter());
        System.out.println("Area: " + square.area());

        System.out.println("Circle: ");
        System.out.println("Perimeter: "  + circle.perimeter());
        System.out.println("Area: " + circle.area());

        System.out.println("Cube: ");
        System.out.println("Volume: " + cube.volume());
    }
}