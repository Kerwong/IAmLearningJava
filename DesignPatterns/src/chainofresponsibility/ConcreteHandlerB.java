package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class ConcreteHandlerB extends AbstractHandler{
    @Override
    protected int getHandlerLevel() {
        // 设置处理级别
        System.out.println("Handler B: lv = 2");
        return 2;
    }

    @Override
    protected Response deal(Request request) {
        // 完成处理逻辑
        return new Response("Handler B: " + request.getRequest());
    }
}
