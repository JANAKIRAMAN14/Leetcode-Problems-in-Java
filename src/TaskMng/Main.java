package TaskMng;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taskmanager taskmanager = new Taskmanager(); // Keep it outside the loop to retain tasks

        System.out.println("Welcome to the Task Manager");

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int user = sc.nextInt();

            switch (user) {
                case 1:
                    taskmanager.addTask();
                    break;
                case 2:
                    taskmanager.viewTask();
                    break;
                case 0:
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
