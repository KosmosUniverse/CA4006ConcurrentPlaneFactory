package ie.dcu;

// This class represent Plane
public class Plane {
	private int fullWork;
	private int amountOfWork;
	private PlaneStatus status;
	private int id;
	
	// Constructor
	public Plane(int id, int fullWork) {
		this.fullWork = fullWork;
		this.amountOfWork = 0;
		this.id = id;
		this.status = PlaneStatus.INITIAL;
	}
	
	// fullWork getter
	public int getFullWork() {
		return (this.fullWork);
	}
	
	// amountOfWork getter
	public int getAmountOfWork() {
		return (this.amountOfWork);
	}
	
	// Id getter
	public int getId() {
		return (this.id);
	}
	
	// Status getter
	public PlaneStatus getStatus() {
		return (this.status);
	}
	
	// This method add work to this plane
	public void addWork(int workDone) {
		this.amountOfWork += workDone;
		this.status = PlaneStatus.PROGRESS;
		if (this.fullWork == this.amountOfWork)
			this.status = PlaneStatus.FINISHED;
		else if (this.fullWork < this.amountOfWork)
			this.status = PlaneStatus.OVERLOAD;
	}
	
	// This method check if all work done and no more
	public boolean checkIntegrity() {
		return (this.status == PlaneStatus.FINISHED);
	}
}
