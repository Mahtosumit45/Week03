package SinglyLinkedList.StudentRecordManagement;

public class StudentManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.addAtEnd(1, "Alice", 20, 'A');
        list.addAtBeginning(2, "Bob", 21, 'B');
        list.addAtPosition(2, 3, "Charlie", 22, 'C');

        // Displaying all students
        System.out.println("All Students:");
        list.displayAll();

        // Searching for a student
        list.searchByRollNumber(2);

        // Updating a student's grade
        list.updateGrade(3, 'A');

        // Deleting a student
        list.deleteByRollNumber(1);

        // Displaying all students after deletion
        System.out.println("All Students after deletion:");
        list.displayAll();
    }
}
