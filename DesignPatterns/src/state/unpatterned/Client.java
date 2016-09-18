package state.unpatterned;

/**
 * Created by Alasad on 2016/9/19.
 */
public class Client {
    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.CLOSING);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
        lift.open();
    }
}
