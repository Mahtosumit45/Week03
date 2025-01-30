package HashMapsAndHashFunctions.TwoSumProblem;

import java.util.HashMap;
import java.util.Map;

// Class to store the pair of indices
class Pair {
    int index1, index2;

    public Pair(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    @Override
    public String toString() {
        return "Indices: [" + index1 + ", " + index2 + "]";
    }
}
