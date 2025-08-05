package com.multi.operator;

//연산자 최우선() . []
public class OperatorEx2 {//클래스(설계도, 사용자정의 자료형)

    public int parentheses(int a, int b, int k) {
        System.out.println("parentheses");
//        if (++a == --b)
//            return a + b + k;
//        else return (a + b) * k;
        return ++a == --b ? a + b * k : (a + b) * k;
    }

    public void unaryOperator(int a, int b, int k) {
        // + - ++ -- ! ~
        int r = ++a + -b-- + ++k;
        System.out.println(-r != k);
    }

    public String arithmeticOperator(int x, int y, int k) {
        if (x++ != --y) {
            return "java";
        } else if (x % y == 0) {
            return "Spring";
        }
        return "dafualt";
    }

    public void logicalOperator(int x, int y, int k, int z, int i) {
        //& | 비트 논리연산자
        //&& || 일반 논리연산자
        //boolean isState = ++x > y-- & ++k==z-- & i--==5;//하나가 거짓이므로 다 거짓 하지만 숫자느 다 바뀜 // x=2, y=1, k=4, z=3, i=4
//        boolean isState = ++x > y-- && ++k ==z-- && i--==5;//하나가 거짓이므로 다 거짓 따라서 앞에 식만 바뀌고 뒤에 숫자는 멀쩡
        boolean isState = ++x > y-- || ++k ==z-- && i--==5;
        
        System.out.printf("isTate%b, x =%d, y=%d ,z=%d,i=%d", isState, x, y, z, i);
    }
    public void assignmentOperator(){
        int x = 1;
        x+=1;
        x=x+1;
        x=+1; //+1을 x에 넣기 때문에 값이 1로 초기화
        x*=2;//x=x*2
        x/=2;//x=x/2
        System.out.println(x);
    }
    public static void main(String[] args) {
        OperatorEx2 o = new OperatorEx2();
//        int rs = o.parentheses(1, 2, 3);
//        System.out.println("rs=" + rs);
//        o.unaryOperator(1, 2, 3);
//        String rs = o.arithmeticOperator(1, 2, 3);
//        System.out.println(rs);
//        o.logicalOperator(1, 2, 3, 4, 5);
        o.assignmentOperator();
    }
}
