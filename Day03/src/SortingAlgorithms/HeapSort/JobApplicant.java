package SortingAlgorithms.HeapSort;

public class JobApplicant {
    private String name;
    private int salary;

    // Constructor
    public JobApplicant(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}

