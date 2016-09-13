package mediator.com;

/**
 * Created by Alasad on 2016/8/28.
 */
public class Mediator extends AbstractMediator {
    /** Mediator Pattern 中最为重要的方法
     *  通过 func 编码区分方法，同时从可变长参数中取值
     */
    @Override
    public void execute(int func, Object... objects) {
        System.out.println(String.valueOf(objects[0]));
        switch (func) {
            case 1: aCrossAB(); break;
            case 2: aCrossAC(); break;
            case 3: bCrossAB(); break;
            case 4: bCrossBC((Integer) objects[1]); break;
            case 5: cCrossCB((String) objects[1]); break;
            default:break;
        }
    }

    /** 跨 Colleague 类的方法，区分的关键在于，该业务涉及到多个类
     * 其中的逻辑可以是各个 Colleague 独立处理，也可以是多个 Colleague 协同处理
     * */
    public void aCrossAB() {
        super.colleagueA.selfMethod1();
        super.colleagueB.selfMethod1();
    }

    public void aCrossAC() {
        super.colleagueA.selfMethod2(100);
        super.colleagueC.crossCB("test");
        super.colleagueC.selfMethod2(50);
    }

    public void bCrossAB() {
        super.colleagueA.selfMethod2(40);
        super.colleagueB.selfMethod1();
    }

    public void bCrossBC(int x) {
        super.colleagueB.selfMethod1();
        super.colleagueC.selfMethod2(80);
    }

    public void cCrossCB(String str) {
        System.out.println("mediator cCross C and B " + str);
        super.colleagueC.selfMethod2(60);
        super.colleagueB.selfMethod1();
    }
}
