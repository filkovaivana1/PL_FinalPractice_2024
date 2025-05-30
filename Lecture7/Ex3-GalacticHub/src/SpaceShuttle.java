public class SpaceShuttle implements Vehicle, AirTransport, SpaceTransport {
    private double fuelCapacity;
    private int passengerCapacity;
    private double maxAltitude;
    private double OrbitRange;

    public SpaceShuttle(double fuelCapacity, int passengerCapacity, double maxAltitude, double orbitRange) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.maxAltitude = maxAltitude;
        OrbitRange = orbitRange;
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
    public double getMaxAltitude(){
        return maxAltitude;
    }
    @Override
    public void fly(){
        System.out.println("The space shuttle is flying");
    }
    @Override
    public void launch(){
        System.out.println("The space shuttle is launching");
    }
    @Override
    public double getOrbitRange(){
        return OrbitRange;
    }
}
