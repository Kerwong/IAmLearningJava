package chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by wangwc on 16/3/9.
 *
 * 使用 unsafe 分配本机内存
 * VM Args: -Xmx20M -XX:MaxDirectMemorySize=10M
 */
public class DirectMemoryOOM {
    private static final int _100MB = 1024*1024*100;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_100MB);
        }
    }

    /*
    java(69061,0x70000021a000) malloc: *** mach_vm_map(size=104857600) failed (error code=3)
            *** error: can't allocate region
            *** set a breakpoint in malloc_error_break to debug
    Exception in thread "main" java.lang.OutOfMemoryError
    at sun.misc.Unsafe.allocateMemory(Native Method)
    at chapter2.DirectMemoryOOM.main(DirectMemoryOOM.java:18)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:497)
    at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)
    */
}
