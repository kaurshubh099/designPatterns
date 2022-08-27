package creationalDesignPatterns.SingletonPattern.DataExample;

public class DataMainClass {
    public static void main(String[] args) {
        DataSingleton object = DataSingleton.getInstance();
        DataSingleton object2 = DataSingleton.getInstance();

        object.connection();
        object2.connection();
        object.display();

        System.out.println("\nOperation1:");
        object2.insert("Ram");
        object.insert("Sita");
        object2.display();

        System.out.println("\nOperation2:");
        object.view("Ram");

        System.out.println("\nOperation3:");
        object.update(2, "Sham");
        object.display();

        System.out.println("\nOperation4:");
        object.delete(0);
        object.display();
    }
}
