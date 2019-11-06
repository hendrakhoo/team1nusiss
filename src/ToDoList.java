import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

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

	public String removeTask(String description) {
		tasks.remove(description);
		return description;
	}

	public Collection<Task> getAllTasks() {
		return tasks.values();
	}

	public Collection<Task> getCompletedTasks() {
		// Add code here
		return null;
	}
	
	public Collection<Task> partialWordSearchTasks(String description) {
		Collection<Task> taskCollection = tasks.values();
		
		ArrayList<Task> toRemove = new ArrayList();
				
		for (Task t: taskCollection) {
			if (!t.getDescription().contains(description)) {
				toRemove.add(t);
			}
		}
		
		for (Task t: toRemove) {
			taskCollection.remove(t);
		}
		
		return taskCollection;
	}
}
