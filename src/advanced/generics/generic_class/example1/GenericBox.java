package advanced.generics.generic_class.example1;

public class GenericBox<T> {

    private T item;

    public  GenericBox(T item) {
        this.item =item;
    }

    public GenericBox() {}

    public T getItem() {
        return item;
    }
    public void steItem(T item) {
        this.item = item;
    }
}
