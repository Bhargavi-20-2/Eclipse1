package r20ef400;

public class prime {
	public void pir()
	{
		int num=41;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num% i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println(num+"is prime number");
		else
			System.out.println(num+"is not prime number");
			
		}
	}


