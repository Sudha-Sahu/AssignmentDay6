package com.Bridgelabz.LogicalProgramming;

public class StopWatch{

	public static void main(String[] args) {

		long startTime = 0;
		long endTime = 0;
		long elaspedTime;
		
		startTime = System.currentTimeMillis();
		System.out.println("The Start time in StopWatch is : "+startTime);
	
		endTime = System.currentTimeMillis();
		System.out.println("The End time in StopWatch is : "+endTime);
		
		elaspedTime = endTime - startTime;
		System.out.println("The elasped time in StopWatch is : "+elaspedTime);

	}
}