package TemplateMethod;

/**
 * Created by Alasad on 2016/3/21.
 */
public class TestTemplateModel {
    public static void main(String[] args) {
        ConcreteModel1 model = new ConcreteModel1();
        model.setHoodMethod(false);
        model.templateMethod();

        ConcreteModel2 model1 = new ConcreteModel2();
        model1.templateMethod();
    }
}
