package prototype;

/**
 * Created by Alasad on 2016/8/27.
 */
public class ConcretePrototypeA extends Prototype {

    @Override
    public void setName(String name) {
        this.name = name;
        System.out.println("ConcretePrototypeA::setName() - " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
        System.out.println("ConcretePrototypeA::setType() - " + type);
    }

    @Override
    public String getType() {
        return this.type;
    }
}
