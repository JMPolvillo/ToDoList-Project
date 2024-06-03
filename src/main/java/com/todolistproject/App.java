package com.todolistproject;

Public static void Main {
    Scanner scanner = new Scanner(system.in);

}

Public static void Menu {
    
    While (true) {

    system.out.println("1. Add Task ");
    system.out.println("2. Delete Task ");
    system.out.println("3. List Task ");
    system.out.println("4. Mark Task as completed ");
    system.out.println("5. Exit ");
    system.out.println("Select an option: ");
    
    int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            AddTask(scanner);
            break;
            case 2:
            DeleteTask(scanner);
            break;
            case 3:
            ListTasks(scanner);
            break;
            case 4:
            MarkTask(scanner);
            break;
            case 5:
            system.out.println("Exiting APP.");
            scanner.close();
            return;
            default:
            system.out.println("Invalid number. Enter a correct option.");
        }
   
    }

}  


Public static void AddTask {
}
    
Public static void DeleteTask {
}

Public static void ListTasks {
}
    
Public static void MarkTask {
}
    
Public static void Exit {
}    
