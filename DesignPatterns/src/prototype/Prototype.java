package prototype;

/**
 * Created by Alasad on 2016/8/27.
 */
public abstract class Prototype implements Cloneable{
    protected String name;
    protected String type;

    public abstract void setName(String name);
    public abstract String getName();
    public abstract void setType(String type);
    public abstract String getType();

    @Override
    protected Prototype clone() {
        Prototype prototype = null;
        try {
             prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
