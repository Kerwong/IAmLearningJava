package prototype;

/**
 * Created by Alasad on 2016/8/27.
 */
public class ConcretePrototypeB extends Prototype {

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("ConcretePrototypeB::setName() - " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
        System.out.println("ConcretePrototypeB::setType() - " + type);
    }

    @Override
    public String getType() {
        return this.type;
    }
}
