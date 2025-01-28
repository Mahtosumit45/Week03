package CircularLinkedList.TaskScheduler;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    // Constructor for creating a new task
    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

