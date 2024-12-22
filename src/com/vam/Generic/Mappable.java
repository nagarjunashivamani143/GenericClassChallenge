package com.vam.Generic;

public interface Mappable {

	public void render();
	
	static double[] stringLocation(String location) {
		String[] splits = location.split(",");
		
		double lat = Double.valueOf(splits[0]);
		double lon = Double.valueOf(splits[1]);
		return new double[] {lat,lon};
		
	}
	
}
