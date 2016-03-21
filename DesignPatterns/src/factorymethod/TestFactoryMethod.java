package factorymethod;

/**
 * Created by Alasad on 2016/3/20.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
//        AbstractFactory factory = new ConcreteFactory();
//
//        Product luxuryProduct = factory.createProduct(LuxuryProduct.class);
//        luxuryProduct.getName();
//        luxuryProduct.getPrice();
//
//        Product cheapProduct = factory.createProduct(CheapProduct.class);
//        cheapProduct.getName();
//        cheapProduct.getPrice();
//
//        Factory factory1 = new Factory();
//        Product luxuryProduct1 = factory.createProduct(LuxuryProduct.class);
//        luxuryProduct1.getName();
//        luxuryProduct1.getPrice();
//        factory.createProduct(CheapProduct.class);

        Product cheapProduct = (new CheapFactory()).createProduct();
        cheapProduct.getName();
        cheapProduct.getPrice();
        Product luxuryProduct = (new LuxuryFactory()).createProduct();
    }
}
