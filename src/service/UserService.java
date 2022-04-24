package service;

import dao.UserDao;
import java.sql.SQLException;
import model.NguoiDung;

public class UserService {
    UserDao userDao = null;

    public UserService() {
        userDao = new UserDao();
    }
    
    public NguoiDung login(String username, String password) throws SQLException {
        return userDao.login(username, password);
    }
}
