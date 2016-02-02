package com.kri.algo;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");
		Scanner s = new Scanner(System.in);
		String word = s.next();
		if(palin(word)){
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		s.close();
	}
	public static boolean palin(String s)
	{
		StringBuilder s1 = new StringBuilder();
		for(int i=s.length()-1; i>=0; i--)
		{
			s1.append(s.charAt(i));
		}
		if(s1.toString().equals(s))
		{
			return true;
		}
		return false;
	}

}
