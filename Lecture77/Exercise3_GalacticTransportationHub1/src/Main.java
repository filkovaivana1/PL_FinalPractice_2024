public class Main {
    public static void main(String[] args) {
       AmphibiousCar amphibiousCar = new AmphibiousCar(50.0, 4, "mixed");
       FlyingCar flyingCar = new FlyingCar(60.0, 4, "urban road", 1000.0);
        SpaceShuttle spaceShuttle = new SpaceShuttle(1000.0, 2, 6000.0, 555.0);

      amphibiousCar.drive();
        System.out.println("amphibiousCar.getFuelCapacity(): " + amphibiousCar.getFuelCapacity());
        System.out.println("Passenger capacity" + amphibiousCar.getPassengerCapacity());
        System.out.println("Terrain type: " + amphibiousCar.getTerrainType());


        flyingCar.drive();
        flyingCar.fly();
        System.out.println("getFuelCapacity(): " + flyingCar.getFuelCapacity());
        System.out.println("Passenger capacity" + flyingCar.getPassengerCapacity());
        System.out.println("Terrain type: " + flyingCar.getTerrainType());

        spaceShuttle.launch();
        spaceShuttle.fly();
        System.out.println("getFuelCapacity(): " + spaceShuttle.getFuelCapacity());
        System.out.println("Passenger capacity" + spaceShuttle.getPassengerCapacity());
        System.out.println("Max altitlude: " + spaceShuttle.getMaxAltitude());
        System.out.println("Orbit range: " + spaceShuttle.getOrbitRange());





    }
}