package com.chapter1;

/**
 * Created by wangwc on 2017/6/11.
 */
public class Apple {
    private int weight;
    private String color;

    public static boolean isGreenApple(Apple apple) {
        return "GREEN".equalsIgnoreCase(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 100;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
