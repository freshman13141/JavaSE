package com.tingshuo.lanqiao.day3;

public class Demo1 {
    public static void main(String[] args) {
        int total = 0;//总钱数
        int sum = 1;//第i天挣钱数
        int d = 0;
        while (total<108){
            d++;
            total+=sum;
            sum+=2;
        }
        System.out.println(d);
    }
}
