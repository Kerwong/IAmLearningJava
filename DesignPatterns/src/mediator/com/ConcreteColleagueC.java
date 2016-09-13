package mediator.com;

/**
 * Created by Alasad on 2016/8/28.
 */
public class ConcreteColleagueC extends AbstractColleague {
    public ConcreteColleagueC(AbstractMediator mediator) {
        super(mediator);
    }

    /* 自有方法，可在类内部完成逻辑处理，而不与其他 Colleague 产生关联*/
    public void selfMethod2(int x) {
        System.out.println("Concrete Colleague C: self-method 2 number = " + x);
    }

    /* 跨 Colleague 的方法，无法在类内部完成逻辑处理，需要 Mediator 协助*/
    public void crossCB(String str) {
        this.mediator.execute(5, "5: cross C and B", str);
    }
}
