package ie.dcu;

// This class represent a robot, that will have a threaded method
public class Robot implements Runnable{
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

	@Override
	public void run() {
		System.out.println("Hello by thread nb " + id);
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Goodbye by thread nb " + id);
	}
}
