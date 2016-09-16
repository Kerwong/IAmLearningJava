package flyweight;

/**
 * Created by Alasad on 2016/9/15.
 */
public class ConcreteFlyweight extends Flyweight {
    protected ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        if (getIntrinsic() == null) {
            System.out.println("Key = " + extrinsic
                    + ": Intrinsic not set");
            return;
        }

        System.out.println("Key = " + extrinsic + ": "
                + getIntrinsic() + ", "
                + getIntrinsic().getClass());
    }
}
