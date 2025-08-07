package com.multi.object.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ListEx2 {

    public void listMethodEx1() {
        Vector<String> list1 = new Vector<String>();//ArrayList와 같은 List, 동시성 제어
        list1.addElement("a");
        list1.addElement("b");
        list1.add("c");
        for (Object o : list1) {
            System.out.println(o);
        }
        Iterator iterator = list1.iterator();
        for (; iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
        Enumeration enumeration = list1.elements();
            while(enumeration.hasMoreElements()) {
                System.out.println(enumeration.nextElement());
            }

//        list1.remove("a");
//        list1.contains("c");


    }

    public static void main(String[] args) {
        ListEx2 li = new ListEx2();
        li.listMethodEx1();
    }
}
