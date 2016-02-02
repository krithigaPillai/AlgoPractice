package com.kri.algo;
import java.util.Scanner;

public class MutliplyWithout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the first number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("enter the second number");
		int b = s.nextInt();
		int mul = 0;
		for(int i=0;i<a;i++)
		{
			mul+=b;
		}
		System.out.println(mul);
		
		s.close();
	}

}
