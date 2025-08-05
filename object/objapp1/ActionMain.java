package com.multi.object.objapp1;

public class ActionMain {
    public static void main(String[] args) {
//        LoginAction loginAction = new LoginAction();
//        DeleteAction deleteAction = new DeleteAction();
//        loginAction.execute();//라이딩한 자신메소드
//        deleteAction.execute();//선조 Action excute호출

        Action action = new LoginAction();
        action.execute();

        action = new DeleteAction();
        action.execute();
    }
}
