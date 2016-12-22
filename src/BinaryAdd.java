import java.io.*;
import java.util.*;
public class BinaryAdd
{
	public static void main(String[] args)
	{
		int num,rem,base=1,bin=0;
		int n1,n2=128,c;
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number: ");
		num=sc.nextInt();
		n1=num;
		//Binary Conversion
		while(num>0)
		{
			rem=num%2;
			bin=bin+rem*base;
			num=num/2;
			base=base*10;
		}
		System.out.println("Binary Number: "+bin);
		
		c=n1&n2;
		if(c==n2)
			System.out.println("8th bit is '1'");
		else
			System.out.println("8th bit is '0'");
		
//		String s1=""+bin; //Convert into the string
//		String s2="10";
		
//		int n=Integer.parseInt(s2,2); //Paring String into integer
//		int n0=Integer.parseInt(s1,2);
//		int n1=Integer.parseInt(s2,2);
		
//		int sum=n0+n1;
//		System.out.println("Sum "+sum);
	}
}