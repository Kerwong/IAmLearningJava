package com.chapter12localdate;import java.time.Duration;import java.time.Instant;import java.time.LocalDate;import java.time.Period;/** * Created by wangwenchao02 on 2017/8/28. */public class TestDurationAndPeriod {    public static void main(String[] args) {        Duration d = Duration.between(LocalDate.MAX.atTime(20, 10), LocalDate.now().atTime(11, 59));        System.out.println(d);        Duration d2 = Duration.between(Instant.EPOCH, Instant.now());        System.out.println(d2);        Period p1 = Period.between(LocalDate.MAX, LocalDate.now());        System.out.println(p1);    }}