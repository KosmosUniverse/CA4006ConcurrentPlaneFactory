package ie.dcu;

import java.util.HashMap;
import java.util.Random;

public class Main {
	private int nextAircraft = 0;
	
	public static void main(String[] args) {
		
	}
	
	public HashMap<Plane, Tasks> generatePlane() {
		Random random = new Random();
		int fullWork = random.nextInt(90) + 10;
		Plane plane = new Plane(this.nextAircraft, fullWork);
		Tasks tasks = new Tasks();
		int taskCount = random.nextInt(9) + 1;
		
		for (int idx = 0; idx < taskCount; idx++) {
			int work;
			
			if (idx == taskCount - 1) {
				work = fullWork;
			}
			else {
				work = random.nextInt(fullWork - 1) + 1;
				fullWork -= work;	
			}
			
			tasks.addTask(new Task(this.nextAircraft, work, getTaskName()));
		}
		
		HashMap<Plane, Tasks> ret = new HashMap<Plane, Tasks>();
		ret.put(plane, tasks);
		
		this.nextAircraft++;
		
		return (ret);
	}
	
	private String getTaskName() {
		Random random = new Random();
		int idx = random.nextInt(TaskNames.values().length);
		String taskName = TaskNames.values()[idx].getName();
		
		return (taskName);
	}
}
