package LinearSearch.Problem1;

class NegativeNumberSearcher {
    public static int searchFirstNegative(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}
