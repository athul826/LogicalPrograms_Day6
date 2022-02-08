package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("press 1 to start stopwatch :");
			int stopWatch = sc.nextInt();
			if(stopWatch == 1) {
				long start = System.currentTimeMillis();
				System.out.println("\nPress any number to stop Stopwatch :");
				sc.nextInt();
				long stop = System.currentTimeMillis();
				float timeElapsed = (stop - start) / 1000;
				System.out.printf("Elapsed Time : %.2f " , timeElapsed);
			}
			sc.close();
			

	}

}
