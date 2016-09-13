package builder.archive;

/**
 * Created by Alasad on 2016/8/24.
 */
public class Client {

    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.setPizzaBuilder(new SpicyPizzaBuilder());
        cook.createPizza();
        Pizza spicy = cook.getPizza();
        //spicy.open();
    }
}
