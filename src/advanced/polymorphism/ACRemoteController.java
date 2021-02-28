package advanced.polymorphism;

public class ACRemoteController implements RemoteController {
    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air conditionin ON");

    }
}
