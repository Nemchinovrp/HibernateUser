package DAO;

import DAOImpl.UserDAOImpl;

/**
 * Created by roman on 11.06.15.
 */
public class Factory {
    private static UserDAO userDAO=null;
    private static Factory instance=null;

    public static synchronized Factory getInstance(){
        if(instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public UserDAO getUserDAO(){
        if(userDAO==null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }
}
