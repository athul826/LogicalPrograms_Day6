package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("enter the number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		while(number > 0) {
			int reverse = number % 10;
			System.out.print(reverse);
			number = number/10;
			
				sc.close();
		}

	}

}
