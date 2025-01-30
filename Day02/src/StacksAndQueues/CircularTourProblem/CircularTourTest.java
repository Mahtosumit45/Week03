package StacksAndQueues.CircularTourProblem;

public class CircularTourTest {
    public static void main(String[] args) {
        CircularTour ct = new CircularTour();

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        // Expected Output: 1 (Starting from second petrol pump)

        int startPoint = ct.findStartingPoint(petrol, distance);

        if (startPoint != -1) {
            System.out.println("The circular tour can start at petrol pump index: " + startPoint);
        } else {
            System.out.println("No valid circular tour possible.");
        }
    }
}
