package com.keyin;

// linked list of tasks
public class TaskList {

    
    static class Node {
        Task  task;
        Node  next;
        Node(Task task) { this.task = task; }
    }

    private Node head;  
    private int  size = 0;

    // new task
    public void add(Task task) {
        Node n = new Node(task);
        n.next = head;
        head   = n;
        size++;
    }

    // mark task
    public void markCompleted(int index) {
        Node cur = head;
        for (int i = 0; i < index && cur != null; i++) {
            cur = cur.next;
        }
        if (cur != null) {
            cur.task.markCompleted();
        }
    }

    // print task
    public void printAll() {
        Node cur = head;
        int idx  = 0;
        while (cur != null) {
            System.out.printf("  #%d %s%n", idx, cur.task);
            cur = cur.next;
            idx++;
        }
        if (size == 0) System.out.println("  (no tasks)");
    }
}
