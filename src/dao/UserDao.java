package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NguoiDung;

public class UserDao {

    public List<NguoiDung> login(String username, String password) throws SQLException {
        List<NguoiDung> users = new ArrayList<NguoiDung>();
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM nguoi_dung where tai_khoan = ?";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, username);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            if(rs.getString("mat_khau").equals(password)) {
                
            }
        } else {
            return null;
        }
    }
}
