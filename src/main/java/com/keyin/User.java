package com.keyin;

public class User {
    private final String  name;
    private final TaskList list = new TaskList();

    public User(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void addTask(String description) {
        list.add(new Task(description));
    }

    public void markTaskCompleted(int index) {
        list.markCompleted(index);
    }

    public void printTasks() {
        System.out.println("Tasks for " + name + ":");
        list.printAll();
        System.out.println();
    }
}
