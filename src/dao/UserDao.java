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
            
            if(rs.getString("mat_khau").equals(password)) {                
                user.setMatKhau(password);
            } else {
                user.setMatKhau("");
            }
            
        } else {
            return null;
        }
        return user;
    }
}
