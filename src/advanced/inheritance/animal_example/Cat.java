package advanced.inheritance.animal_example;

import advanced.inheritance.animal_example.Animal;

public class Cat extends Animal {

    private String color;

    public Cat(String color, String voice, boolean mammal) {
        super(voice, mammal);
        this.color = color;
    }
    @Override
    public String yieldVoice() {
        return "Cat  color: " + color;
    }
}

