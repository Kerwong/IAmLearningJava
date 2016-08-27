package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public abstract class AbstractHandler {
    private AbstractHandler nextHandler;

    // 每个处理者都必须对请求作出处理
    public final Response handletMessage(Request request) {
        Response response = null;
        System.out.println(getClass().getName());
        // 判断是否是自己的处理级别
        if (this.getHandlerLevel() == request.getRequestLevel()) {
            response = this.deal(request);
        } else {
            // 不属于自己的处理级别，判断是否是下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handletMessage(request);
            } else {
                System.out.println("没有适当的处理者，无法处理业务");
            }
        }
        return response;
    }

    // 设置下一个处理者
    public void setNext(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    // 每个处理者都有一个处理级别
    protected abstract int getHandlerLevel();
    // 每个处理者都必须实现处理任务
    protected abstract Response deal(Request request);
}
