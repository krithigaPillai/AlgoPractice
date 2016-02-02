package com.kri.algo;
import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length:");
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] a = new int[len];
		System.out.println("enter the numbers in the array:");
		for(int i=0; i<len; i++)
		{
			a[i] = s.nextInt();
		}
		int max = findMax(a,len);
		System.out.println(max);

		s.close();
	}
	public static int findMax(int[] a, int n)
	{
		int max_so_far=0, max_ending_here =0;
		for (int x :a )
		{ 
				max_ending_here = Math.max(x, max_ending_here +x);
				max_so_far = Math.max(max_so_far, max_ending_here);	
		}
		return max_so_far;
	}

}
