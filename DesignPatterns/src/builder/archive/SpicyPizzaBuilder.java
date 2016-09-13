package builder.archive;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/8/24.
 */
public class SpicyPizzaBuilder extends PizzaBuilder {
    private SpicyPizza spicyPizza = new SpicyPizza();

    @Override
    public Pizza getPizza() {
        return this.spicyPizza;
    }

    @Override
    public void setSeq(ArrayList<String> seq) {
        this.spicyPizza.setSequence(seq);
    }
}
