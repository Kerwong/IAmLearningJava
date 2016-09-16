package composite.parent;

/**
 * Created by Alasad on 2016/9/16.
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    public void doSomething() {
        System.out.println("This is Leaf called " + name);
    }
}
