package com.multi.object.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public void mapMethodEx1() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");

        Set<Integer> set = hashMap.keySet();
        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            int key = iterator.next();
//            System.out.println(key + ":" + hashMap.get(key));
//        }

        Iterator<Map.Entry<Integer, String>> iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, String> entry = iter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //        System.out.println(hashMap);//toString호출

//        hashMap.get(1).startsWith("o");
    }

    public static void main(String[] args) {
        MapEx1 mapEx1 = new MapEx1();
        mapEx1.mapMethodEx1();
    }
}
