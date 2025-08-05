package com.multi.object.base;

public class Emp1 {
    private String name;
    private int sal;
    private String dname;

    public Emp1() {

    }

    public Emp1(String name) {
        this.name = name;

    }

    public Emp1(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public Emp1(String name, int sal, String dname) {
        this.name = name;
        this.sal = sal;
        this.dname = dname;
    }

    public Emp1(Emp1 e){
        this.name = e.name;
        this.sal = e.sal;
        this.dname = e.dname;
    }

    public void disp(){
        System.out.println(this.name+" "+this.sal+" "+this.dname);
    }
    public static void main(String[] args) {
        Emp1 emp1 = new Emp1("홍예린");
        Emp1 emp2 = new Emp1("홍예린", 90000);
        Emp1 emp3 = new Emp1("안녕", 8000, "하이");
        Emp1 emp4 = new Emp1(emp3);
        emp1.disp();
        emp2.disp();
        emp3.disp();
        emp4.disp();
    }
}
