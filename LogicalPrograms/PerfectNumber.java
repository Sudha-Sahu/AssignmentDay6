package com.Bridgelabz.LogicalProgramming;
import java.util.*;

public class PerfectNumber{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number to check perfect or not: ");
		int num = sc.nextInt();
		checkPerfect(num);
	}

	public static void checkPerfect(int n) {

		int add=0;
		for(int i=1; i < n; i++) {
			if(n % i == 0) {
				add += i;
			}
		}

		if(n == add)
			System.out.println(n +" is Perfect Number!!! ");
		else
			System.out.println(n +" is not Perfect Number!!! ");
		
}
}