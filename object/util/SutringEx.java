package com.multi.object.util;

public class SutringEx {
    private char[] value;


    public SutringEx(char[] value) {
        this.value = value;
    }

    public char charAt(int index) {
        if (index < 0 || index >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return value[index];
    }

    public int codePointAt(int index) {
        if (index < 0 || index >= value.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return value[index];
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof String) {// obj가 String으로 Downcast가 가능한지
            char[] other = ((String) obj).toCharArray();
            if (this.value.length == other.length)
                for(int i = 0; i < this.value.length; i++){
                    if(value[i]!= other[i]){
                        return false;
                    }//if
                }//for
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = new String("abcd");
        str1.charAt(0);
//        System.out.println(str1.equals(str1));
//        System.out.println(str1.equals("abc"));
        SutringEx su = new SutringEx("abcd".toCharArray());
        System.out.println(su.equals("abcd"));
        //        System.out.println(su.charAt(2));
    }
}
