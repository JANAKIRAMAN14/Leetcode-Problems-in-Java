package TaskMng;
import java.util.*;

public class Taskmanager {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Task> tasks = new HashMap<>();
    int idcounter = 0;

    public void addTask() {
        System.out.println("Enter the name:");
        String name = sc.next();
        tasks.put(++idcounter, new Task(idcounter, name));
        System.out.println("Task added successfully");
    }

    public void viewTask() {
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.printf("%-2d. %-8s\n", entry.getKey(),
                    entry.getValue().getTask_name());
        }
    }
}
