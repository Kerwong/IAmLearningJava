package chapter2;

/**
 * Created by wangwc on 16/3/9.
 */
public class JavaMethodAreaOOM {
    /**
     * 借助 CGLib 使方法区出现内存溢出异常
     *
     * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
     * */
    public static void main(String[] args) {
        while (true) {
//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperClass(OOMObject.class);
//            enhancer.setUseCache(false);
//            enhancer.setCallback(new MethodInterceptor() {
//                public Object intercept(Object obj, Method method, Object[] args, Method proxy) throws Throwable {
//                    return proxy.invokeSuper(obj, args);
//                }
//            });
//            enhancer.create();
        }
    }
}
