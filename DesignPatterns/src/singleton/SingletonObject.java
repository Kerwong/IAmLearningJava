package singleton;

public class SingletonObject {
    private SingletonObject(){}

    private static SingletonObject instance = new SingletonObject();

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }

    public void display() {
        System.out.println("This is Singleton");
    }

}
