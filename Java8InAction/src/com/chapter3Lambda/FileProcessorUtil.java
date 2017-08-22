package com.chapter3Lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by wangwenchao02 on 2017/8/17.
 */
public class FileProcessorUtil {

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader("/Users/wangwc/Documents/工作/Baidu/重要账号与地址.txt"))) {
            return p.process(br);
        }
    }
}
