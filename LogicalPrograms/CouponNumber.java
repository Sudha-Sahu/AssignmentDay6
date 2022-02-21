package com.Bridgelabz.LogicalProgramming;
import java.util.*;

public class CouponNumber{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many random number you want to store : ");
		int num = sc.nextInt();
		int[] random = new int[num];

		Random ran=new Random(); 
		for(int i=0;i<random.length;i++) 
			random[i] = ran.nextInt(100);

		System.out.println(num+" Coupon number are : ");
		for(int i=0;i<random.length;i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		couponNumber(random, num);
	}
	public static void couponNumber(int[] arrDistinct, int arrLen) {

		System.out.println("Distinct Coupon number are : ");
		for (int i = 0; i < arrLen; i++){
			int j;
			for (j = 0; j < i; j++) 
				if (arrDistinct[i] == arrDistinct[j])
					break;
			if (i == j)
				System.out.print(arrDistinct[i] + " ");
		
		}
	}
}
