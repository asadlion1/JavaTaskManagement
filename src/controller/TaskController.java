package controller;

import model.Task;
import service.TaskService;
import java.time.LocalDate;
import java.util.List;

public class TaskController {
    private TaskService taskService;


//    This is the Contructor
    public TaskController(){
        this.taskService = new TaskService();
    }

//    This is to add task based on the user input
    public void addTask(int id, String title, String description, LocalDate createdDate, LocalDate dueDate, Task.Priority priority, Task.Status status){
        Task newTask = new Task(id, title, description, createdDate, dueDate, priority, status);
        taskService.addTask(newTask);

    }


//    This is to get all the Tasks
    public void getAllTask(){
        List<Task> tasks = taskService.getAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks availble");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }



//    This is to find the task by id
    public void findTaskById(int id) {
        Task task = taskService.findTaskById(id);
        if (task == null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found");
        }
    }


//    This method is to update the task
    public void updateTask(int id, String title, String description, LocalDate dueDate, Task.Priority priority, Task.Status status){
        boolean sucess = taskService.updateTasks(id, title, description, dueDate, priority, status);
        if (sucess) {
            System.out.println("Task updated successfully");
        } else {
            System.out.println("Task update failed");
        }
    }

//    This is to delete tasks
    public void deleteTask(int id){
        boolean sucesss = taskService.removeTask(id);
        if (sucesss) {
            System.out.println("Task deleted successfully");
        } else {
            System.out.println("Task delete failed");
        }
    }









}
