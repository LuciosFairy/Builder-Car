package builder;

import product.Car;
import product.engine.Engine;

public class CarBuilder implements Builder {

    private Car car;
    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setEngine(Engine engine) {
        car.setEngine(engine);
    }

    @Override
    public void setDoors(int number) {
        car.setNumberOfDoors(number);
    }

    @Override
    public void setWeight(int weight) {
        car.setWeight(weight);
    }

    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public void setSits(int sits) {
        car.setNumberOfSits(sits);
    }
}
