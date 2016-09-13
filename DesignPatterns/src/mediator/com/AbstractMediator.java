package mediator.com;


/**
 * Created by Alasad on 2016/8/28.
 */
public abstract class AbstractMediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;
    protected ConcreteColleagueC colleagueC;

    public AbstractMediator() {
        colleagueA = new ConcreteColleagueA(this);
        colleagueB = new ConcreteColleagueB(this);
        colleagueC = new ConcreteColleagueC(this);
    }

    // Mediator Pattern 中最为重要的方法
    public abstract void execute(int str, Object... objects);
}
