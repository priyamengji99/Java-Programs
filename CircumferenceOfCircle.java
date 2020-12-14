package com.xworkz.memorymanagement;

public class CircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircumferenceOfCircle Cf=new CircumferenceOfCircle();
		double res=Cf.CircumferenceOfCircle(5);
		System.out.println("circumference of circle is"+res);
		
	}
double CircumferenceOfCircle(int radius)
{
	double circumference;
	
	
	double pi=findpi();
	circumference=2*pi*radius;
	return circumference;

}

double findpi()
{
	double pi=22.00/7.00;
	System.out.println("the value of pi is"+pi);
	return pi;
}
}
