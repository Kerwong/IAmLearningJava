package composite.parent;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/9/16.
 */
public class Composite extends Component {
    private ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component child) {
        children.add(child);
        child.setParent(this);
    }

    public void remove(Component child) {
        children.remove(child);
        child.setParent(null);
    }

    public int count() {
        return children.size();
    }

    public ArrayList<Component> getChildren() {
        return children;
    }
}
