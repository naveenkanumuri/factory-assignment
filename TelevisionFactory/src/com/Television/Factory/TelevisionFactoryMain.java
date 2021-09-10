package com.Television.Factory;

import java.util.Scanner;

public class TelevisionFactoryMain {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hi Welcome to Television Shopping");
		System.out.println("Please Find Perfect Television below");
		System.out.println("1 LiquidCrystalDisplayTelevision (LCD)");
		System.out.println("2 CurvedDisplayTelevision (CD)");
		System.out.println("3 Light Emitting Diode Display (LED) ");
		System.out.println("Enter Choice ");
		String next = scanner.next();
		
		TelevisionFactory television = new TelevisionFactory();
		Object createOrderedTelevision = television.createOrderedTelevision(next);
		
		if(createOrderedTelevision instanceof LiquidCrystalDisplayTelevision) {
			System.out.println(createOrderedTelevision.toString());
		}else if(createOrderedTelevision instanceof CurvedDisplayTelevision) {
			System.out.println(createOrderedTelevision.toString());
		}else if(createOrderedTelevision instanceof LightEmitingDiodeTelevision) {
			System.out.println(createOrderedTelevision.toString());
		}
		
		
	}
}
