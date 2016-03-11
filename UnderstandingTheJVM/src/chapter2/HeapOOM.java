package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangwc on 16/3/9.
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
