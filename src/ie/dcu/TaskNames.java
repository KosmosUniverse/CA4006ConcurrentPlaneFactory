package ie.dcu;

public enum TaskNames {
	FUEL("Fuel"),
	WING("Wing"),
	NOSE("Nose"),
	CLEAN("Cleanup"),
	TAILPLANE("Tailplane"),
	SENSORS("Sensors"),
	REACTOR("Reactor")
	;
	
	private String name;
	
	private TaskNames(String name) {
		this.name = name;
	}
	
	public String getName() {
		return (this.name);
	}
}
