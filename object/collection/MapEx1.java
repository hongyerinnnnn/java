package com.multi.object.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
    public void mapMethodEx1() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        System.out.println(hashMap);//toString호출
        hashMap.get(1).startsWith("o");
    }

    public static void main(String[] args) {
        MapEx1 mapEx1 = new MapEx1();
        mapEx1.mapMethodEx1();
    }
}
