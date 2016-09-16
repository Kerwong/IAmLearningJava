package composite.unrecommanded;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/9/16.
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component child);
    public abstract void remove(Component child);
    public abstract int count();
    public abstract ArrayList<Component> getChildren();
}
