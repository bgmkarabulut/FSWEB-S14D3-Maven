package org.example.arge;

public class CarSkeleton {
    private String name,description;

    public CarSkeleton(){

    }
    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car engine is starting";
    }
    public String drive(){
        this.runEngine();
        System.out.println(getClass().getSimpleName());
        return "the car engine is starting";
    }
    protected String runEngine(){
        System.out.println(getClass().getSimpleName());
        return "the car engine is starting";
    }
}
