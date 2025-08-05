package com.multi.object.base;

//Object, field(State,상태,Data)
//field가 메모리에 만들어지면 우리가 이것을 instance라고 함

public class Emp2 {
    private String name;
    private int sal;
    private int comm;
    private String dname;

    public Emp2() {
    }
    public Emp2(String name) {
        this(name, 0);
    }

    public Emp2(String name, int sal) {
        this(name, sal, 0);
    }

    public Emp2(String name, int sal, int comm) {
        this(name, sal, comm, null);
    }

    public Emp2(String name, int sal, int comm, String dname) {
        this.name = name;
        this.sal = sal;
        this.comm = comm;
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Emp2{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                ", dname='" + dname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Emp2 emp2 = new Emp2("홍예린");
        Emp2 emp3 = new Emp2("홍", 3000, 300, "인사부");
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
