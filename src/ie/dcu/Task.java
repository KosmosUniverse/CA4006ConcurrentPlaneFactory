package ie.dcu;

// This class represent a task
public class Task {
	private int aircraftId;
	private int amountOfWork;
	private String name;
	
	// Contructor
	public Task(int aircraftId, int work, String name) {
		this.aircraftId = aircraftId;
		this.amountOfWork = work;
		this.name = name;
	}
	
	// Id getter
	public int getAircraftId() {
		return (this.aircraftId);
	}
	
	// Work getter
	public int getAmountOfWork() {
		return (this.amountOfWork);
	}
	
	// name getter
	public String getName() {
		return (this.name);
	}
}
