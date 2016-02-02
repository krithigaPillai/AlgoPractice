package com.kri.algo;
/**
 * 
 */

/**
 * @author krithigakrishnakumar
 *
 */
import java.util.Scanner;
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner newInput = new Scanner(System.in);
		System.out.println("enter number of elements:");
		int n = newInput.nextInt();
		int[] a = new int[n];
		System.out.println("enter "+ n +"elements:");
		for(int i=0;i<n;i++)
		{
			a[i] = newInput.nextInt();
		}
        insertionSort(a, n);
        newInput.close();
	}
	public static void insertionSort(int[] a, int n)
	{
		int j,temp;
		for(int i=1; i<n; i++)
		{
			temp = a[i];
			j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1] = a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		printArray(a, n);
		
	}
	public static void printArray(int[] a,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
