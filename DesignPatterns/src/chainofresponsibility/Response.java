package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class Response {
    private String response;

    public Response(String str) {
        response = str;
        System.out.println(str);
    }

    public void print() {
        System.out.println(response);
    }
}
