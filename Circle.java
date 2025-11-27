package com.thirdjava;
import java.util.*;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input the radius of a circle (double) and calculate area and circumference.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of the circle:");
		double r=sc.nextDouble();
		double area=(3.14*r*r);
		double circum=(2*3.14*r);
		System.out.println("area of the circle is:"+area);
		System.out.println("circumference of the circle is:"+circum);
		
		
		

	}

}
