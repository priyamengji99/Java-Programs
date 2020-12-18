package com.xworkz.InitialisingBlocks;

public class Mobile {
	String brand;
	double price;
	String color;
	{
		System.out.println(" initialising block1");
		color="red";
		price=50000.00;
		
	}

	Mobile(){
	System.out.println("No argument constructor");
	
	}
	Mobile(String icolor,String ibrand)
	{
		color=icolor;
		brand=ibrand;
		
	}
	{
		System.out.println("initialising block2");
	}
}
