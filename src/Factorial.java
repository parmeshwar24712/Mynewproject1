class Factorial
{  
	static int fact(int number)
	{  
		int f=1;  
		for(int i=1;i<=number;i++)
		{  
			f=f*i;  
		}  
		return f;  
	}  
	public static void main(String args[])
	{  
		int result=fact(5);  
		System.out.println("Factorial of 5="+result);  
	}  
}