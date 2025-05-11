package TaskMng;
import java.util.*;
public class Task {
    private int task_id;
    private String task_name;

    public Task(int task_id, String task_name) {
        this.task_id = task_id;
        this.task_name = task_name;
    }

    public int getTask_id() {
        return task_id;
    }

    public String getTask_name() {
        return task_name;
    }
}
