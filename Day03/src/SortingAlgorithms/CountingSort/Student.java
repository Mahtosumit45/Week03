package SortingAlgorithms.CountingSort;

public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

