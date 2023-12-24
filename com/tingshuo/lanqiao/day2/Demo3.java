package com.tingshuo.lanqiao.day2;

public class Demo3 {
    public static void main(String[] args) {
        int l = 2019;
        int w = 324;
        int c = 0;
        while (true){
            if (l>w){
                c++;
                l-=w;
            } else if (l==w) {
                c++;
                break;
            } else if (l < w) {
                c++;
                w-=l;
            }
        }
        System.out.println(c);
    }
}
