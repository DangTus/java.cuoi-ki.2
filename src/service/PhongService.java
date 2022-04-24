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

    public Phong getPhongByName(String tenPhong) throws SQLException {
        return phongDao.getPhongByName(tenPhong);
    }
}
