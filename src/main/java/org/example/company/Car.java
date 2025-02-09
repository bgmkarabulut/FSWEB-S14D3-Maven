package org.example.company;

public class Car {
    private boolean engine;
    private int cylinders,wheels;
    private String name;

    public Car(int cylinders,String name){
        this.name=name;
        this.cylinders=cylinders;
        this.wheels=4;
        this.engine=true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString(){
        return "Cylinder: "+this.cylinders+", Name: "+this.name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==this)
            return true;
        if(!(obj instanceof Car))
            return false;
        Car carObj=(Car) obj;

        return this.cylinders==carObj.cylinders &&
                this.name.equals(carObj.name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }
    public String accelerate(){
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }
    public String brake(){
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }

}
