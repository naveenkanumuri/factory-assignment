package com.Television.Factory;

public abstract class Television {
	
	private String monitor;
	private String speakers;
	private String icCircuit;
	private String receiver;
	private String remote;
	private String inches;
	
	
	
	public Television(String monitor, String speakers, String icCircuit, String receiver, String remote,
			String inches) {
		super();
		this.monitor = monitor;
		this.speakers = speakers;
		this.icCircuit = icCircuit;
		this.receiver = receiver;
		this.remote = remote;
		this.inches = inches;
	}

	public void processOne() {
		System.out.println("gather all the essential parts of Television ");
	}
	public void processTwo() {
		System.out.println("Assemble the Circuit Wiring as per the Display");
	}
	public void processThree() {
		System.out.println("Program the Assemble level Integrated circuit coding and dump all the code");
	}
	public void processFour() {
		System.out.println("Test and Recheck the all the Assembled process");
	}
	
	public abstract void createTelevisionOrdered(Object o);
	

}
