package com.multi.object.array;

public class BookMain {
    public static void main(String[] args) {
        Book[] book = {new Book(1, "Java", "홍예린", "multi"),
                       new Book(2, "Python", "홍길동", "멀티"),
                       new Book(3, "C", "홍예린", "multi"),
                       new Book(4, "HTML", "홍예린", "multi")};
        for (Book b : book) {
            System.out.println(b);
        }

    }
}
