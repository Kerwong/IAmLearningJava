package singleton;

/**
 * Created by wangwc on 16/3/20.
 */
public class TestSingleton {

    public static void main(String[] args) {
//        SingletonObject obj = SingletonObject.getInstance();
//        obj.display();

        LimitedSingletonObject instance = LimitedSingletonObject.getInstance(0);
        instance.display();
        instance = LimitedSingletonObject.getInstance(2);
        instance.display();
        instance = LimitedSingletonObject.getInstance(1);
        instance.display();
    }
}
