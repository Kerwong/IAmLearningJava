package chapter3;

/**
 * Created by Alasad on 2016/3/14.
 */
public class MinorGC {
    private static final int _1MB = 1024*1024;

    /**
     * VM 参数: -XX:+UseSerialGC -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * */
    public static void testAllocation() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];
    }
}
