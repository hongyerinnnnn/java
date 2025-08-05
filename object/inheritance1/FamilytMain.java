package com.multi.object.inheritance1;

public class FamilytMain {
    public static void main(String[] args) {
        //GrandFather, Father, Me
//        Me me = new Me();
//        me.sayMe();
//        me.sayFather();
//        me.sayGrandFather();
//        GrandFather gf = (GrandFather)new Father();//UpCasting
//        ((Father)gf).sayFather();//DownCasting

//        Father father = (Father)new GrandFather();
//        father.sayFather();
        GrandFather gf = (GrandFather) new Father();
        gf.sayGrandFather();

    }
}
