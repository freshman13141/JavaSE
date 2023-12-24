package com.tingshuo.lanqiao.day2;

public class Demo1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            long num = (long)i*i*i;     //小心地址越界问题
            String s1 = i+"";
            String s2 = num +"";
            if (s2.endsWith(s1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
