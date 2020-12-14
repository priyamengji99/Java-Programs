package com.xworkz.accessmodifier.privatemodifier;

public class Bike {
	private String name;
	private int Price;
	private Bike(String iname,int iprice)
	{
		name=iname;
		Price=iprice;
	}
	private void Riding()
	{
		System.out.println(" used for riding ");
	}
	
	

}
