package builder;

import java.util.ArrayList;

public abstract class AbstractModel {
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

    final public void run() {
        for (int i =0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);

            if (actionName.equalsIgnoreCase("step1")) {
                this.step1();
            } else if (actionName.equalsIgnoreCase("step2")) {
                this.step2();
            } else if (actionName.equalsIgnoreCase("step3")) {
                this.step3();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
