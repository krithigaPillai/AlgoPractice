package com.kri.algo;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the n");
		int n = s.nextInt();
		int b = fib(n);
		System.out.println("result:"+b);
		s.close();

	}
	
	public static int fib(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		if(n == 1)
		{
			return 0;
		}
		if(n == 2)
		{
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
