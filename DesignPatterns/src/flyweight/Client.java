package flyweight;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Alasad on 2016/9/15.
 */
public class Client {
    public static void main(String[] args) {
        Flyweight f1 = FlyweightFactory.getFlyweight("1001");
        f1.setIntrinsic(new HashMap<>());
        f1.operate();
        Flyweight f2 = FlyweightFactory.getFlyweight("2016");
        f2.setIntrinsic(new ArrayList<String>());
        f2.operate();
        Flyweight f3 = FlyweightFactory.getFlyweight("1001");
        f3.operate();
        Flyweight f4 = FlyweightFactory.getFlyweight("1002");
        f4.operate();
    }
}
