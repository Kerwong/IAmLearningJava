package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class ConcreteHandlerC extends AbstractHandler{
    @Override
    protected int getHandlerLevel() {
        // 设置处理级别
        System.out.println("Handler C: lv = 3");
        return 3;
    }

    @Override
    protected Response deal(Request request) {
        // 完成处理逻辑
        return new Response("Handler C: " + request.getRequest());
    }
}
