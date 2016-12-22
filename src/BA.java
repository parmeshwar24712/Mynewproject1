import java.io.*;
import java.util.*;
public class BA
{
	public static void main(String[] args)
	{	
		//Decimal to Binary or Octal or Hexadecimal
		//Replace 2 with 8 or 16
		int num,rem,base=1,bin=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal No.: ");
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%2;
			bin=bin+rem*base;
			num=num/2;
			base=base*10;
		}
		System.out.println("Binary No.: "+bin);
		
		//Binary to Decimal
		int bv,dv=0,bs=1,rem3;
		System.out.println("Enter Binary Value: ");
		bv=sc.nextInt();
		while(bv>0)
		{
			rem3=bv%10;
			dv=dv+rem3*bs;
			bv=bv/10;
			bs=bs*2;
		}
		System.out.println("Decimal No.: "+dv);
		
		//Convert Binary to Octal or Hexadecimal
		//1.Convert Binary into Decimal
		//2.Convert Decimal to Octal or Hexadecimal
	}
}