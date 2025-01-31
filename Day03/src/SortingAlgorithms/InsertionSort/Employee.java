package SortingAlgorithms.InsertionSort;

import java.util.Scanner;

class Employee {
    private int[] employeeIds;

    public Employee(int n) {
        employeeIds = new int[n];
    }

    public void setEmployeeIds(Scanner scanner) {
        System.out.println("Enter Employee IDs: ");
        for (int i = 0; i < employeeIds.length; i++) {
            employeeIds[i] = scanner.nextInt();
        }
    }

    public int[] getEmployeeIds() {
        return employeeIds;
    }
}
