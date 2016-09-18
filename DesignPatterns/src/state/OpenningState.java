package state;

/**
 * Created by Alasad on 2016/9/18.
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        System.out.println("OpeningState::open()");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    @Override
    public void running() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException();
    }
}
