package com.tingshuo.lanqiao.day4;

public class Demo1 {
    public static void main(String[] args) {
        int n=1;
        while (true){
            if (n%5==1){
                int a = (n-1)/5*4;
                if (a%5==2){
                    int b = (a-2)/5*4;
                    if (b%5==3){
                        int c = (b-3)/5*4;
                        if (c%5==4){
                            int d = (c-4)/5*4;
                            if (d%5==0 && d>0){
                                System.out.println(n);
                                break;
                            }
                        }
                    }
                }
            }
            n++;
        }
    }
}
