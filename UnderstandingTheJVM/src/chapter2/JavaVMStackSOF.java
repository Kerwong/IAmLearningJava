package chapter2;

/**
 * Created by wangwc on 16/3/9.
 */
public class JavaVMStackSOF {

    /** 虚拟机栈和本地方法栈 OOM 测试
     * VM Args: -Xss128k
     * */
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    /** 创建线程导致内存溢出异常
     *  VM Args: -Xss200M
     * */
    private void dontStop() {
        while (true){}
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

//    public static void main(String[] args) {
//        JavaVMStackSOF oom = new JavaVMStackSOF();
//        oom.stackLeakByThread();
//    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }
}
