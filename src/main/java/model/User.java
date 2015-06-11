package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by roman on 11.06.15.
 */

@Entity
@Table(name="user")
public class User {
    private int id;
    private String name;
    private String password;


    public User() {
        name = null;
    }

    public User(User u){
        name = u.getName();
    }


    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public int getId() {
        return id;
    }
    @Column(name="name")
    public String getName() {
        return name;
    }
    @Column(name="password")
    public String getPassword() {
        return password;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
