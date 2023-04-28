import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private ArrayList<String> tasks = new ArrayList<String>();
    
    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added to the list.");
    }
    
    public void deleteTask(int index) {
        tasks.remove(index);
        System.out.println("Task deleted from the list.");
    }
    
    public void markTaskAsComplete(int index) {
        tasks.set(index, tasks.get(index) + " (Completed)");
        System.out.println("Task marked as complete.");
    }
    
    public void displayTasks() {
        System.out.println("Tasks in the list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }
    
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit) {
            System.out.println("Enter an option:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Mark a task as complete");
            System.out.println("4. Display all tasks");
            System.out.println("5. Quit");
            
            int option = scanner.nextInt();
            
            switch(option) {
                case 1:
                    System.out.println("Enter the task:");
                    scanner.nextLine();
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.println("Enter the index of the task to delete:");
                    int indexToDelete = scanner.nextInt() - 1;
                    toDoList.deleteTask(indexToDelete);
                    break;
                case 3:
                    System.out.println("Enter the index of the task to mark as complete:");
                    int indexToMark = scanner.nextInt() - 1;
                    toDoList.markTaskAsComplete(indexToMark);
                    break;
                case 4:
                    toDoList.displayTasks();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
        
        scanner.close();
    }
}
