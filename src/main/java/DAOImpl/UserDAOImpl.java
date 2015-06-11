package DAOImpl;

import DAO.UserDAO;
import Util.HibernateUtil;
import model.User;
import org.hibernate.Session;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by roman on 11.06.15.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) throws SQLException {
        Session session=null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
        }
        finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public void updateUser(User user) throws SQLException {
        Session session=null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O",JOptionPane.OK_OPTION);
        }
        finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public User getUserByID(Long id) throws SQLException {
        Session session=null;
        User user=null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            user = (User) session.load(User.class, id);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O",JOptionPane.OK_OPTION);
        }
        finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        Session session=null;
        List<User> users = new ArrayList<User>();
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            users = session.createCriteria(User.class).list();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O",JOptionPane.OK_OPTION);
        }
        finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
        return users;
    }

    @Override
    public void deleteUser(User user) throws SQLException {

        Session session=null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(user);
            session.getTransaction().commit();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O",JOptionPane.OK_OPTION);
        }
        finally {
            if(session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
