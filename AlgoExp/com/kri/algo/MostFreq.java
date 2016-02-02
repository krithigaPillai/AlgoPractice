package com.kri.algo;

public class MostFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,3,5,6,7,8,6,9,2,3,6};
		int n = a.length;
		int k = n;
		int result =0,max = 0;
		for(int i = 0; i<n; i++)
		{
			a[a[i]%k] += k;
		}
		max = a[0];
		for(int i = 1; i<n; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
				result = i;
			}
		}
		
System.out.println(result);
	}

}
