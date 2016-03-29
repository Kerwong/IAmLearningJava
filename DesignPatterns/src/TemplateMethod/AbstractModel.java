package TemplateMethod;

/**
 * Created by Alasad on 2016/3/21.
 */
public abstract class AbstractModel {
    // 基本方法
    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();

    // 模板方法
    public final void templateMethod() {
        step1();
        // 由子类决定是否执行
        if (this.hookMethod()) {
            step2();
        }
        step3();
    }

    // 钩子方法
    protected boolean hookMethod() {
        return true;
    }
}
