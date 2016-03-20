package singleton;

import java.util.ArrayList;

public class LimitedSingletonObject {
    // 定义最多产生实例数
    public static final int LIMITED_NUM = 3;

    // 每个实例都拥有唯一的 name
    private static ArrayList<String> nameList = new ArrayList<String>();
    private static int serialNum = 0;

    // 定义一个存放实例的 ArrayList
    public static ArrayList<LimitedSingletonObject> instanceList = new ArrayList<>();

    // 类自行管理实例生成
    static {
        for (int i = 0; i < LIMITED_NUM; i++) {
            instanceList.add(new LimitedSingletonObject(i));
        }
    }

    private LimitedSingletonObject(int id) {
        nameList.add("instance: " + id);
    }

    public static LimitedSingletonObject getInstance(int id) {
        serialNum = id;
        return instanceList.get(id);
    }

    public static void display() {
        System.out.println("instance: " + serialNum);
    }
}
