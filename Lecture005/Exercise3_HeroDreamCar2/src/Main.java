public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 4);
        car.startEngine();
        car.inflateWheels(2);
        car.deflateWheels(2);

        car.openTrunk();
        car.openAllDoors();

        car.stopEngine();
    }
}

//Goal: Design a Car class composed of parts like Engine, Wheel, and Door.
// Each part has its own behaviors (e.g., a door can open/close, a wheel can be inflated/deflated).
//To-Do:
//Create a Car class with nested Engine, Wheel, and Door classes.
//Allow the hero to start the engine, open all doors, inflate a wheel, and close the trunk.
//Add methods for each car part’s actions and create interactions between them.
// Gradual Challenge: Introduce class composition and object interactions through methods like starting the engine and checking wheel pressure.