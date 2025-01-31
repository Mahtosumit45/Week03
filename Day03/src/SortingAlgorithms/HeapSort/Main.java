package SortingAlgorithms.HeapSort;

public class Main {
    public static void main(String[] args) {
        // Create an array of job applicants with their names and expected salaries
        JobApplicant[] applicants = new JobApplicant[5];
        applicants[0] = new JobApplicant("Alice", 70000);
        applicants[1] = new JobApplicant("Bob", 50000);
        applicants[2] = new JobApplicant("Charlie", 90000);
        applicants[3] = new JobApplicant("David", 60000);
        applicants[4] = new JobApplicant("Eve", 80000);

        // Sort the applicants by their expected salary demands using Heap Sort
        HeapSort.sort(applicants);

        // Print the sorted list of job applicants
        System.out.println("Sorted Job Applicants by Salary:");
        for (JobApplicant applicant : applicants) {
            System.out.println(applicant);
        }
    }
}

