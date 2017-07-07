package com.chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.*;

/**
 * Created by wangwc on 2017/6/11.
 */
public class Main {

    private List<Apple> inventory = new ArrayList<>();

    public void sort() {
        Collections.sort(inventory, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                } else if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void sort8() {
        inventory.sort(Comparator.comparing(Apple::getWeight));
    }

    public void hiddenFile() {
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });

        File[] hiddenFiles8 = new File(".").listFiles(File::isHidden);
    }



    public static void main(String[] args) {
        Main main = new Main();
        Filter.filterApple(main.inventory, Apple::isGreenApple);

        Filter.filterApple(main.inventory, (Apple a) -> "GREEN".equalsIgnoreCase(a.getColor()));


    }

}
