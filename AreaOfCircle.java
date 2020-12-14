package com.xworkz.memorymanagement;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle ac=new AreaOfCircle();
		double res=ac.AreaOfCircle(5);
		System.out.println("area of circle is:"+res);
		

	}
	double  AreaOfCircle(int radius)
	{
		double Area;
		double pi=findpi();
		int s=findsqre();
		
		Area=pi*s;
		return Area;
		
		
	}
	double findpi()
	{
		double pi=22.00/7.00;
		return pi;
	}
	int findsqre()
	{
		int radius = 5;
		int s=radius*radius;
		return s;
	}
}
