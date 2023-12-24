package com.tingshuo.list;

public class Demo3 {
    public static void main(String[] args) {
        sum(1, 2, 3, 4, 5);
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9);
        sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
    }
    public static void sum(int... nums) {// 可变参数
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("sum = " + sum);
    }
}
