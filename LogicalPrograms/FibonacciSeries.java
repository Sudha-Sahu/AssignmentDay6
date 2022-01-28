package com.Bridgelabz.LogicalProgramming;
import java.util.*;


public class FibonacciSeries{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the term number upto which you want to print series: ");
		int term = sc.nextInt();
		printFibonacciSeries(term);
	}

	public static int printFibonacciSeries(int term) {

		int series[] = new int[term];
		series[0] = 0;
		series[1] = 1;
		
		for(int i=2; i < series.length; i++) {
			series[i] = series[i-2]+series[i-1];
		}
		System.out.println("the Fibonacci series upto given term "+term+" are : ");
		for(int i=0; i < series.length; i++) {
			System.out.print(series[i]);
			System.out.print("  ");
		}
		return 0;
	}
}