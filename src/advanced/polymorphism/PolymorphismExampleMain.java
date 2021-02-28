package advanced.polymorphism;

public class PolymorphismExampleMain {

    public static void main(String[] args) {

        RemoteController remote = new TVRemoteController();
        remote.enable(true);
        System.out.println(remote.getClass().getSimpleName());

        remote = new ACRemoteController();
        System.out.println(remote.getClass().getSimpleName());

        TVRemoteController tvRemoteController = new TVRemoteController();
        ACRemoteController acRemoteController = new ACRemoteController();

        //printTVObject(tvRemoteController);
        //printTVObject(acRemoteController);

        printRemoteControllerObject(tvRemoteController);
        printRemoteControllerObject(acRemoteController);
        printRemoteControllerObject(remote);
    }

    private static void printTVObject(TVRemoteController tv) {
        System.out.println(tv.getClass().getSimpleName());
    }
    private static void printACObject(ACRemoteController ac) {
        System.out.println(ac.getClass().getSimpleName());
    }
    private static void printRemoteControllerObject(RemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }
}
