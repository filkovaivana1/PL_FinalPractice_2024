public class Main {
    public static void main(String[] args) {
        TwoDimensionalShape square = new Square(5);
        TwoDimensionalShape circle = new Circle(10);
        ThreeDimensionalShape cube = new Cube(5);

        System.out.println("Square area and parameter: ");
        System.out.println(" ");
        System.out.println("area : " + square.area());
        System.out.println("parametar : " + square.perimeter());

        System.out.println("Circle area and parameter: ");
        System.out.println(" ");
        System.out.println("area : " + circle.area());
        System.out.println("parametar : " + circle.perimeter());

        System.out.println("Cube volume: ");
        System.out.println(" ");
        System.out.println("volume : " + cube.volume());

    }
}