package com.thirdjava;
import java.util.*;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input two integers and print their sum, difference, product, and quotient.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 2 numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=a+b;
		int diff=a-b;
		int pro=a*b;
		int quo=a%b;
		System.out.println("sum:"+sum);
		System.out.println("diff:"+diff);
		System.out.println("pro:"+pro);
		System.out.println("quo:"+quo);
		
		

	}

}
