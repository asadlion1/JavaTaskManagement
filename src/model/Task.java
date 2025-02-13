package model;

import java.time.LocalDate;

/**
 * @param
 *
 *
 *
 */
public class Task {
    private int id; // Unique Identifier for the Task
    private String title; // Name of the task
    private String description; // This is task details
    private LocalDate createdDate; // This is when the task was created
    private LocalDate dueDate; // This is the due date
    private Priority priority;
    private Status status;


//    These are the enums for priority and status
    public enum Priority{ // This f
        HIGH,
        MEDIUM,
        LOW;
}

    public enum Status{
        PENDING,
        IN_PROGRESS,
        COMPLETED;
}

//     This is the default contructor
    public Task() {
        this.createdDate = LocalDate.now();
    }

    public Task(int id, String title, String description, LocalDate createdDate, LocalDate dueDate, Priority priority, Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
        this.createdDate = LocalDate.now();

    }

//    This is getters and setters

    public int getId() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDesription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }


//    These are the utility methods
    public void markAsDone() {
        this.status = Status.COMPLETED;
    }

    public boolean isOverDue() {
        return dueDate.isBefore(LocalDate.now());
    }

//    This is the toString method

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", status=" + status +
                ", createdDate=" + createdDate +
                '}';
    }

//    This is the equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }


//    This is the hash code method
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }



// I need to learn enums, the utilities methods, the equals, the hashcode method







}
