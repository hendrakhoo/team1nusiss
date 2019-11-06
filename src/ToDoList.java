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

	public ArrayList<Task> getCompletedTasks() {
		ArrayList<Task> taskList = new ArrayList<Task>(tasks.values());
		ArrayList<Task> completedTask = new ArrayList<Task>();
		Iterator<Task> i = taskList.iterator();
		while (i.hasNext()) {
			Task temp = i.next();
			if (temp.isComplete() == true) {
				completedTask.add(temp);
			}
		}
		return completedTask;
	}
}
