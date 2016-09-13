package builder.archive;

/**
 * Created by Alasad on 2016/8/24.
 */
public class Cook {
    private PizzaBuilder pizzaBuilder;

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void createPizza() {
//        pizzaBuilder.buildDough();
//        pizzaBuilder.buildSauce();
//        pizzaBuilder.buildTopping();
    }
}
