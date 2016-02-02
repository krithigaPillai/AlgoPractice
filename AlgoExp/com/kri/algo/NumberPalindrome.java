package com.kri.algo;
import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(palin(n)){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		s.close();
	}
	public static boolean palin(int n)
	{
		int copy = 0;
		int orgValue = n;
		while(n != 0)
		{
			copy = (copy*10) + (n%10);
			n= n/10;
			System.out.println("n:"+n);
		}
		if(copy == orgValue)
		{
			return true;
		}
		return false;
	}

}
