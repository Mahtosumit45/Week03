package DoublyLinkedList.FunctionalityforTextEditor;

public class TextEditor {
    private Node head, tail, current;
    private int historySize;
    private int size;

    public TextEditor(int maxHistory) {
        this.head = this.tail = this.current = null;
        this.historySize = maxHistory;
        this.size = 0;
    }

    // Add a new state at the end
    public void addState(String newText) {
        Node newNode = new Node(newText);

        if (size == 0) {
            // First state
            head = tail = current = newNode;
        } else {
            // Add the new state at the end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = tail;
        }

        size++;

        // Maintain history size
        if (size > historySize) {
            removeOldestState();
        }
    }

    // Remove the oldest state to maintain the history size
    private void removeOldestState() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    // Undo functionality: move to the previous state
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("No more actions to undo.");
        }
    }

    // Redo functionality: move to the next state
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("No more actions to redo.");
        }
    }

    // Display the current state
    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.text);
        } else {
            System.out.println("No state available.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5);

        // Simulate user actions
        editor.addState("State 1");
        editor.addState("State 2");
        editor.addState("State 3");
        editor.addState("State 4");
        editor.addState("State 5");

        // Display current state
        editor.displayCurrentState();

        // Undo functionality
        editor.undo();
        editor.undo();

        // Redo functionality
        editor.redo();
        editor.redo();

        // Add more states
        editor.addState("State 6");
        editor.addState("State 7");

        // Display the current state after changes
        editor.displayCurrentState();
    }
}

