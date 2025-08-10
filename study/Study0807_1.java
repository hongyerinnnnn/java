package com.multi.study;

import java.util.ArrayList;

public class Study0807_1 {
    public void  Student(){
        ArrayList<String> m = new ArrayList<>();
        m.add("홍길동");
        m.add("김영희");
        m.add("이철수");

        m.remove("김영희");
        System.out.println("회원 목록 : " + m);
    }
    public static void main(String[] args) {
        Study0807_1 s = new Study0807_1();
        s.Student();

    }
}
