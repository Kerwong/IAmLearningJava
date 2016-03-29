package TemplateMethod;

/**
 * Created by Alasad on 2016/3/21.
 */
public class ConcreteModel1 extends AbstractModel {
    private boolean flag = true;

    @Override
    protected void step1() {
        System.out.println("Model 1: step1");
    }

    @Override
    protected void step2() {
        System.out.println("Model 1: step2");
    }

    @Override
    protected void step3() {
        System.out.println("Model 1: step3");
    }

    @Override
    protected boolean hookMethod() {
        return this.flag;
    }

    public void setHoodMethod(boolean flag) {
        this.flag = flag;
    }
}
