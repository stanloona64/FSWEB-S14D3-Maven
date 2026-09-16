package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine() {
        return getName() + " Hybrid started. Battery: " + batterySize + ", Cylinders: " + cylinders;
    }

    @Override
    public String drive() {
        runEngine();
        return getName() + " Hybrid mode";
    }

    @Override
    protected void runEngine() {
        System.out.println(" Hybrid Class: " + getClass().getSimpleName());
    }
}
