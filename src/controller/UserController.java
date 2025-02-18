package controller;

import model.User;
import model.Task;
import service.UserService;
import java.util.List;

public class UserController {

    private UserService userService;

    //    This is the constuctor
    public UserController() {
        this.userService = new UserService(); // This is a userService object
    }


    //    This adds a user
    public void addUser(int id, String name, String email, String password) {
        User newUser = new User(id, name, email, password);
        userService.addUser(newUser);
        System.out.println("User added sucessfully " + newUser);

    }


    //    Gets all the users
    public void getAllUsers() {
        List<User> user = userService.getAllUsers();
        if (user.isEmpty()) {
            System.out.println("No users found");
        } else {
            for (User user1 : user) {
                System.out.println(user1);
            }
        }
    }


    //    This is to find the user by ID
    public void finderUserById(int id) {
        User user = userService.findUserById(id);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("No user found");
        }
    }

    //    This is for removing a user by ID
    public void removeUser(int id) {
        boolean sucess = userService.removeUser(id);
        if (sucess) {
            System.out.println("User removed successfully");
        } else
            System.out.println("No user found");
    }

    //    This is the to assign a task to users
    public void assginTaskToUser(int userId, Task task) {
        boolean sucess = userService.assignTaskToUser(userId, task);
        if (sucess) {
            System.out.println("Task assigned successfully");
        } else {
            System.out.println("No user found");
        }

    }


    //    Get all the user tasks
    public void getUserTasks(int userId) {
        List<Task> tasks = userService.getUserTasks(userId);
        if (tasks.isEmpty()) {
            System.out.println("No tasks found");
        } else {
            for (Task task1 : tasks) {
                System.out.println(task1);
            }
        }
    }
}