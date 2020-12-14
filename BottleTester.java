package com.xworkz.accessmodifier.publicmodifier;

public class BottleTester {
	public static void main(String args[])
	{
		Bottle bottle=new Bottle("Green","plastic");
		bottle.price=100;
		System.out.println("color of  bottle is"+bottle.color);
		System.out.println("material of  bottle is"+bottle.material);
		System.out.println("price of  bottle is"+bottle.price);
		Bottle bottle1=new Bottle("Green","plastic",250);
		System.out.println("color of  bottle is"+bottle1.color);
		System.out.println("material of  bottle is"+bottle1.material);
		System.out.println("price of  bottle is"+bottle1.price);
		bottle.Drinking();
	}
		
		

}
