import java.util.HashMap;
import java.util.Map;

public class TaskList implements TaskListInterface {


    HashMap<String, Boolean> tasks = new HashMap<>();
    MyConsole console;

    public TaskList(MyConsole console) {
        this.console = console;
    }

    @Override
    public void addTask(String description) {
        tasks.put(description, false);
    }

    @Override
    public void completeTask(String description) {
        tasks.put(description, true);
    }

    @Override
    public void showTasks() {
        console.printf("Task            | Completed");
        for (Map.Entry<String, Boolean> task : tasks.entrySet()) {
            console.printf(task.getKey() + "|" + (task.getValue() ? "x" : ""));
        }
    }

    public int getTotalTaskSize() {
        return tasks.entrySet().size();
    }

    public int getCompletedTaskSize() {
        return (int) tasks.entrySet().stream().filter(Map.Entry::getValue).count();
    }
}
