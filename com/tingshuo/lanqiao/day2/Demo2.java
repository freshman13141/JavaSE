package com.tingshuo.lanqiao.day2;

public class Demo2 {
    static int count=0;
    public static void cut(int a, int b){
        if (a==b){
            count++;
            System.out.println(count);
        }else {
            int l= a>b?a:b;
            int w = b>a?a:b;
            l=l-w;
            count++;
            cut(l,w);
        }
    }
    public static void main(String[] args) {
        cut(2019,324);
    }
}
