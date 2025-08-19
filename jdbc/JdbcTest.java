package com.multi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spring";
        String user = "root";
        String password = "1234";
        try {
            //Driver를 가져오는 부분
            Class.forName("com.mysql.jdbc.Driver");
            //연결객체 (java+Database)
            Connection con = DriverManager.getConnection(url, user, password);
            // 운반객체
            Statement stmt = con.createStatement();
            //결과집합입니다
            ResultSet rs = stmt.executeQuery("SELECT empno ,ename FROM emp");
            while (rs.next()) {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));

            }
            //메모리에서 지워진다
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();

        }


    }
}
