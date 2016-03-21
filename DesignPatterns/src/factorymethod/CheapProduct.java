package factorymethod;

/**
 * Created by Alasad on 2016/3/20.
 */
public class CheapProduct implements Product {
    @Override
    public void getName() {
        System.out.println("cheap cheap cheap");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $1.00");
    }
}
