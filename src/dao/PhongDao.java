package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Phong;

public class PhongDao {

    public List<Phong> getAllPhong() throws SQLException {
        List<Phong> phongs = new ArrayList<Phong>();
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM phong";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Phong phong = new Phong();
            phong.setTenPhong(rs.getString("ten_phong"));
            phong.setSoChoNgoi(rs.getInt("so_cho_ngoi"));
            phong.setKhu(rs.getString("khu"));
            phong.setTang(rs.getInt("tang"));
            phong.setTrangThai(rs.getInt("trang_thai"));
            phongs.add(phong);
        }
        return phongs;
    }

    public List<Phong> getPhongByName(String tenPhong) throws SQLException {
        List<Phong> phongs = new ArrayList<Phong>();
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM phong where ten_phong like '%" + tenPhong + "%'";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Phong phong = new Phong();
            phong.setTenPhong(rs.getString("ten_phong"));
            phong.setSoChoNgoi(rs.getInt("so_cho_ngoi"));
            phong.setKhu(rs.getString("khu"));
            phong.setTang(rs.getInt("tang"));
            phong.setTrangThai(rs.getInt("trang_thai"));
            phongs.add(phong);
        }
        return phongs;
    }

    public Phong getPhongById(String id) throws SQLException {
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM phong where ten_phong = '" + id + "'";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        Phong phong = new Phong();
        phong.setTenPhong(rs.getString("ten_phong"));
        phong.setSoChoNgoi(rs.getInt("so_cho_ngoi"));
        phong.setKhu(rs.getString("khu"));
        phong.setTang(rs.getInt("tang"));
        phong.setTrangThai(rs.getInt("trang_thai"));
        return phong;
    }
    
    public int editPhong(Phong phong) throws SQLException {
        Connection con = Connect.getJDBCConnection();
        String sql = "UPDATE phong SET so_cho_ngoi = ?, khu = ?, tang = ?, trang_thai = ? where ten_phong = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setInt(1, phong.getSoChoNgoi());
        pstm.setString(2, phong.getKhu());
        pstm.setInt(3, phong.getTang());
        pstm.setInt(4, phong.getTrangThai());
        pstm.setString(5, phong.getTenPhong());
        int rs = pstm.executeUpdate();        
        return rs;
    }
}
