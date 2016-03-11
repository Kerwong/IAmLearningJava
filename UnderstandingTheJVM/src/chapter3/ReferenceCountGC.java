package chapter3;

/**
 * Created by wangwc on 16/3/9.
 */
public class ReferenceCountGC {

    public Object instance = null;

    private static final int _1MB = 1024*1024;

    /**
     * 此成员属性唯一意义是占点内存,以方便在 GC 日志中看清回收
     * */
    private byte[] bigSize = new byte[ 2 * _1MB ];

    public static void testGC() {
        ReferenceCountGC objA = new ReferenceCountGC();
        ReferenceCountGC objB = new ReferenceCountGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        // 假设此行发生 GC, objA 和 objB 是否被回收?
        System.gc();
    }
}
