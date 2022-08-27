package creationalDesignPatterns.SingletonPattern.SimpleExample;

public class SimpleExample {
    public static void main(String[] args) {
        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        System.out.println("\nPrint messages:");
        object1.showMessage();
        object2.showMessage();

        System.out.println("\nPrint hash codes");
        object1.showHashCode();
        object1.showHashCode();

        System.out.println("\nAre both instances equal? " + object1.equals(object2));
    }
}
