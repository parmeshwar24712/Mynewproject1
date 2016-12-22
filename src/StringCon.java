public class StringCon
{
	public static void main(String[] args)
	{
		String s1="Mumbai123";
		String s2="Pune";
		char ch1,ch2;
		int a=s1.length();
		int b=s2.length();
		System.out.println("The Combined string is: ");
		if(a>b)
		{
			for(int i=0;i<a;i++)
			{				
				if(i<=a)
				{
					ch1=s1.charAt(i);
					System.out.print(" "+ch1);
				}
				if(i<b)
				{
					ch2=s2.charAt(i);
					System.out.print(" "+ch2);
				}
			}
		}
		else
		{
			for(int i=0;i<b;i++)
			{				
				if(i<a)
				{
					ch1=s1.charAt(i);
					System.out.print(" "+ch1);
				}
				if(i<=b)
				{
					ch2=s2.charAt(i);
					System.out.print(" "+ch2);
				}
			}
		}
	}
}