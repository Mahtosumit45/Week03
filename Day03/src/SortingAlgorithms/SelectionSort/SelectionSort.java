package SortingAlgorithms.SelectionSort;

import java.util.List;

public class SelectionSort {
    public static void sort(List<Student> students) {
        int n = students.size();

        // Loop over the list
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            // Find the student with the minimum score from the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getScore() < students.get(minIndex).getScore()) {
                    minIndex = j;
                }
            }

            // Swap the student at the current position with the minimum student
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }
}

