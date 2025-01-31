package SortingAlgorithms.InsertionSort;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        Employee employee = new Employee(n);
        employee.setEmployeeIds(scanner);
        scanner.close();

        InsertionSort.sort(employee.getEmployeeIds());
        System.out.print("Sorted Employee IDs: ");
        for (int id : employee.getEmployeeIds()) {
            System.out.print(id + " ");
        }
    }
}