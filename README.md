# To-Do List Manager 

A demo written in Java to show off linked lists

1. **Main** creates the `User[]`.
2. User methods delegate to `TaskList`.
3. `Task` holds description + `completed` flag.

## Features
1. Add users (array)
2. Add tasks (linked-list)
3. Mark tasks completed
4. View all tasks per user
5. Command-line demo (Main.java)

## Requirements

* **JDK 17** or newer
* **Maven 3.9+**

## Quick start

```bash
git clone https://github.com/NyuSD/ToDoManager
cd ToDoManager
mvn clean package
mvn exec:java "-Dexec.mainClass=com.keyin.Main"
```
