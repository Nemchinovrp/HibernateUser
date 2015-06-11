package DAO;
import model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by roman on 11.06.15.
 */
public interface UserDAO {

        public void addUser(User user) throws SQLException;
        public void updateUser(User user) throws SQLException;
        public User getUserByID(Long id) throws SQLException;
        public List getAllUsers() throws SQLException;
        public void deleteUser(User user) throws SQLException;


}
