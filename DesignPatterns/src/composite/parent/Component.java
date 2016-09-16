package composite.parent;

/**
 * Created by Alasad on 2016/9/16.
 */
public abstract class Component {
    protected String name;
    protected Component parent;

    public Component(String name) {
        this.name = name;
    }

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }
}
