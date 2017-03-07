package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by tolly on 3/7/2017.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_pass")
    private String userPass;

    /**
     * Empty Constructor
     */
    public User() {

    }

    /**
     * Constructor for creating a user
     * @param userName
     * @param userPass
     */
    public User(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }

    /**
     * userName Getter
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * userName Setter
     * @param userName the new userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * userPass Getter
     * @return the userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * userPass Setter
     * @param userPass the new userPass
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
