package builder.archive;

/**
 * Created by Alasad on 2016/8/25.
 */
public class HotPizza extends Pizza {
    @Override
    public void dough() {
        System.out.println("HotPizza: dough()");
    }

    @Override
    public void sauce() {
        System.out.println("HotPizza: sauce()");
    }

    @Override
    public void topping() {
        System.out.println("HotPizza: topping()");
    }
}
