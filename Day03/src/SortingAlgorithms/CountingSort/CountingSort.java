package SortingAlgorithms.CountingSort;

public class CountingSort {

    // Method to perform Counting Sort based on student age
    public static void sort(Student[] students) {
        int n = students.length;
        int maxAge = 18; // maximum age
        int minAge = 10; // minimum age

        // Step 1: Create a count array for ages 10 to 18
        int[] count = new int[maxAge - minAge + 1];

        // Step 2: Count the frequency of each age
        for (int i = 0; i < n; i++) {
            count[students[i].getAge() - minAge]++;
        }

        // Step 3: Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Place students in their correct positions in the output array
        Student[] output = new Student[n];
        for (int i = n - 1; i >= 0; i--) {
            int age = students[i].getAge();
            int position = count[age - minAge] - 1;
            output[position] = students[i];
            count[age - minAge]--;
        }

        // Step 5: Copy the sorted students back to the original array
        System.arraycopy(output, 0, students, 0, n);
    }
}

