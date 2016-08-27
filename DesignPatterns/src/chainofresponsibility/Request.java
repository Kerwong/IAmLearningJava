package chainofresponsibility;

/**
 * Created by Alasad on 2016/8/21.
 */
public class Request {
    private int requestLevel;
    private String request;

    public Request(int requestLevel, String request) {
        this.requestLevel = requestLevel;
        this.request = request;
    }

    public int getRequestLevel() {
        return requestLevel;
    }

    public String getRequest() {
        return request;
    }
}
