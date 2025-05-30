public class Cube implements ThreeDShape{

    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double volume(){
        return side * side* side;
    }
}
