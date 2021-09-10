package com.Television.Factory;

import com.Television.FactoryInterface.televisionDisplay;

public class LiquidCrystalDisplayTelevision extends Television implements televisionDisplay{

	

	public LiquidCrystalDisplayTelevision(String monitor, String speakers, String icCircuit, String receiver,
			String remote, String inches) {
		super(monitor, speakers, icCircuit, receiver, remote, inches);
 
	}

	@Override
	public void createTelevisionOrdered(Object television) {

		((Television) television).processOne();
		((Television) television).processTwo();
		((Television) television).processThree();
		((Television) television).processFour();
		
	}

	@Override
	public void display() {
		System.out.println("LiquidCrystalDisplayTelevision Created");
	}

}
