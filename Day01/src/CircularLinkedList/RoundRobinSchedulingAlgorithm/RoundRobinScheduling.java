package CircularLinkedList.RoundRobinSchedulingAlgorithm;
import java.util.Scanner;
public class RoundRobinScheduling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList processQueue = new CircularLinkedList();

        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Process ID, Burst Time, and Priority: ");
            int pid = scanner.nextInt();
            int bt = scanner.nextInt();
            int pr = scanner.nextInt();
            processQueue.addProcess(pid, bt, pr);
        }

        System.out.print("Enter Time Quantum: ");
        int timeQuantum = scanner.nextInt();

        processQueue.roundRobinScheduling(timeQuantum);
        scanner.close();
    }
}