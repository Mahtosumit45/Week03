package CircularLinkedList.TaskScheduler;

public class TaskScheduler {
    public static void main(String[] args) {
        CircularTaskList scheduler = new CircularTaskList();
        scheduler.addTaskAtEnd(1, "Task A", 1, "2024-02-01");
        scheduler.addTaskAtEnd(2, "Task B", 2, "2024-02-05");
        scheduler.addTaskAtBeginning(3, "Task C", 1, "2024-01-30");
        scheduler.addTaskAtPosition(4, "Task D", 3, "2024-02-10", 2);

        scheduler.displayTasks();
        scheduler.viewCurrentTask();
        scheduler.displayTasks();
        scheduler.searchTaskByPriority(1);
        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}
