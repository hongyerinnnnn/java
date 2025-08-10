package com.multi.study;

import java.util.Vector;

public class Study0807_3 {
    public void study() {
        Vector<String> v = new Vector<>();
        v.add("공징사항");
        v.add("Q&A");
        v.add("자유게시판");

        System.out.println("전체 게시판 목록 : ");
        for (int i = 0; i < v.size(); i++) {
            System.out.println((i + 1) + v.get(i));
        }
    }

    public static void main(String[] args) {
        Study0807_3 s = new Study0807_3();
        s.study();
    }
}
