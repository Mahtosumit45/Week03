package SortingAlgorithms.CountingSort;

public class Main {
    public static void main(String[] args) {
        // Create an array of students with their names and ages
        Student[] students = new Student[5];
        students[0] = new Student("Alice", 15);
        students[1] = new Student("Bob", 12);
        students[2] = new Student("Charlie", 10);
        students[3] = new Student("David", 17);
        students[4] = new Student("Eve", 13);

        // Sort the students by their age using Counting Sort
        CountingSort.sort(students);

        // Print the sorted list of students
        System.out.println("Sorted Students by Age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

