package r20ef400;

public class factorial {
	public void fact()
	{
		int i,fact=1;
		int number=5;
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"+number+"is"+fact);
	}
}
