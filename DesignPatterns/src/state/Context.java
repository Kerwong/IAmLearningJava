package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public class Context {
    public final static OpenningState openningState = new OpenningState();
    public final static ClosingState closingState = new ClosingState();
    public final static RunningState runningState = new RunningState();
    public final static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        System.out.println("Cmd: Open the door");
        this.liftState.open();
    }

    public void close() {
        System.out.println("Cmd: Close the door");
        this.liftState.close();
    }

    public void run() {
        System.out.println("Cmd: Start running");
        this.liftState.running();
    }

    public void stop() {
        System.out.println("Cmd: Stop");
        this.liftState.stop();
    }
}
