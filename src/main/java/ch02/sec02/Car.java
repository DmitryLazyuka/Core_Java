package ch02.sec02;

public class Car {
    private double fuelEfficienty;
    private double gasLevel;
    private double distance;

    public Car(double fuelEfficienty, double gasLevel) {
        this.fuelEfficienty = fuelEfficienty;
        this.gasLevel = gasLevel;
    }

    public double getGasLevel() {
        return gasLevel;
    }

    public double getDistance() {
        return distance;
    }

    public void drive(int numberOfMiles) {
        if (gasLevel > 0) {
            double necessaryFuel = numberOfMiles / fuelEfficienty;
            if (gasLevel >= necessaryFuel) {
                System.out.println("You are at your destination point");
                distance += numberOfMiles;
                gasLevel -= necessaryFuel;
            } else {
                double possibleDistance = gasLevel * fuelEfficienty;
                System.out.println("You have traveled " + possibleDistance + " miles. The gas is over.");
                gasLevel = 0;
                distance += possibleDistance;
            }
        } else {
            System.out.println("The gas tank is empty. Refuel");
        }
    }

    public void gasFilling(int gallons) {
        System.out.println(gallons + " gallons of fuel were filled");
        gasLevel += gallons;
    }
}