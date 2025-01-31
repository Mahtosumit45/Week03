package SortingAlgorithms.MergeSort;

import java.util.Scanner;

class Bookstore {
    private double[] bookPrices;

    public Bookstore(int n) {
        bookPrices = new double[n];
    }

    public void setBookPrices(Scanner scanner) {
        System.out.println("Enter book prices: ");
        for (int i = 0; i < bookPrices.length; i++) {
            bookPrices[i] = scanner.nextDouble();
        }
    }

    public double[] getBookPrices() {
        return bookPrices;
    }
}
