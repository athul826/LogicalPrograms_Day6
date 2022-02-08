package com.bridgelabz;

import java.util.Scanner;

	public class PerfectNumbers {

	public static void main(String[] args) {
		int sum = 0;
		int number;
		System.out.print("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		for(int i=1; i<number; i++) 
		{
			if(number % i == 0) 
			{	
				sum = sum+i;
			}
		}	
			if(number == sum) 
				System.out.println("perfect Number");
			else 
				System.out.println("Not Perfect number");
			
				sc.close();			
	}
	

	}


	


