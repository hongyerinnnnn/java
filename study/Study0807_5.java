package com.multi.study;

import java.util.HashMap;
import java.util.Map; // Map.Entry 사용을 위해 추가

public class Study0807_5 {
    public void study() {
        // 1. HashMap 생성
        HashMap<String, Integer> m = new HashMap<>();
        m.put("김철수", 85);
        m.put("이영희", 92);
        m.put("박민수", 78);

        // 2. 특정 학생 점수 조회
        String searchName = "이영희";
        if (m.containsKey(searchName)) {
            System.out.println(searchName + " : " + m.get(searchName));
        } else {
            System.out.println(searchName + " 학생을 찾을 수 없습니다.");
        }

        // 3. 전체 목록 출력
        System.out.println("전체 목록 : " + m);

        // 4. entrySet() 활용해서 Key-Value 각각 출력
        System.out.println("전체 학생 점수 목록");
        for (Map.Entry<String, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Study0807_5 s = new Study0807_5();
        s.study();
    }
}
