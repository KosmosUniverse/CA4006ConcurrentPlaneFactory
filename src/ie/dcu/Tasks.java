package ie.dcu;

import java.util.ArrayList;

// This class contain a list of task and implement some method to use on this list
public class Tasks {
	private ArrayList<Task> tasks;
	
	// Constructor
	public Tasks() {
		tasks = new ArrayList<Task>();
	}
	
	// List getter
	public ArrayList<Task> getTasks() {
		return (this.tasks);
	}
	
	// Add a task to the list
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	// Calculate total amount of work in list
	public int getTotalWork() {
		int total = 0;
		
		for (Task t : this.tasks) {
			total += t.getAmountOfWork();
		}
		
		return (total);
	}
}
