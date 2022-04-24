package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.LopHocPhan;

public class LHPDao {

    public List<LopHocPhan> getAllLHP() throws SQLException {
        List<LopHocPhan> lhps = new ArrayList<LopHocPhan>();
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM lop_hoc_phan";
        PreparedStatement pstm = con.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            LopHocPhan lhp = new LopHocPhan();
            lhp.setMaLHP(rs.getString("ma_lhp"));
            lhp.setSoLuongSV(rs.getInt("so_luong_sv"));
            lhp.setHocKi(rs.getInt("hoc_ki"));
            lhps.add(lhp);
        }
        return lhps;
    }

    public LopHocPhan getLHPByName(String tenLHP) throws SQLException {
        Connection con = Connect.getJDBCConnection();
        String sql = "SELECT * FROM lop_hoc_phan where ten_phong like '%" + tenLHP + "%'";
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        rs.next();
        LopHocPhan lhp = new LopHocPhan();
        lhp.setMaLHP(rs.getString("ma_lhp"));
        lhp.setSoLuongSV(rs.getInt("so_luong_sv"));
        lhp.setHocKi(rs.getInt("hoc_ki"));
        return lhp;
    }
}
