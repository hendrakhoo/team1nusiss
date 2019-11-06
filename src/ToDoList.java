import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
	private HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask(Task task) {
		tasks.put(task.getDescription(), task);
	}

	public void completeTask(String description) {
		Task task = tasks.get(description);
		task.setComplete(true);
	}

	public boolean getStatus(String description) {
		return tasks.get(description).isComplete();
	}

	public Task getTask(String description) {
		return tasks.get(description);
	}

	public Task removeTask(String description) {
		// Add code here
		return null;
	}

	public Collection<Task> getAllTasks() {
		return tasks.values();
	}

	public Collection<Task> getCompletedTasks() {
		// Add code here
		return null;
	}
}
