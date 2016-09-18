package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public class ClosingState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("ClosingState::close()");
    }

    @Override
    public void running() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().running();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
