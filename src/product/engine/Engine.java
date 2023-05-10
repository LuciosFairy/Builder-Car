package product.engine;

public class Engine {
    private double capacity;
    private String type;
    private int power;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    private String typeOfFuel;

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", type='" + type + '\'' +
                ", power=" + power +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                '}';
    }
}
