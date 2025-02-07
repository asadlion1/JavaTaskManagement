package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private List<Task> tasks;
    public String name;

//    This is the Default Constructor
    public User() {
        this.tasks = new ArrayList<>();

    }

//    Parmeterized Contructor
    public User(int id, String name, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.tasks = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTask() {
        return tasks;
    }




}




