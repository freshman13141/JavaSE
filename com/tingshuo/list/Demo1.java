package com.tingshuo.list;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();// 创建一个ArrayList集合
        list1.add("听说");// 添加元素
        list1.add("你好");
        list1.add("hello");
        System.out.println(list1);// 输出集合
        System.out.println(list1.get(0));// 输出第一个元素
        System.out.println(list1.size());// 输出集合长度
        list1.remove(0);// 删除第一个元素
        System.out.println(list1);// 输出集合
        list1.set(0, "听说");// 修改第一个元素
        System.out.println(list1);// 输出集合
        System.out.println(list1.contains("听说"));// 判断集合中是否包含“听说”
        System.out.println(list1.indexOf("听说"));// 输出“听说”在集合中的位置
        System.out.println(list1.isEmpty());// 判断集合是否为空
        list1.clear();// 清空集合
        System.out.println(list1);// 输出集合
    }
}
