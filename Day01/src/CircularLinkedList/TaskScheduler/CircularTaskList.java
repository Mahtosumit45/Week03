package CircularLinkedList.TaskScheduler;

class CircularTaskList {
    private Task head = null;
    private Task tail = null;

    public void addTaskAtBeginning(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head;
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtEnd(int taskID, String taskName, int priority, String dueDate) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (head == null) {
            head = newTask;
            tail = newTask;
            tail.next = head;
        } else {
            tail.next = newTask;
            tail = newTask;
            tail.next = head;
        }
    }

    public void addTaskAtPosition(int taskID, String taskName, int priority, String dueDate, int position) {
        Task newTask = new Task(taskID, taskName, priority, dueDate);
        if (position == 1 || head == null) {
            addTaskAtBeginning(taskID, taskName, priority, dueDate);
            return;
        }
        Task current = head;
        int count = 1;
        while (count < position - 1 && current.next != head) {
            current = current.next;
            count++;
        }
        newTask.next = current.next;
        current.next = newTask;
        if (current == tail) tail = newTask;
    }

    public void removeTask(int taskID) {
        if (head == null) return;
        Task current = head, prev = tail;
        do {
            if (current.taskID == taskID) {
                if (current == head) head = head.next;
                if (current == tail) tail = prev;
                prev.next = current.next;
                if (head == tail && head.taskID == taskID) head = tail = null;
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void viewCurrentTask() {
        if (head != null) {
            System.out.println("Current Task: [ID:" + head.taskID + "|Name:" + head.taskName + "|Priority:" + head.priority + "|Due:" + head.dueDate + "]");
            head = head.next;
        } else {
            System.out.println("No tasks available.");
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks in the queue.");
            return;
        }
        Task temp = head;
        System.out.print("Tasks: ");
        do {
            System.out.print("[ID:" + temp.taskID + "|Name:" + temp.taskName + "|Priority:" + temp.priority + "|Due:" + temp.dueDate + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public void searchTaskByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Task temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                System.out.println("Found Task: [ID:" + temp.taskID + "|Name:" + temp.taskName + "|Priority:" + temp.priority + "|Due:" + temp.dueDate + "]");
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks with priority " + priority);
    }
}
