package builder.archive;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/8/24.
 */
public class HotPizzaBuilder extends PizzaBuilder {
    private HotPizza hotPizza = new HotPizza();

    @Override
    public Pizza getPizza() {
        return hotPizza;
    }

    @Override
    public void setSeq(ArrayList<String> seq) {
        this.hotPizza.setSequence(seq);
    }
}
