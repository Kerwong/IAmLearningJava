package factorymethod;

import java.lang.reflect.Constructor;

/**
 * Created by Alasad on 2016/3/21.
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            // 反射方式创建
            Class c = Class.forName(Singleton.class.getName());
            // 获得无参构造
            Constructor constructor = c.getDeclaredConstructor();
            // 设置无参构造可访问
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
