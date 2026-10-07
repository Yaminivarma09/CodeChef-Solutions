// Problem: DSAAGP36
// Platform: codechef
// Language: Java​
// Verdict: Accepted
// URL: https://www.codechef.com/learn/course/hashing/HASH01/problems/DSAAGP36
// Solved on: 2026-10-07T07:17:17.923Z

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    int max=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		       
		        if(a[i]>max)
		        {
		            max=a[i];
		        }
		        
		    }
		    int[] hash=new int[max+1];
		    for(int i=0;i<=max;i++)
		    {
		        hash[i]=0;
		    }
		    for(int i=0;i<n;i++)
		    {
		        hash[a[i]]++;
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(hash[a[i]]+" ");
		    }
		    System.out.println();
		}

	}
}
