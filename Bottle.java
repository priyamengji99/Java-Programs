package com.xworkz.accessmodifier.publicmodifier;

public class Bottle {
	public String color;
	public String material;
	public int price;
	public Bottle(String icolor,String imaterial)
	{
		color=icolor;
		material=imaterial;
		}
	public Bottle(String icolor,String imaterial,int iprice)
	{
		color=icolor;
		material=imaterial;
		price=iprice;
	}
	public void Drinking()
	{
		System.out.println("used for drinking purpose");
	}

}
