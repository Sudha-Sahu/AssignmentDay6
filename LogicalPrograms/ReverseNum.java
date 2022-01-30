package com.Bridgelabz.LogicalProgramming;
import java.util.*;

public class ReverseNum{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter any number to reverse it : ");
		int num = sc.nextInt();
		numberReverse(num);
	}

	public static void numberReverse(int n) {

		int reverse = 0 , remainder;
		System.out.print("The Reverse of "+n+ " is : ");
		while(n != 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n/10;
		}
		System.out.print(reverse);
	
	}
}
