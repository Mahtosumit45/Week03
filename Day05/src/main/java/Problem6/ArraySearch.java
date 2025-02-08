package Problem6;

import java.util.Arrays;

class ArraySearch {
    private int[] array;

    public ArraySearch(int[] array) {
        this.array = array;
    }

    public boolean search(int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
