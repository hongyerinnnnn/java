package com.multi.staticex;

//static(정적), final(상수)
public class StudentEx {
    private String name;
    private int age;
    private String email;
    private static String nation;

    static {
        nation = "우간다";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setNation(String nation) {
        StudentEx.nation = nation;
    }
    public static String gdtNation(){
        return StudentEx.nation;
    }
    public static void main(String[] args) {
        StudentEx stud1 = new StudentEx();
        StudentEx stud2 = new StudentEx();


    }
}
