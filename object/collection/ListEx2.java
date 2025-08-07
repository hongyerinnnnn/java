package com.multi.object.collection;

import java.util.ArrayList;
import java.util.Vector;

public class ListEx2 {

    public void listMethodEx1() {
        Vector<String> list1 = new  Vector<String>();//ArrayList와 같은 List, 동시성 제어
        list1.addElement("a");
        list1.addElement("b");

    }
    public static void main(String[] args) {
        ListEx2 li = new  ListEx2();
        li.listMethodEx1();
    }
}
