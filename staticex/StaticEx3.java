package com.multi.staticex;

public class StaticEx3 {
    private int value;
    private static StaticEx3 staticEx3 = null;
    private StaticEx3(){

    }
    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return this.value;
    }
    public static StaticEx3 getStaticEx3(){
        if(staticEx3==null){
            staticEx3=new StaticEx3();
        }
        return staticEx3;
    }



}
