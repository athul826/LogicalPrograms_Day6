package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num;
		int a = 0;
		int b = 1;
		int c;
		System.out.print("enter the number : ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		for(int i =1; i<=num; i++) {
			System.out.print(a + " " );
			c = a+b;
			a = b;
			b = c;
			
			sc.close();
		}
		
		

	}

}
