package advanced.generics.generic_class.example1;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(0);
        String text = "tekstas";
        int number = 50;
        double floatingPointNumber = 5.4;

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
        GenericBox<String> boxWithText = new GenericBox<>(text);
        GenericBox<Integer> boxWithNumber = new GenericBox<>(number);

        System.out.println(boxWithCarInIt.getItem());
        System.out.println(boxWithNumber.getItem());

        GenericBox genericBox = new GenericBox();
        genericBox.steItem("sekmadienis");
        genericBox.steItem(new Car(5));
        genericBox.steItem(BigDecimal.ZERO);

        System.out.println(genericBox.getItem());

    }
}
