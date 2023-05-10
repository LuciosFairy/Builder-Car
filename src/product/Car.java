package product;

import product.engine.Engine;

public class Car {
    private Engine engine;
    private int numberOfDoors;
    private int numberOfSits;
    private String color;
    private int weight;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSits() {
        return numberOfSits;
    }

    public void setNumberOfSits(int numberOfSits) {
        this.numberOfSits = numberOfSits;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfSits=" + numberOfSits +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
