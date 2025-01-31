package SortingAlgorithms.QuickSort;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();
        ECommerce ecommerce = new ECommerce(n);
        ecommerce.setProductPrices(scanner);
        scanner.close();

        QuickSort.sort(ecommerce.getProductPrices(), 0, n - 1);
        System.out.print("Sorted Product Prices: ");
        for (double price : ecommerce.getProductPrices()) {
            System.out.print(price + " ");
        }
    }
}
