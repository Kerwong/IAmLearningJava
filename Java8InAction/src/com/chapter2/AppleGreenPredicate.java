package com.chapter2;

import com.chapter1.Apple;

/**
 * Created by wangwc on 2017/6/11.
 */
public class AppleGreenPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple t) {
        return t.getColor().equalsIgnoreCase("Green");
    }
}
