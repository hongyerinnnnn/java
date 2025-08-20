package com.multi.travel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private final String driverName = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/travel_db?serverTimezone=UTC";
    private final String user = "root";     // 👉 본인 계정
    private final String pass = "1234";     // 👉 본인 비밀번호

    // 싱글턴 인스턴스
    private static DBUtil instance = new DBUtil();

    // 생성자에서 드라이버 로딩
    private DBUtil() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 인스턴스 반환
    public static DBUtil getInstance() {
        return instance;
    }

    // 커넥션 반환
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

    // 자원 해제
    public void close(AutoCloseable... closeables) {
        for (AutoCloseable c : closeables) {
            if (c != null) {
                try {
                    c.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
