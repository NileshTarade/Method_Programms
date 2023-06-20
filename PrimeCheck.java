package methods;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7;
		Prime(a);
		if(Prime(a)==true)
		{
			System.out.println(a+" is prime Number");
		}
		else
		{
			System.out.println(a+" is not a Prime Number");
		}
		

	}
	public static boolean Prime(int a)
	{
		for(int i=2;i<=a/2;i++)
			if(a%i==0)
			{
				//System.out.println(i);
				return false;
			}
			else
			{
				//System.out.println();
				return true;
			}
		return true;
	}

}
