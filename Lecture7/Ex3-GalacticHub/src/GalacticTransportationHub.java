public class GalacticTransportationHub {
    public static void main(String[] args) {
        AmphibiousCar car= new AmphibiousCar(60.3,5,"mountain");
        FlyingCar flyingCar=new FlyingCar(57.6,7,"air",130);
        SpaceShuttle spaceShuttle=new SpaceShuttle(82.7,10,250,80);
        System.out.println("Amphinious Car:");
        System.out.println("Fuel capacity: "+car.getFuelCapacity());
        System.out.println("Passenger capacity: "+car.getPassengerCapacity());
        System.out.println("Terrain type: "+car.getTerrainType());
        car.drive();
        System.out.println("\nFlying Car:");
        System.out.println("Fuel capacity: "+flyingCar.getFuelCapacity());
        System.out.println("Passenger capacity: "+flyingCar.getPassengerCapacity());
        System.out.println("Terrain type: "+flyingCar.getTerrainType());
        flyingCar.drive();
        flyingCar.fly();
        System.out.println("Max altitude: "+ flyingCar.getMaxAltitude());

        System.out.println("\nSpace Shuttle:");
        System.out.println("Fuel capacity: "+spaceShuttle.getFuelCapacity());
        System.out.println("Passenger capacity: "+spaceShuttle.getPassengerCapacity());

        spaceShuttle.fly();
        System.out.println("Max altitude: "+ spaceShuttle.getMaxAltitude());
        spaceShuttle.launch();
        System.out.println("Orbit range: "+spaceShuttle.getOrbitRange());



    }
}