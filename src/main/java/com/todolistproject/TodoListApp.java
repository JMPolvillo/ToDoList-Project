package com.todolistproject;

import java.util.Scanner;
import java.util.ArrayList;

public class TodoListApp {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static ArrayList<Boolean> completed = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }

    public static void menu(Scanner scanner) {
        while (true) {
            System.out.println("To Do List APP");
            System.out.println("--------------");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.println("--------------");
            System.out.print("Select an option: ");
   
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    listTasks();
                    break;
                case 3:
                    markTask(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
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
        tasks.add(taskDescription);
        completed.add(false);
        System.out.println("Task added: " + taskDescription);
    }

    public static void listTasks() {
        System.out.println("Tasks List:");
        for (int i = 0; i < tasks.size(); i++) {
            String status = completed.get(i) ? "[X]" : "[ ]";
            System.out.println((i + 1) + ". " + status + " " + tasks.get(i));
        }
    }

    public static void markTask(Scanner scanner) {
        listTasks();
        System.out.print("Enter the number of the task to mark as completed: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < tasks.size()) {
            completed.set(index, true);
            System.out.println("Task marked as completed: " + tasks.get(index));
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public static void deleteTask(Scanner scanner) {
        listTasks();
        System.out.print("Enter the number of the task to delete: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            completed.remove(index);
            System.out.println("Task deleted: " + removedTask);
        } else {
            System.out.println("Invalid task number.");
        }
    }
}