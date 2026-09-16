package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public String startEngine() {
        return getName() + " Electric car started. Battery size: " + batterySize + " kWh";
    }

    @Override
    public String drive() {
        runEngine();
        return getName() + " Electric Avg: km/charge: " + avgKmPerCharge;
    }

    @Override
    protected void runEngine() {
        System.out.println(" Running Electric motor. Class: " + getClass().getSimpleName());
    }
}
