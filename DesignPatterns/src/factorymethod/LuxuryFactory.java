package factorymethod;

/**
 * Created by Alasad on 2016/3/21.
 */
public class LuxuryFactory extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new LuxuryProduct();
    }
}
