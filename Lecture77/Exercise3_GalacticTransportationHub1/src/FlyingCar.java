public class FlyingCar implements Vehicle, GroundTransport, AirTransport{

    double fuelCapacity;
    int passengerCapacity;
    String terrainType;
    double maxAltitude;

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
        System.out.println("Car is driving");
    }

    @Override
    public String getTerrainType(){
        return terrainType;
    }

    @Override
    public void fly(){
        System.out.println("Car is flying up to " + getMaxAltitude());
    }
    @Override
    public double getMaxAltitude(){
        return maxAltitude;
    }

}
