package model;

import java.util.ArrayList;
import java.util.List;

// Everything is documented by Asad Murad

public class User {
    private int id;
    private String userName;
    private String email;
    private String password;
    private List<Task> tasks;


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


// This adds a task to the users task list
    public void addTask(Task task) {
        this.tasks.add(task);
    }


// This removes a task from the users task list
    public boolean removeTask(Task task) {
        return this.tasks.remove(task);
    }

// This finds the task by ID
    public Task getTaskByID(int id) {
        for (Task task : tasks ) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", tasksCount=" + tasks.size() +
                '}';
    }


//    This is for the equals method checking if objects are equal
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

//    This checks the hascode for the object
    @Override
    public int hashCode(){
        return Integer.hashCode(id);
    }























}




