package com.xworkz.accessmodifier.protectedmodifier;

public class Tv {
	protected String brand;
	protected int price;
	protected Tv(String ibrand,int iprice)
	{
		brand=ibrand;
		price=iprice;
	}
	protected void ChangingChannels()
	{
		System.out.println(" used for switching different channels");
	}

}
