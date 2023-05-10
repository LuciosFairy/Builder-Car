package director;

import builder.Builder;
import product.engine.Engine;

public class Director {
    public void makeMazdaRX7(Builder builder){
        builder.reset();
        builder.setColor("black");
        builder.setDoors(2);
        Engine engine = new Engine();
        engine.setCapacity(1300);
        engine.setPower(400);
        engine.setType("wankl");
        engine.setTypeOfFuel("petrol");
    }
}
