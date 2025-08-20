package com.multi.board.model.dao;

import com.multi.board.model.bean.BoardDto;
import com.multi.board.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDaoImpl implements BoardDao {
    private static BoardDao boardDao = new BoardDaoImpl();

    public static BoardDao getBoardDao() {
        return boardDao;
    }

    @Override
    public void registerArticle(BoardDto boardDto) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DBUtil.getInstance().getConnection();
            con.setAutoCommit(false);
            String sql = "INSERT INTO board (subject, content, user_id) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, boardDto.getSubject());
            pstmt.setString(2, boardDto.getContent());
            pstmt.setString(3, boardDto.getUserId());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insert Success!");
                con.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
            try { con.rollback(); } catch (Exception ex) { ex.printStackTrace(); }
        } finally {
            DBUtil.getInstance().close(pstmt, con);
        }
    }

    @Override
    public List<BoardDto> searchListAll() {
        List<BoardDto> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DBUtil.getInstance().getConnection();
            String sql = "SELECT article_no, user_id, subject, content, register_time FROM board ORDER BY article_no DESC";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardDto dto = new BoardDto();
                dto.setArticleNo(rs.getInt("article_no"));
                dto.setUserId(rs.getString("user_id"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent(rs.getString("content"));
                dto.setRegisterTime(rs.getString("register_time"));
                list.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.getInstance().close(rs, pstmt, con);
        }
        return list;
    }

    @Override
    public List<BoardDto> searchListBySubject(String subject) {
        List<BoardDto> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DBUtil.getInstance().getConnection();
            String sql = "SELECT article_no, user_id, subject, content, register_time FROM board WHERE subject LIKE ? ORDER BY article_no DESC";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + subject + "%");
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardDto dto = new BoardDto();
                dto.setArticleNo(rs.getInt("article_no"));
                dto.setUserId(rs.getString("user_id"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent(rs.getString("content"));
                dto.setRegisterTime(rs.getString("register_time"));
                list.add(dto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.getInstance().close(rs, pstmt, con);
        }
        return list;
    }

    @Override
    public BoardDto viewArticle(int no) {
        BoardDto dto = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = DBUtil.getInstance().getConnection();
            String sql = "SELECT article_no, user_id, subject, content, register_time FROM board WHERE article_no = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                dto = new BoardDto();
                dto.setArticleNo(rs.getInt("article_no"));
                dto.setUserId(rs.getString("user_id"));
                dto.setSubject(rs.getString("subject"));
                dto.setContent(rs.getString("content"));
                dto.setRegisterTime(rs.getString("register_time"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.getInstance().close(rs, pstmt, con);
        }
        return dto;
    }

    @Override
    public void modifyArticle(BoardDto boardDto) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBUtil.getInstance().getConnection();
            con.setAutoCommit(false);
            String sql = "UPDATE board SET subject = ?, content = ? WHERE article_no = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, boardDto.getSubject());
            pstmt.setString(2, boardDto.getContent());
            pstmt.setInt(3, boardDto.getArticleNo());
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try { con.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
        } finally {
            DBUtil.getInstance().close(pstmt, con);
        }
    }

    @Override
    public void deleteArticle(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DBUtil.getInstance().getConnection();
            con.setAutoCommit(false);
            String sql = "DELETE FROM board WHERE article_no = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, no);
            pstmt.executeUpdate();
            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            try { con.rollback(); } catch (SQLException ex) { ex.printStackTrace(); }
        } finally {
            DBUtil.getInstance().close(pstmt, con);
        }
    }
}
