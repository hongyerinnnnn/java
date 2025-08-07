package com.multi.object.collection;

import java.util.*;

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
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

//        list1.remove("a");
//        list1.contains("c");


    }

    public void listMethodEx2() {
        //Stack
        Stack<String> stack = new Stack<String>();

        //요소 추가
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // 스택 요소 출력
        System.out.println("Stack: " + stack); // Stack: [A, B, C]

        // 맨 위 요소 접근 (삭제하지 않음)
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Top element: C

        // 요소 삭제 및 반환
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement); // Removed element: C

        // 스택 요소 출력
        System.out.println("Stack after pop: " + stack); // Stack after pop: [A, B]

        // 스택이 비어 있는지 확인
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty); // Is stack empty? false

        // 요소 검색
        int position = stack.search("A");
        System.out.println("Position of 'A': " + position); // Position of 'A': 2

        // 모든 요소 꺼내기
//        while (!stack.empty()) {
//            System.out.println("Popped: " + stack.pop());
//        }

        // 스택이 비어 있는지 확인
        System.out.println("Is stack empty? " + stack.empty()); // Is stack empty? true
    }

    public static void main(String[] args) {
        ListEx2 li = new ListEx2();
        //li.listMethodEx1();
        //li.listMethodEx2();

        Stack<String> stack = new Stack<String>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack.peek());
        System.out.println(stack.indexOf("A"));
        System.out.println(stack.lastIndexOf("A"));
        System.out.println(stack.search("D"));
    }
}
