package TemplateMethod;

/**
 * Created by Alasad on 2016/3/21.
 */
public class ConcreteModel2 extends AbstractModel{
    @Override
    protected void step1() {
        System.out.println("Model 2: step1");
    }

    @Override
    protected void step2() {
        System.out.println("Model 2: step2");
    }

    @Override
    protected void step3() {
        System.out.println("Model 2: step3");
    }
}
