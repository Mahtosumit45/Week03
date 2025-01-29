package CircularLinkedList.RoundRobinSchedulingAlgorithm;
import java.util.Scanner;
    class CircularLinkedList {
        private Process head = null, tail = null;

        public void addProcess(int processID, int burstTime, int priority) {
            Process newProcess = new Process(processID, burstTime, priority);
            if (head == null) {
                head = newProcess;
                tail = newProcess;
                tail.next = head;
            } else {
                tail.next = newProcess;
                tail = newProcess;
                tail.next = head;
            }
        }

        public void removeProcess(int processID) {
            if (head == null) return;
            Process current = head, prev = tail;
            do {
                if (current.processID == processID) {
                    if (current == head) head = head.next;
                    if (current == tail) tail = prev;
                    prev.next = current.next;
                    return;
                }
                prev = current;
                current = current.next;
            } while (current != head);
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void displayProcesses() {
            if (head == null) {
                System.out.println("No processes in queue.");
                return;
            }
            Process current = head;
            System.out.println("Current Processes in Queue:");
            do {
                System.out.println("Process ID: " + current.processID + ", Burst Time: " + current.remainingTime);
                current = current.next;
            } while (current != head);
        }

        public void roundRobinScheduling(int timeQuantum) {
            int time = 0;
            int totalWaitingTime = 0, totalTurnaroundTime = 0, processCount = 0;
            Process current = head;

            while (!isEmpty()) {
                if (current.remainingTime > 0) {
                    int executedTime = Math.min(timeQuantum, current.remainingTime);
                    current.remainingTime -= executedTime;
                    time += executedTime;

                    if (current.remainingTime == 0) {
                        int turnaroundTime = time;
                        int waitingTime = turnaroundTime - current.burstTime;
                        totalWaitingTime += waitingTime;
                        totalTurnaroundTime += turnaroundTime;
                        processCount++;
                        removeProcess(current.processID);
                    }
                }
                displayProcesses();
                current = current.next;
            }

            System.out.println("Average Waiting Time: " + (double) totalWaitingTime / processCount);
            System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / processCount);
        }
    }
