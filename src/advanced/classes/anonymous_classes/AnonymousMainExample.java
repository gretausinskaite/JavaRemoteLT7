package advanced.classes.anonymous_classes;

public class AnonymousMainExample {
    public static void main(String[] args) {

    HttpExecutor executor = new HttpExecutor() {
        public String executeRequest() {
            return "Siandien sviecia saule";
        }
        //po klases metodo implementacijos dedamas ;
    };
        System.out.println(executor.executeRequest());
}
}