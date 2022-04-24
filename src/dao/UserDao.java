package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.NguoiDung;

public class UserDao {

    public NguoiDung login(String username, String password) throws SQLException {
        NguoiDung user = new NguoiDung();
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM nguoi_dung where tai_khoan = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, username);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            user.setTaiKhoan(username);
            if (rs.getString("mat_khau").equals(password)) {
                user.setTenND(rs.getString("tenND"));
            } else {
                user.setTaiKhoan(null);
            }
        } else {
            return null;
        }
        return user;
    }

    public int testPassword(String username, String pOld) throws SQLException {
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM nguoi_dung where tai_khoan = ? and mat_khau = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, username);
        pstm.setString(2, pOld);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int editPassword(String username, String pOld, String pNew, String pConf) throws SQLException {
        if (testPassword(username, pOld) == 1) {
            if(pNew.equals(pConf)) {
                Connection con = Connect.getJDBCConnection();
                String sql = "UPDATE nguoi_dung SET mat_khau = ? WHERE tai_khoan = ?";
                PreparedStatement pstm = con.prepareStatement(sql);
                pstm.setString(1, pNew);
                pstm.setString(2, username);
                int rs = pstm.executeUpdate();
                return rs;
            } else {
                return 2;
            }                
        }
        return 0;
    }
}
