package advanced.classes.inner_class;

public class Bicycle {

    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    //Inner class privalo tureti inicializuota isorine clase

    public class Wheel {

        public void damage() {
           maxSpeed *= 0.5;
        }
    }
}
