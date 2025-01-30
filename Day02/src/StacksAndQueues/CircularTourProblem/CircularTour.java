package StacksAndQueues.CircularTourProblem;

class CircularTour {

    // Function to find the starting petrol pump index
    public int findStartingPoint(int[] petrol, int[] distance) {
        int n = petrol.length;
        int total_surplus = 0, current_surplus = 0, start_index = 0;

        for (int i = 0; i < n; i++) {
            int surplus = petrol[i] - distance[i];
            total_surplus += surplus;
            current_surplus += surplus;

            // If surplus goes negative, reset start position
            if (current_surplus < 0) {
                start_index = i + 1; // Move start to the next pump
                current_surplus = 0; // Reset current surplus
            }
        }

        // If total surplus petrol is negative, no solution exists
        return (total_surplus >= 0) ? start_index : -1;
    }
}
