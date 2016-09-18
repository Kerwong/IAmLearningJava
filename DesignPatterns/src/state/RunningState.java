package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public class RunningState extends LiftState {
    @Override
    public void open() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void running() {
        System.out.println("RunningState::running()");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
