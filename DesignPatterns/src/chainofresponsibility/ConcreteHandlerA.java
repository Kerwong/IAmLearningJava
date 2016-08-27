package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class ConcreteHandlerA extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        // 设置处理级别
        System.out.println("Handler A: lv = 1");
        return 1;
    }

    @Override
    protected Response deal(Request request) {
        // 完成处理逻辑
        return new Response("Handler A: " + request.getRequest());
    }
}
