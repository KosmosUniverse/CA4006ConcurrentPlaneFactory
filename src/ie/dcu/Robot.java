package ie.dcu;

// This class represent a robot, that will have a threaded method
public class Robot {
	private int id;
	private int maxAmountOfWork;
	private Tasks tasks;
	
	// Constructor
	public Robot(int id, int maxWork) {
		this.id = id;
		this.maxAmountOfWork = maxWork;
	}
	
	// Id getter
	public int getId() {
		return (this.id);
	}
	
	// Task list getter
	public Tasks getTasks() {
		return (this.tasks);
	}
	
	// Add task to list
	public boolean addTask(Task task) {
		int currentWork = this.tasks.getTotalWork();
		
		if ((currentWork + task.getAmountOfWork()) > this.maxAmountOfWork)
			return (false);
		return (true);
	}
}
