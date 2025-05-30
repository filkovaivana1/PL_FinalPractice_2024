public class FlyingCar implements Vehicle,AirTransport,GroundTransport{
    private double fuelCapacity;
    private int passengerCapacity;
    private String terrainType;
    private double maxAltitude;

    public FlyingCar(double fuelCapacity, int passengerCapacity, String terrainType, double maxAltitude) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.terrainType = terrainType;
        this.maxAltitude = maxAltitude;
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
        System.out.println("The flying car is driving");
    }
    @Override
    public String getTerrainType(){
        return terrainType;
    }
    @Override
    public void fly(){
        System.out.println("The flying car is flying");

    }
    @Override
    public double getMaxAltitude(){
        return maxAltitude;
    }

}
