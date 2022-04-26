package service;

import dao.PhongDao;
import java.sql.SQLException;
import java.util.List;
import model.Phong;

public class PhongService {

    PhongDao phongDao = null;

    public PhongService() {
        phongDao = new PhongDao();
    }

    public List<Phong> getAllPhong() throws SQLException {
        return phongDao.getAllPhong();
    }

    public List<Phong> getPhongByName(String tenPhong) throws SQLException {
        return phongDao.getPhongByName(tenPhong);
    }
    
    public Phong getPhongById(String id) throws SQLException {
        return phongDao.getPhongById(id);
    }
    
    public int editPhong(Phong phong) throws SQLException {
        return phongDao.editPhong(phong);
    }
}
