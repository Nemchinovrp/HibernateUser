package main;

import DAO.Factory;
import model.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by roman on 11.06.15.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User();
        u1.setName("Zina");
        u1.setPassword("123456");
        User u2 = new User();
        u2.setName("Zoya");
        u2.setPassword("123499");



       // Factory.getInstance().getUserDAO().addUser(u1);
      //  Factory.getInstance().getUserDAO().addUser(u2);

        System.out.println("---------------------------");
        List<User> users = Factory.getInstance().getUserDAO().getAllUsers();
        for(int i=0; i < users.size(); ++i){
            System.out.println("Имя - " + users.get(i).getName() +"  Пароль - "+ users.get(i).getPassword());
        }
        System.out.println("---------------------------");
    }
}
