package SortingAlgorithms.BubbleSort;

class Main {
    public static void main(String[] args) {
        int[] studentMarksArray = {78, 92, 45, 88, 67, 99, 54, 81};
        StudentMarks studentMarks = new StudentMarks(studentMarksArray);
        BubbleSort sorter = new BubbleSort();
        sorter.sort(studentMarks.getMarks());

        System.out.print("Sorted Marks: ");
        for (int mark : studentMarks.getMarks()) {
            System.out.print(mark + " ");
        }
    }
}

