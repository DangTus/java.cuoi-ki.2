package service;

import dao.LHPDao;
import java.sql.SQLException;
import java.util.List;
import model.LopHocPhan;

public class LHPService {

    LHPDao lhpDao = new LHPDao();

    public LHPService() {
        lhpDao = new LHPDao();
    }

    public List<LopHocPhan> getAllLHP() throws SQLException {
        return lhpDao.getAllLHP();
    }

    public LopHocPhan getLHPByName(String tenLHP) throws SQLException {
        return lhpDao.getLHPByName(tenLHP);
    }
}
