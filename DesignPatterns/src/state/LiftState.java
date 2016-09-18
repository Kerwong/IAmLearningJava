package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();
    public abstract void close();
    public abstract void running();
    public abstract void stop();
}
