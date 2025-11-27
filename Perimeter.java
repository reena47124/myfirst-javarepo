package com.thirdjava;
import java.util.*;

public class Perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input length and breadth of a rectangle and print its area and perimeter.
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the length and breadth of the rectangle:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int area=l*b;
		int peri=2*(l+b);
		System.out.println("area:"+area);
		System.out.println("peri:"+peri);
		
	}

}
