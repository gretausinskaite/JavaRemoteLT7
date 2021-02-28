package advanced.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        pokemons.offer("Charmander");
        pokemons.offer("Pikachu");
        //first element
        System.out.println(pokemons.peek());
        //deletes first one and prints it
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());
    }
}
