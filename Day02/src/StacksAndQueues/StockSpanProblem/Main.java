package StacksAndQueues.StockSpanProblem;
import StacksAndQueues.Stack;
public class Main {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        Span span = new Span();
        int[] spancalculate = span.calculateSpan(prices);
        System.out.println("Stock span");
        for (int s : spancalculate){
            System.out.println(s + " ");
        }
    }
}
