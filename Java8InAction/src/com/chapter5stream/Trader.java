package com.chapter5stream;/** * Created by wangwenchao02 on 2017/8/21. */public class Trader {    private final String name;    private final String city;    public Trader(String name, String city) {        this.name = name;        this.city = city;    }    public String getName() {        return name;    }    public String getCity() {        return city;    }    @Override    public String toString() {        return "Trader{" +                "name='" + name + '\'' +                ", city='" + city + '\'' +                '}';    }}