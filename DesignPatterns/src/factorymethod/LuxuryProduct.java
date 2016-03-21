package factorymethod;

/**
 * Created by Alasad on 2016/3/20.
 */
public class LuxuryProduct implements Product {

    @Override
    public void getName() {
        System.out.println("Luxury expensive honor!");
    }

    @Override
    public void getPrice() {
        System.out.println("Price: $100.00");
    }
}
