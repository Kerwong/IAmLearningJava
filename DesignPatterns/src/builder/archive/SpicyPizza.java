package builder.archive;

/**
 * Created by Alasad on 2016/8/25.
 */
public class SpicyPizza extends Pizza{
    @Override
    public void dough() {
        System.out.println("SpicyPizza: dough()");
    }

    @Override
    public void sauce() {
        System.out.println("SpicyPizza: sauce()");
    }

    @Override
    public void topping() {
        System.out.println("SpicyPizza: topping()");
    }
}
