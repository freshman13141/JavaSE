package com.tingshuo.lanqiao.day1;

public class Demo1 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 2019; i++) {
            if (i>=1000){
                int l1 = i % 10;
                int l2 = i / 10 % 10;
                int l3 = i / 100 % 10;
                int l4 = i / 1000 % 10;
                if ((l1==2 || l2==2 || l3==2 || l4==2) || (l1==0 || l2==0 || l3==0 || l4==0) || (l1==1 || l2==1 || l3==1 || l4==1) || (l1==9 || l2==9 || l3==9 || l4==9)){
                    System.out.println(i);
                    count++;
                    sum+=i;
                }
            }else if(i>=100){
                int l1 = i % 10;
                int l2 = i / 10 % 10;
                int l3 = i / 100 % 10;
                if ((l1==2 || l2==2 || l3==2) || (l1==0 || l2==0 || l3==0) || (l1==1 || l2==1 || l3==1) || (l1==9 || l2==9 || l3==9)){
                    System.out.println(i);
                    count++;
                    sum+=i;
                }
            }else if(i>=10) {
                int l1 = i % 10;
                int l2 = i / 10 % 10;
                if ((l1==2 || l2==2) || (l1==0 || l2==0) || (l1==1 ||l2 ==1) || (l1==9 || l2==9)){
                    System.out.println(i);
                    count++;
                    sum+=i;
                }
            }else {
                int l1 = i % 10;
                if ((l1==2) || (l1==0) || (l1==1) || (l1==9)){
                    System.out.println(i);
                    count++;
                    sum+=i;
                }
            }
        }
        System.out.println("一共："+count+"个");
        System.out.println("和为："+sum);
    }
}
