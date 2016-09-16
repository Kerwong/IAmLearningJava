package composite;

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
    }

    public void remove(Component child) {
        children.remove(child);
    }

    public int count() {
        return children.size();
    }

    public ArrayList<Component> getChildren() {
        return children;
    }
}
