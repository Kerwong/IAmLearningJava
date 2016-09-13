package mediator.com;

/**
 * Created by Alasad on 2016/8/28.
 */
public class ConcreteColleagueB extends AbstractColleague {
    public ConcreteColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    /* 自有方法，可在类内部完成逻辑处理，而不与其他 Colleague 产生关联*/
    public void selfMethod1() {
        System.out.println("Concrete Colleague B: self-method 1");
    }

    /* 跨 Colleague 的方法，无法在类内部完成逻辑处理，需要 Mediator 协助*/
    public void crossAB() {
        this.mediator.execute(3, "3: cross A and B");
    }

    public void crossBC(int x) {
        this.mediator.execute(4, "4: cross B and C", x);
    }
}
