package com.tingshuo.map;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("听说", 1);
        maps.put("听说", 2);
        maps.put("听说", 3);// 会覆盖前面的值
        maps.put("你好", 4);
        maps.put("hello", 5);
        System.out.println(maps);
    }
}
