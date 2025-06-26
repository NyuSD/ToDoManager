package com.keyin;

// single item
public class Task {
    private final String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed   = false;
    }

    // mark the task as completed
    public void markCompleted() {
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return (completed ? "[✔] " : "[ ] ") + description;
    }
}
