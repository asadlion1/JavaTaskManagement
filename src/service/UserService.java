package service;

import model.User;
import model.Task;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users;


//    This is the contructor
    public UserService() {
        this.users = new ArrayList<>();
    }



//    This method adds new users the the system
    public void addUser(User user) {
        users.add(user);
    }

//    This method returns all the users
    public List<User> getAllUsers() {
        return users;
    }


//    This searches for the user by their ID
    public User findUserById(int id) {
        for (User user: users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

//    This removes a user by their id
    public boolean removeUser(int id){
        return users.removeIf(user -> user.getId() == id);
    }

//    This assigns a task to the User
    public boolean assignTaskToUser(int id, Task task) {
        User user = findUserById(id);
        if (user != null) {
            user.addTask(task);
            return true;
        }
        return false;
    }

//    This gets all the tasks assigned to the user
    public List<Task> getUserTasks(int userId) {
        User user = findUserById(userId);
        return (user != null) ? user.getTask() : new ArrayList<>();

    }




}

