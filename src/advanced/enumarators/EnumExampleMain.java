package advanced.enumarators;

public class EnumExampleMain {
    public static void main(String[] args) {
        // Coffee.AMERICANO.name(); - jei norime pasiekti kaip teksta;
        // Coffee.AMERICANO; - jei norime pasiekti kaip objekta;

        System.out.println(Coffee.AMERICANO.name());

        Coffee coffee =Coffee.valueOf("LATTE");
        System.out.println(coffee.name());

        System.out.println(CarMaker.BMW.fullName);
    }
}
