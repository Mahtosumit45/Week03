package SortingAlgorithms.QuickSort;

import java.util.Scanner;

class ECommerce {
    private double[] productPrices;

    public ECommerce(int n) {
        productPrices = new double[n];
    }

    public void setProductPrices(Scanner scanner) {
        System.out.println("Enter product prices: ");
        for (int i = 0; i < productPrices.length; i++) {
            productPrices[i] = scanner.nextDouble();
        }
    }

    public double[] getProductPrices() {
        return productPrices;
    }
}
