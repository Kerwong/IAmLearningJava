package mediator.com;

/**
 * Created by Alasad on 2016/8/28.
 */
public class ConcreteColleagueA extends AbstractColleague {
    public ConcreteColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    /* 自有方法，可在类内部完成逻辑处理，而不与其他 Colleague 产生关联*/
    public void selfMethod1() {
        System.out.println("Concrete Colleague A: self-method 1");
    }

    public void selfMethod2(int x) {
        System.out.println("Concrete Colleague A: self-method 2 number = " + x);
    }

    /* 跨 Colleague 的方法，无法在类内部完成逻辑处理，需要 Mediator 协助*/
    public void crossAB() {
        this.mediator.execute(1, "1: cross A and B");
    }

    public void crossAC() {
        this.mediator.execute(2, "2: cross A and C");
    }
}
