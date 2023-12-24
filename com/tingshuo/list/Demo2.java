package com.tingshuo.list;

import java.util.LinkedList;

public class Demo2 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();// 创建一个LinkedList集合(队列)
        queue.addLast("听说");// 添加元素
        queue.addLast("你好");
        queue.addLast("hello");
        System.out.println(queue);// 输出集合
        System.out.println(queue.getFirst());// 输出第一个元素
        System.out.println(queue.size());// 输出集合长度
        queue.removeFirst();// 删除第一个元素
        System.out.println(queue);// 输出集合
        queue.set(0, "听说");// 修改第一个元素
        System.out.println(queue);// 输出集合
        LinkedList<String> stack = new LinkedList<>();// 创建一个LinkedList集合(栈)
        stack.push("子弹1");
        stack.push("子弹2");
        stack.push("子弹3");
        System.out.println(stack);// 输出集合
        stack.pop();// 删除第一个元素
        System.out.println(stack);// 输出集合
    }
}
