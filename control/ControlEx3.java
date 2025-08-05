package com.multi.control;

//요일 (1988/5/1)  나이,띠,요일
//(올해년도 -생년)+1  나이
//닭,개,돼지,쥐,소,호랑이,토끼,용,뱀,말,양,원숭이

import java.util.Calendar;

//(year-1)*365+윤달-->1987년까지 일수
//1월부터  month-1까지의 총일수 +일수
public class ControlEx3 {
    public int getAge(int year) {
        return ((Calendar.getInstance().get(Calendar.YEAR)) - year) + 1;
    }

    public String getzodiacSign(int year) {//띠
        switch (year % 12) {
            case 0:
                return "원숭이";
            case 1:
                return "닭";
            case 2:
                return "개";
            case 3:
                return "돼지";
            case 4:
                return "쥐";
            case 5:
                return "소";
            case 6:
                return "호랑이";
            case 7:
                return "토끼";
            case 8:
                return "용";
            case 9:
                return "뱀";
            case 10:
                return "말";
            default:
                return "양";
        }

    }

    //윤달하는 함수
    public boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public int getCountDay(int year, int month, int day) {
        int countDay = 0;
        countDay = (year - 1) * 365;
        for (int i = 1; i < year; i++) {//서기1년부터 태어난 년도 전까기....윤달체크
            countDay = leapYear(i) ? ++countDay : countDay;
        }
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    countDay += 31;
                    break;
                case 2:
                    if (leapYear(year)) {
                        countDay += 29;
                    } else {
                        countDay += 28;
                    }
                    break;
                default://30일 인 달
                    countDay += 30;

            }//switch
        }//for
        countDay += day;
        return countDay;
    }//method

    public String getWeek(int year, int month, int day) {
        int cnt = getCountDay(year, month, day);
        switch (cnt % 7) {
            case 0:
                return "일요일";
            case 1:
                return "월요일";
            case 2:
                return "화요일";
            case 3:
                return "수요일";
            case 4:
                return "목요일";
            case 5:
                return "금요일";
            case 6:
                return "토요일";
        }
        return "";
    }

    public void input(int year, int month, int day) {
        int age = getAge(year);
        String zodiacSign = getzodiacSign(year);
        String week = getWeek(year, month, day);
        output(age, zodiacSign, week);
    }

    public void output(int age, String zodiacSign, String week) {
        System.out.println("당신은 " + age + "살이고 " + zodiacSign + "띠이고 " + week + "에 태어남");

    }

    public static void main(String[] args) {
        ControlEx3 c = new ControlEx3();
        c.input(2003, 5, 26);


    }

}
