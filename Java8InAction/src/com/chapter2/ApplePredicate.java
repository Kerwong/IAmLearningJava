package com.chapter2;

import com.chapter1.Apple;

/**
 * Created by wangwc on 2017/6/11.
 */
@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple t);

}
