package com.chapter3Lambda;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by wangwenchao02 on 2017/8/17.
 */

@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader br) throws IOException;
}
