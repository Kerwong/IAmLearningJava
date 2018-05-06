package com;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangwenchao02 on 2017/8/14.
 */
public class TestTemp {

    public static void main(String[] args) {
//        String s = "-156.999.12.322";
//
//        int dotIndex = s.lastIndexOf(".");
//        String s1 = s.substring(0, dotIndex).replaceAll("\\.", "");
//        String s2 = s.substring(dotIndex, s.length());
//        s = s1 + s2;
//        if(s.indexOf('.') == 0) {
//            s = "0" + s;
//        }
//
//        System.out.println(s);

//        DecimalFormat df = new DecimalFormat("0.0000%");
//        System.out.println(df.format(1.00239293));
//
//        System.out.println(25e8);


//        String v1 = "1504105217860";
//        String v2 = "1504105219897";
//
//        System.out.println(v1.compareTo(v2));
//
//        System.out.println(Double.compare(11.9, 20));
//
//        Map<String, String> m = new HashMap<>();
//        m.put("1","2");
//        m.put("3", "4");
//        System.out.println(m.keySet());

        String gene =
                "000001611daff00800000000000000000000000000000000193bd9e00003400a";

        BigInteger i = new BigInteger(gene, 16);
        System.out.println(i.toString());

        return;
    }
}
