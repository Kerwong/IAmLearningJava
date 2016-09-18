package state.unpatterned;

/**
 * Created by Alasad on 2016/9/19.
 */
public interface ILift {
    public final static int OPENNING = 1;
    public final static int CLOSING = 2;
    public final static int RUNNING = 3;
    public final static int STOPPING = 4;
    public void open();
    public void close();
    public void run();
    public void stop();

    public void setState(int state);
}
