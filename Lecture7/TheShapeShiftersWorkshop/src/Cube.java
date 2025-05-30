public class Cube implements ThreeDimensionalShape {
    private double sidea;

    public Cube(double sidea) {
        System.out.println("A new Cube has been created");
        this.sidea = sidea;
    }

    @Override
    public double volume() {
        return sidea*sidea*sidea;
    }
}
