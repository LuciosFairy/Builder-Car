package builder;
import product.engine.Engine;

public interface Builder {
    void reset();
    void setEngine(Engine engine);
    void setDoors(int number);
    void setWeight(int weight);
    void setColor(String color);
    void setSits(int sits);
}
