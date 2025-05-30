public class SpaceShuttle implements Vehicle, AirTransport, SpaceTransport{

    double fuelCapacity;
   int passengerCapacity;
   double maxAltitude;
   double orbitRange;

    public SpaceShuttle(double fuelCapacity, int passengerCapacity, double maxAltitude, double orbitRange) {
        this.fuelCapacity = fuelCapacity;
        this.passengerCapacity = passengerCapacity;
        this.maxAltitude = maxAltitude;
        this.orbitRange = orbitRange;
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
    public void fly(){
        System.out.println("Car is flying up to " + getMaxAltitude());
    }
    @Override
    public double getMaxAltitude(){
        return maxAltitude;
    }

    @Override
    public void launch(){
        System.out.println("Space shuttle is lunching ");
    }

    @Override
    public double getOrbitRange(){
        return orbitRange;
    }

}
