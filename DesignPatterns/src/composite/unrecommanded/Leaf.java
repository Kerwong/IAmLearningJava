package composite.unrecommanded;

import composite.unrecommanded.Component;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/9/16.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    @Deprecated
    public void add(Component child) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public void remove(Component child) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public int count() {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }

    public void doSomething() {
        System.out.println("This is Leaf called " + name);
    }
}
