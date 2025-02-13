package service;

import model.Task; // This is the mode.Task class
import java.time.LocalDate; // This is for the Local Date
import java.util.ArrayList; // This is for Array List
import java.util.List; // This is for List

public class TaskService {
    private List<Task> tasks; // Stores all the tasks

//    This is the contructor
    public TaskService() {
        this.tasks = new ArrayList<>();
    }

//    This adds a task
    public void addTask(Task task) {
        tasks.add(task);
    }

//    This gets all the task
    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id){
                return task;

            }
        }
        return null; // The task is not found
    }


//    This is to update tasks
    public boolean updateTasks(int id, String title, String description, LocalDate duedate, Task.Priority priority, Task.Status status) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setTitle(title);
            task.setDesription(description);
            task.setDueDate(duedate);
            task.setPriority(priority);
            task.setStatus(status);
            return true;
        }
        return false;
    }


    public boolean removeTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }






}
