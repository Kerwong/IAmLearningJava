package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public class StoppingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void running() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().running();
    }

    @Override
    public void stop() {
        System.out.println("StoppingState::stop()");
    }
}
