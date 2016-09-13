package builder.archive;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/8/24.
 */
public abstract class Pizza {
    private ArrayList<String> sequence = new ArrayList<>();

    public abstract void dough();

    public abstract void sauce();

    public abstract void topping();

    public void create() {
        for (String action : sequence) {
            switch (action) {
                case "dough":
                    this.dough();
                    break;
                case "sauce":
                    this.sauce();
                    break;
                case "topping":
                    this.topping();
                    break;
            }
        }
    }

    public final void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
