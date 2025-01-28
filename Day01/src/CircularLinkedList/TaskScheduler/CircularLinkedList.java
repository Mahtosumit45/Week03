package CircularLinkedList.TaskScheduler;

public class CircularLinkedList {
    private Task head = null;

    // Add a task at the beginning
    public void addTaskAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link to itself
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse to the last task
            }
            temp.next = newTask;
            newTask.next = head; // Circular link
            head = newTask; // Update head to the new task
        }
    }

    // Add a task at the end
    public void addTaskAtEnd(int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            newTask.next = head; // Circular link to itself
        } else {
            Task temp = head;
            while (temp.next != head) {
                temp = temp.next; // Traverse to the last task
            }
            temp.next = newTask;
            newTask.next = head; // Circular link to the head
        }
    }

    // Add a task at a specific position
    public void addTaskAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskId, taskName, priority, dueDate);
        if (position == 1) {
            addTaskAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        Task temp = head;
        int count = 1;
        while (count < position - 1 && temp != null) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        newTask.next = temp.next;
        temp.next = newTask;
    }

    // Remove a task by Task ID
    public void removeTaskById(int taskId) {
        if (head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        Task temp = head;
        Task prev = null;

        // If the task to remove is the head
        if (temp != null && temp.taskId == taskId) {
            if (temp.next == head) { // Only one task
                head = null;
            } else {
                prev = head;
                while (prev.next != head) {
                    prev = prev.next;
                }
                head = head.next;
                prev.next = head;
            }
            return;
        }

        // Traverse the list to find the task with the given Task ID
        while (temp != null && temp.taskId != taskId) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Task with ID " + taskId + " not found.");
            return;
        }

        prev.next = temp.next;
    }

    // View the current task and move to the next task in the circular list
    public void viewNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Display all tasks in the circular list
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        do {
            System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for tasks by priority
    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Task ID: " + temp.taskId + ", Task Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due Date: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority);
        }
    }

    public static void main(String[] args) {
        CircularLinkedList scheduler = new CircularLinkedList();

        // Add some tasks
        scheduler.addTaskAtBeginning(1, "Task 1", 3, "2025-02-10");
        scheduler.addTaskAtEnd(2, "Task 2", 1, "2025-01-30");
        scheduler.addTaskAtEnd(3, "Task 3", 2, "2025-02-01");

        // Display all tasks
        System.out.println("All tasks:");
        scheduler.displayAllTasks();

        // Search for tasks by priority
        System.out.println("\nTasks with priority 1:");
        scheduler.searchTaskByPriority(1);

        // View the current task and move to the next task
        System.out.println("\nViewing next task:");
        scheduler.viewNextTask();

        // Remove a task by Task ID
        scheduler.removeTaskById(2);

        // Display all tasks again
        System.out.println("\nAll tasks after removal:");
        scheduler.displayAllTasks();
    }
}

