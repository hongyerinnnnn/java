package com.multi.travel.model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TravelDao {
    private final String url = "jdbc:mysql://localhost:3306/travel_db";
    private final String user = "root";   // 👉 본인 DB ID
    private final String password = "1234"; // 👉 본인 DB PW

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // INSERT
    public void insert(TravelVO vo) {
        String sql = "INSERT INTO travel(district, title, description, address, phone) VALUES(?,?,?,?,?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, vo.getDistrict());
            ps.setString(2, vo.getTitle());
            ps.setString(3, vo.getDescription());
            ps.setString(4, vo.getAddress());
            ps.setString(5, vo.getPhone());
            ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }

    // 전체 목록
    public List<TravelVO> findAll(int page, int pageSize) {
        List<TravelVO> list = new ArrayList<>();
        String sql = "SELECT * FROM travel LIMIT ?, ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, (page - 1) * pageSize);
            ps.setInt(2, pageSize);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TravelVO vo = new TravelVO();
                vo.setNo(rs.getInt("no"));
                vo.setDistrict(rs.getString("district"));
                vo.setTitle(rs.getString("title"));
                vo.setDescription(rs.getString("description"));
                vo.setAddress(rs.getString("address"));
                vo.setPhone(rs.getString("phone"));
                list.add(vo);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    // 권역별 검색
    public List<TravelVO> findByDistrict(String district) {
        List<TravelVO> list = new ArrayList<>();
        String sql = "SELECT * FROM travel WHERE district=?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, district);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TravelVO vo = new TravelVO();
                vo.setNo(rs.getInt("no"));
                vo.setDistrict(rs.getString("district"));
                vo.setTitle(rs.getString("title"));
                vo.setDescription(rs.getString("description"));
                vo.setAddress(rs.getString("address"));
                vo.setPhone(rs.getString("phone"));
                list.add(vo);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    // 제목/내용 검색
    public List<TravelVO> search(String keyword) {
        List<TravelVO> list = new ArrayList<>();
        String sql = "SELECT * FROM travel WHERE title LIKE ? OR description LIKE ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TravelVO vo = new TravelVO();
                vo.setNo(rs.getInt("no"));
                vo.setDistrict(rs.getString("district"));
                vo.setTitle(rs.getString("title"));
                vo.setDescription(rs.getString("description"));
                vo.setAddress(rs.getString("address"));
                vo.setPhone(rs.getString("phone"));
                list.add(vo);
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }
}
