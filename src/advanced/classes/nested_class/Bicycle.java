package advanced.classes.nested_class;

public class Bicycle {
    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    //get ir set!
    //Nested class
    public static class Mechanic {
        public void upgrade(Bicycle bicycle) {
            bicycle.maxSpeed *= 2;
        }
    }
}