package com.todolistproject;


import java.util.Scanner;
import java.util.ArrayList;


public class TodoListApp {
    private static ArrayList<String> todoList = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }


    public static void menu(Scanner scanner) {
   
    while (true) {
    System.out.println("To Do List APP");
    System.out.println("--------------");
    System.out.println("1. Add Task ");
    System.out.println("2. Delete Task ");
    System.out.println("3. List Task ");
    System.out.println("4. Mark Task as completed ");
    System.out.println("5. Exit ");
    System.out.println("--------------");
    System.out.println("Select an option: ");
   
    int choice = scanner.nextInt();
            scanner.nextLine();


        switch (choice) {
            case 1:
            addTask(scanner);
            break;
            case 2:
            DeleteTask(scanner);
            break;
            case 3:
            ListTasks(scanner);
            break;
            case 4:
            markTask(scanner);
            break;
            case 5:
            System.out.println("Exiting APP.");
            scanner.close();
            return;
            default:
            System.out.println("Invalid number. Enter a correct option.");
        }
   
    }


}  

public static void addTask(Scanner scanner) {
    System.out.print("Enter the task description: ");
    String taskDescription = scanner.nextLine();
    todoList.add(taskDescription);
    System.out.println("Task added: " + taskDescription);
}

 public static void markTask(Scanner scanner) {
        listTasks();
        System.out.print("Enter the number of the task to mark as completed: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < todoList.size()) {
            String completedTask = todoList.get(index);
            System.out.println("Task marked as completed: " + completedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}