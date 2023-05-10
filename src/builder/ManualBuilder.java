package builder;

import product.Car;
import product.engine.CarManual;
import product.engine.Engine;

public class ManualBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setEngine(Engine engine) {
        String content = CarManual.getContent() + "engine: "+engine;
        CarManual.setContent(content);
    }

    @Override
    public void setDoors(int number) {
        String content = CarManual.getContent() + "number: "+number;
        CarManual.setContent(content);
    }

    @Override
    public void setWeight(int weight) {
        String content = CarManual.getContent() + "weight: "+weight;
        CarManual.setContent(content);
    }

    @Override
    public void setColor(String color) {
        String content = CarManual.getContent() + "color: "+color;
        CarManual.setContent(content);
    }

    @Override
    public void setSits(int sits) {
        String content = CarManual.getContent() + "sits: "+sits;
        CarManual.setContent(content);
    }

}
