package CircularLinkedList.RoundRobinSchedulingAlgorithm;

import java.util.Scanner;

class Process {
    int processID, burstTime, priority, remainingTime;
    Process next;

    public Process(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.priority = priority;
        this.remainingTime = burstTime;
        this.next = null;
    }
}
