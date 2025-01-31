package SortingAlgorithms.MergeSort;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        Bookstore bookstore = new Bookstore(n);
        bookstore.setBookPrices(scanner);
        scanner.close();

        MergeSort.sort(bookstore.getBookPrices(), 0, n - 1);
        System.out.print("Sorted Book Prices: ");
        for (double price : bookstore.getBookPrices()) {
            System.out.print(price + " ");
        }
    }
}