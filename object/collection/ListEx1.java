package com.multi.object.collection;

import java.util.*;

public class ListEx1 {
    //ArrayList, Vector, Stack
    public void listExMethod() {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        System.out.println(list1.toString());//요소의 값들이 하나의 문자열로 출력
        System.out.println(list1.size()); //nodeCount
        System.out.println(list1.get(0));
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        for (String str : list1) {
            System.out.println(str);
        }
        //iterator
//        Iterator<String> iter = list1.iterator(); //반복자가 있어서 자료구조와 무관하게 데이터를 반복해서 가져올 수 있음
//            while(iter.hasNext()) {
//                System.out.println(iter.next());
//            }
        System.out.println(list1.iterator().next());
        System.out.println(list1.iterator().next());
    }

    public void listExMethod2() {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add(0, "Spring");
        //list1.clear();
        list2.add("e");
        list2.add("f");
        list2.add("g");
        list2.add("h");
        list1.addAll(list2);
        //Collection c = new Stack();
        System.out.println(list1);
    }

    public static void main(String[] args) {
        ListEx1 li = new ListEx1();
        //li.listExMethod();
        li.listExMethod2();
    }
}
