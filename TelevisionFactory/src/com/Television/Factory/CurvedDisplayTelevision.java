package com.Television.Factory;

import com.Television.FactoryInterface.televisionDisplay;

public class CurvedDisplayTelevision extends Television implements televisionDisplay {


	public CurvedDisplayTelevision(String monitor, String speakers, String icCircuit, String receiver, String remote,
			String inches) {
		super(monitor, speakers, icCircuit, receiver, remote, inches);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("CurvedDisplayTelevision Created");
	}

	@Override
	public void createTelevisionOrdered(Object television) {
		
		((Television) television).processOne();
		((Television) television).processTwo();
		((Television) television).processThree();
		((Television) television).processFour();
		
	}

}