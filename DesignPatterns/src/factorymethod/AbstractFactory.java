package factorymethod;

/**
 * Created by Alasad on 2016/3/20.
 */
public abstract class AbstractFactory {
    // 通过泛型增加了两层限制，1. 必须是 Class 类型； 2. 必须继承 Product 类
    //public abstract <T extends Product> T createProduct(Class<T> c);

    public abstract Product createProduct();
}
