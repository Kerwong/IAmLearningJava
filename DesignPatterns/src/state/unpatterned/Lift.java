package state.unpatterned;

/**
 * Created by Alasad on 2016/9/19.
 */
public class Lift implements ILift {
    private int state;

    @Override
    public void setState(int state) { this.state = state; }

    @Override
    public void open() {
        switch (this.state) {
            case OPENNING:
                System.out.println("Do nothing");
                break;
            case CLOSING:
                this.setState(OPENNING);
                break;
            case RUNNING:
                System.out.println("Lift is Running, CANNOT open the door");
                break;
            case STOPPING:
                this.setState(OPENNING);
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENNING:
                this.setState(CLOSING);
                break;
            case CLOSING:
                System.out.println("Do nothing");
                break;
            case RUNNING:
                System.out.println("Lift is running, CANNOT close the door");
                break;
            case STOPPING:
                System.out.println("Do nothing");
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state) {
            case OPENNING:
                System.out.println("The door is opening, CANNOT running");
                break;
            case CLOSING:
                this.setState(RUNNING);
                break;
            case RUNNING:
                System.out.println("Do nothing");
                break;
            case STOPPING:
                this.setState(RUNNING);
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state) {
            case OPENNING:
                System.out.println("Do nothing");
                break;
            case CLOSING:
                System.out.println("Do nothing");
                break;
            case RUNNING:
                this.setState(STOPPING);
                break;
            case STOPPING:
                System.out.println("Do nothing");
                break;
        }
    }
}
