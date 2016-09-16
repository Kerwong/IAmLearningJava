package flyweight;

import java.util.HashMap;

/**
 * Created by Alasad on 2016/9/15.
 */
public class FlyweightFactory {
    /** 池容器 **/
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsic) {
        Flyweight flyweight;

        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            // 创建新的享元对象
            flyweight = new ConcreteFlyweight(extrinsic);
            // 放入池中
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
