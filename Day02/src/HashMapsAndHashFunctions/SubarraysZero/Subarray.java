package HashMapsAndHashFunctions.SubarraysZero;

import java.util.*;

class Subarray {
    int start, end;

    public Subarray(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Subarray from index " + start + " to " + end;
    }
}
