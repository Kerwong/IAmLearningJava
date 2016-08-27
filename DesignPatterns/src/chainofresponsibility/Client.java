package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class Client {
    public static void main(String[] args) {
        Request request = new Request(4, "Client Request, lv = 4");
        Response response = Chain.deal(request);
        System.out.println("============");
        response.print();
    }
}
