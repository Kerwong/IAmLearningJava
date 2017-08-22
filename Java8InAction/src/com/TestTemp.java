package com;

/**
 * Created by wangwenchao02 on 2017/8/14.
 */
public class TestTemp {

    public static void main(String[] args) {
        String s = "-156.999.12.322";

        int dotIndex = s.lastIndexOf(".");
        String s1 = s.substring(0, dotIndex).replaceAll("\\.", "");
        String s2 = s.substring(dotIndex, s.length());
        s = s1 + s2;
        if(s.indexOf('.') == 0) {
            s = "0" + s;
        }

        System.out.println(s);
        return;
    }
}
