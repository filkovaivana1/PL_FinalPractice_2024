public class AmphibiousCar implements Vehicle, GroundTransport{
    double fuelCapacity;
    int passengerCapacity;
    String terrainType;

    public AmphibiousCar(double fuelCapacity, int passengerCapacity, String terrainType) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
    }

    @Override
    public double getFuelCapacity(){
        return fuelCapacity;
    }

    @Override
    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    @Override
    public void drive(){
        System.out.println("Car drives on the road");
    }

    @Override
    public String getTerrainType(){
        return terrainType;
    }
}
