package com.tingshuo.lanqiao.day1;

public class Demo3 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= 2019; i++) {
            String s = i+"";               //数字转字符串，这里用了一个小技巧，其实就是String.valueOf(i)
            char[] cs = s.toCharArray();   //字符串转字符数组
            for (char c : cs) {
                if (c == '2' || c == '0' || c == '1' || c == '9') {
                    count++;
                    sum += i;
                    break;
                }
            }
        }
        System.out.println("一共："+count+"个");
        System.out.println("和为："+sum);
    }
}
