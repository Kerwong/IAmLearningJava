package factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alasad on 2016/3/21.
 */
public class ProductFactory {
    private static final Map<String, Product> proMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        if (proMap.containsKey(type)) {
            product = proMap.get(type);
        } else {
            if (type.equals("Cheap")) {
                product = new CheapProduct();
            } else if (type.equals("Luxury")) {
                product = new LuxuryProduct();
            } else {
                product = null;
            }
        }
        return product;
    }
}
