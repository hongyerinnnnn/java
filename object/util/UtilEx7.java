package com.multi.object.util;

import java.util.*;

public class UtilEx7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.add(6); error 발생 -> Arrays.asList(고정적으로 변환되어서)

        // 섞기
        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        // 역순
        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        // 최대값/최소값
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}