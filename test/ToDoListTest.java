import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;

public class ToDoListTest extends TestCase {
	// Define Test Fixtures

	public ToDoListTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// Initialise Test Fixtures
	}

	@After
	public void tearDown() throws Exception {
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		fail("Not implemented yet");
	}

	@Test
	public void testgetStatus() {
		String description = "Hello";
		Task task = new Task(description);
		assertFalse(task.isComplete());
	}

	@Test
	public void testRemoveTask() {
		fail("Not implemented yet");
	}

	@Test
	public void testGetCompletedTasks() {
		fail("Not implemented yet");
	}

	@Test
	void changeStatus() {
		String description = "Hello";
		Task task = new Task(description);

		ToDoList list = new ToDoList();
		list.addTask(task);

		assertFalse(list.getTask(description).isComplete());

		list.completeTask(description);
		assertTrue(list.getTask(description).isComplete());
	}
}
