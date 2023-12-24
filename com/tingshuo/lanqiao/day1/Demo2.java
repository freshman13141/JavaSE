package com.tingshuo.lanqiao.day1;

public class Demo2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= 2019; i++) {
            String s = String.valueOf(i);
            if (s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")){
                count++;
                sum+=i;
            }
        }
        System.out.println("一共："+count+"个");
        System.out.println("和为："+sum);
    }
}
