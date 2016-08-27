package prototype;

/**
 * Created by Alasad on 2016/8/27.
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototypeA a = new ConcretePrototypeA();
        a.setName("AAA");
        a.setType("big");

        Prototype na = a.clone();
        na.getName();
        na.getType();
    }
}
