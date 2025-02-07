package Problem1;

import java.util.Arrays;
import java.util.Random;

class DataGenerator {
    public static int[] generateData(int size) {
        Random rand = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = rand.nextInt(size * 10);
        }
        return data;
    }
}
