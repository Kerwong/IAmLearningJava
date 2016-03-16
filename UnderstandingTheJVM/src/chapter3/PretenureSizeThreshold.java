package chapter3;

/**
 * Created by Alasad on 2016/3/14.
 */
public class PretenureSizeThreshold {
    private static final int _1MB = 1024*1024;

    /**
     * VM 参数： -XX:+UseSerialGC -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails
     *          -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=315728
     * */
    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];
    }
}
