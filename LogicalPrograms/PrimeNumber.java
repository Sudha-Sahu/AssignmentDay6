package com.Bridgelabz.LogicalProgramming;
import java.util.*;


public class PrimeNumber{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number to check prime or not: ");
		int num = sc.nextInt();
		checkPrime(num);
	}

	public static void checkPrime(int n) {

		int cnt=0;
		for(int i=1; i <= n; i++) {
			if(n % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2)
			System.out.println(n +" is Prime Number!!! ");
		else
			System.out.println(n +" is not Prime Number!!! ");
	}
}