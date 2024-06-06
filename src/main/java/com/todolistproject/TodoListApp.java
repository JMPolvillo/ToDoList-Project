package com.todolistproject;


import java.util.Scanner;
import java.util.ArrayList;


public class TodoListApp {
    private static ArrayList<String> task = new ArrayList<>();
    private static ArrayList<Boolean> completed = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }


    public static void menu(Scanner scanner) {
   
    while (true) {
    System.out.println("To Do List APP");
    System.out.println("--------------");
    System.out.println("1. Add Task ");
    System.out.println("2. List Task ");
    System.out.println("3. Mark Task as completed ");
    System.out.println("4. Delete Task ");
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
            listTask(scanner);
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
    System.out.println("Enter the task description: ");
    String taskDescription = scanner.nextLine();
    task.add(taskDescription);
    System.out.println("Task added: " + taskDescription);
}

public static void listTask(Scanner scanner) {
    System.out.println("Tasks List:");
    for (int i = 0; i < task.size(); i++) {
        String status;
        if (completed.get(i)) {
            status = "[X]";
        } else {
            status = "[ ]";
        }
        if (task.get(i) != null) {
            System.out.println((i + 1) + ". " + status + " " + task.get(i));
        }

    }

}

 public static void markTask(Scanner scanner) {
        listTask();
        System.out.print("Enter the number of the task to mark as completed: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < task.size()) {
            String completedTask = task.get(index);
            System.out.println("Task marked as completed: " + completedTask);
        } else {
            System.out.println("Invalid task number.");
        }

    }

public void deleteTask(){
    System.out.println("Enter th task to be deleted");
    String addTask = scanner.nextLine();
    int index = scanner.nextInt() - 1;
    for (int i = 0; i < tasks.length; i++) {
        if (task [i].getTask()){
        }
        if (tasks[i] = null)
         System.out.println("The to-do list has been successfully deleted");  
    }else{
        System.out.println("THE TASK WAS NOT FOUND");    
    }

}

}