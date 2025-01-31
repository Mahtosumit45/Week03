package SortingAlgorithms.SelectionSort;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of students with their names and exam scores
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 88));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 65));
        students.add(new Student("Eve", 80));
        students.add(new Student("Frank", 95));
        students.add(new Student("Grace", 70));

        // Sort the students by their exam scores using Selection Sort
        SelectionSort.sort(students);

        // Print the sorted list of students
        System.out.println("Sorted Exam Scores:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

