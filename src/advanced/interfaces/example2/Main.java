package advanced.interfaces.example2;

public class Main {

    public static void main(String[] args) {
        Balloon balloon  = new Balloon(50);
        System.out.println(balloon.calculatedMaxSpeed());
        System.out.println(balloon.canFly("bad"));

        Plane plane = new Plane(600);
        System.out.println(plane.calculatedMaxSpeed());
        System.out.println(plane.canFly("bad"));


    }
}
