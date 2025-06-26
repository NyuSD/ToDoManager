package com.keyin;

public class Main {

    public static void main(String[] args) {

        User[] users = new User[3];
        users[0] = new User("Jacob");
        users[1] = new User("Sandy");
        users[2] = new User("Maple");


        users[0].addTask("Pay bills");
        users[0].addTask("Buy groceries");

        users[1].addTask("Exercise");
        users[1].addTask("Read a book");

        users[2].addTask("Practice coding");


        users[0].markTaskCompleted(1);
        users[2].markTaskCompleted(0);


        for (User u : users) {
            u.printTasks();
        }
    }
}
