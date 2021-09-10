package com.Television.Factory;

public class TelevisionFactory {

	public Object createOrderedTelevision(String tv){
		
		if("1".equals(tv)) {
			LiquidCrystalDisplayTelevision l = new LiquidCrystalDisplayTelevision("SONY MONITOR", "Home Theater", "Arduino","IC 6 channel", "Rasberry pie", "40Inches");
			l.createTelevisionOrdered(l);
			l.display();
			return l;
		}else if("2".equals(tv)) {
			CurvedDisplayTelevision c = new CurvedDisplayTelevision("Samsung MONITOR", "Speakers", "Arduino","IC 6 channel", "Rasberry pie", "50Inches");
			c.createTelevisionOrdered(c);
			c.display();
			return c;
		}else if("3".equals(tv)) {
			LightEmitingDiodeTelevision o = new LightEmitingDiodeTelevision("MI MONITOR", "Speakers", "Arduino","IC 6 channel", "Rasberry pie", "50Inches");
			o.createTelevisionOrdered(o);
			o.display();
			return o;
		}
		
		return null;
	}
}
