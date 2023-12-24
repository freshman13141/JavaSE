package com.tingshuo.love;

/**
 * @author 听说
 * @date 2023/11/11 011
 * @Description
 */
public class Demo02 {
    public static void printArray(int[] Array){
        for (int i : Array) {
            System.out.print(i+" ");
        }
    }

    public void printArray2(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+" ");
        }
    }
    public static int[] reverseArray(int[] Array){
        int[] result = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            result[Array.length-1-i] = Array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,9};
        printArray(arr);
        System.out.println();
        Demo02 d3 = new Demo02();
        d3.printArray2(arr);
        System.out.println();
        printArray(reverseArray(arr));
    }
}