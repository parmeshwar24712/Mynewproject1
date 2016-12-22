import java.io.*;
import java.util.*;
class ArrayMul
{
	public static void main(String args[])
	{
		int a[]={1,3,4,7,19};
		int b[]={1,3,5,8,19,35,4,98};
		int x,y;
		x=a.length;
		y=b.length;
		System.out.print("Same element(s) from both arrays is/are:");
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++)
			{
				if(a[i]==b[j])
					System.out.print(" "+a[i]);
			}
		}
		System.out.print("\nMultiplication of two arrays are:");
		for(int i=0;i<x;i++)
		{
			for(int j=i;j<=i;j++)
			{
				int sum=0;
				sum+=a[i]*b[j];
				System.out.print(" "+sum);
			}
		}
	}
}