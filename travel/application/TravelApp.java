package com.multi.travel.application;
import com.multi.travel.model.dao.TravelVO;
import com.multi.travel.model.service.TravelService;

import java.util.List;
import java.util.Scanner;

public class TravelApp {
    public static void main(String[] args) {
        TravelService service = new TravelService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== TravelApp Menu ===");
            System.out.println("1. 전체 목록 보기");
            System.out.println("2. 권역별 관광지 보기");
            System.out.println("3. 검색하기");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("페이지 번호: ");
                int page = sc.nextInt();
                List<TravelVO> list = service.getAll(page, 10);
                list.forEach(System.out::println);
            } else if (menu == 2) {
                System.out.print("권역 입력: ");
                String district = sc.nextLine();
                List<TravelVO> list = service.getByDistrict(district);
                list.forEach(System.out::println);
            } else if (menu == 3) {
                System.out.print("검색어 입력: ");
                String keyword = sc.nextLine();
                List<TravelVO> list = service.search(keyword);
                list.forEach(System.out::println);
            } else if (menu == 0) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
}
