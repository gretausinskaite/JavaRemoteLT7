package advanced.inheritance.abstract_example;

public class Car extends Vehicle {

    //paveldejimas galimas tik viena karta

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed + 20;
    }
}
