package chapter3;

/**
 * Created by Alasad on 2016/3/14.
 */
public class TenuringThreshold2 {
    private static final int _1MB = 1024*1024;

    /**
     * 长期存活的对象进入老年代
     *  VM 参数：-XX:+UseSerialGC -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
     *          -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution
     * */
    @SuppressWarnings("unused")
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB / 4];

        // allocation1 + allocation2 大于 survivor 空间的一半
        allocation2 = new byte[_1MB / 4];
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
