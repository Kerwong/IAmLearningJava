package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/22.
 */
public class Chain {
    // 定义责任链
    public static Response deal(Request request) {
        AbstractHandler handlerA = new ConcreteHandlerA();
        AbstractHandler handlerB = new ConcreteHandlerB();
        AbstractHandler handlerC = new ConcreteHandlerC();

        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        return handlerA.handletMessage(request);
    }
}
