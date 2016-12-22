import java.io.*;
import java.util.*;
public class PrimeNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		do
		{
//			int n,sum=0,num=0,count=0;
//			System.out.println("Enter Value of n: ");
//			n=sc.nextInt();
//			if(n==1)
//				System.out.println("Universal Prime number");
//			else
//			{
//				for(int i=1;i<=n-1;i++)         
//				{ 		  	  
//					int counter=0; 	  
//					for(num=i;num>=1;num--)
//					{
//						if(i%num==0)
//						{
//							counter=counter+1;
//						}
//					}
//					if(counter==2)
//					{
//						sum+=i;
//						count++;
//					}	
//				}	
//				System.out.println("Prime numbers addition between 1 to "+n+" is :"+sum);
//				System.out.println("Total Prime numbers between 1 to "+n+" are :"+count);
//			}   
			
			int n1,flag=0;
			System.out.println("Enter number: ");
			n1=sc.nextInt();
			for(int i=2;i<=n1/2;i++)
			{
				if(n1%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
				System.out.println("Not Prime...");
			else
				System.out.println("Prime...");
		
			
			System.out.println("Do you want to continue(y/Y)?");
			ch=(sc.next()).charAt(0);
		}while(ch=='y'||ch=='Y');
	}
}