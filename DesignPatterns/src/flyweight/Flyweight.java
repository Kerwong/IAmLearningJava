package flyweight;

/**
 * Created by Alasad on 2016/9/15.
 */
public abstract class Flyweight {
    // 一般作为 Value
    private Object intrinsic;
    // 一般作为 Key
    protected final String extrinsic;

    // 享元角色必须设置 extrinsic，但可以不设置 intrinsic
    protected Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public abstract void operate();

    /* getter/setter intrinsic */
    public Object getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(Object intrinsic) {
        this.intrinsic = intrinsic;
    }
}
