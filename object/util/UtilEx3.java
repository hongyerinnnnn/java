package com.multi.object.util;

import java.util.*;

//Collection FrameWork
public class UtilEx3 {
    public static void main(String[] args) {
        //선형, 비선형
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list);

        // Set 예제
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "딸기");
        map.put(2, "수박");
        map.put(4, "딸기");
        map.put(4, "수박");
        System.out.println(map);
    }
}
