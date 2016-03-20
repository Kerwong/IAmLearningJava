package chapter3;

/**
 * Created by Alasad on 2016/3/14.
 */
public class TenuringThreshold {
    private static final int _1MB = 1024*1024;

    /**
     * 长期存活的对象进入老年代
     *  VM 参数：-XX:+UseSerialGC -verbose:gc -Xmx20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
     *          -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
     * */
    @SuppressWarnings("unused")
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];

        // 什么时候进入老年代取决于 XX:MaxTenuringThreshold 设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
