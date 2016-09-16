package composite.parent;

import java.util.ArrayList;

/**
 * Created by Alasad on 2016/9/16.
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("root");

        for (int i = 0; i < 2; i++) {
            Composite branch = new Composite("branch" + i);
            root.add(branch);
        }

        Composite branch = new Composite("branchx");
        root.add(branch);
        Leaf leaf = new Leaf("leafx");
        branch.add(leaf);

        print(root);
        System.out.println("==========");
        print(branch);
    }

    public static void print(Component root) {
        System.out.println("name:" + root.name);
        if (root instanceof Composite) {
            ArrayList<Component> list = ((Composite) root).getChildren();
            for (Component child : list) {
                print(child);
            }
        } else if (root instanceof Leaf) {
            ((Leaf) root).doSomething();
        }
    }
}
