package chapter2;

/**
 * Created by wangwc on 16/3/9.
 */
public class RuntimeConstantPoolOOM {

    /**
     * 运行时常量池导致的内存溢出异常
     *
     * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
     * */
//    public static void main(String[] args) {
//        //使用 List 保持着常量池引用,避免 Full GC 回收常量池行为
//        List<String> list = new ArrayList<String>();
//
//        //10MB 的 PermSize 在 integer 范围内足够产生 OOM 了
//        int i = 0;
//        while (true) {
//            list.add(String.valueOf(i++).intern());
//        }
//    }

    /**
     * String.inter() 返回引用的测试
     *
     * VM Args:
     * */
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);  // true

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);  // false
    }
}
