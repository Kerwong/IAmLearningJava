package factorymethod;

/**
 * Created by Alasad on 2016/3/21.
 */
// 简单工厂类
public class Factory {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
