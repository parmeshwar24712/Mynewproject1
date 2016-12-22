class Armstrong
{  
	public static void main(String[] args)
	{  
		int n=153,c=0,a,d;  
		d=n;  
		while(n>0)  
		{  
			a=n%10;  
			n=n/10;  
			c=c+(a*a*a);  
		}  
		if(d==c)  
			System.out.println("Armstrong number!");   
		else  
			System.out.println("Not an armstrong number!");   
	}  
}  