package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    public int batterySize,cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "HybridCar's engine is starting";
    }
    @Override
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "HybridCar's engine is starting";
    }
}
