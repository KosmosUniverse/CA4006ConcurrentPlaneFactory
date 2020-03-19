package ie.dcu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Starter {
	private int nextAircraft = 0;
	private Tasks taskPool = new Tasks();
	private ArrayList<Robot> robots = new ArrayList<Robot>();
	private final int maxRobot = 1;
	private final int maxRobotWork = 70;
	
	public void start() {
		System.out.println("Start Factory");
		
		for (int i = 0; i < this.maxRobot; i++) {
			robots.add(new Robot(i, this.maxRobotWork));
		}
		
		for (Robot r : robots) {
			r.run();
		}
		
		try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Robot r : robots) {
			r.notify();
		}
		
		System.out.println("Stop Factory");
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
