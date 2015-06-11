package Util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by roman on 11.06.15.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try{
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch(Exception e){
            e.printStackTrace();
        }

    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
