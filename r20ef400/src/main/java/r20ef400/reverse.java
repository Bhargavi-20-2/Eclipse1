package r20ef400;

public class reverse {
	public void rev()
	{
	int num=1234567,reversed=0;
	for(;num!=0;num/=10)
	{
		int digit=num%10;
		reversed=reversed*10+digit;
	}
	 System.out.println("Reversed number:"+reversed);
	}
}
