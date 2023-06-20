package methods;

public class FactDigit { 

	public static void main(String[] args) 
	{
		 B1(40585);
	}
	public static boolean B1(int n)
	{
		FactOfDigit(n);
		int sum= FactOfDigit(n);
		if (sum==n)
		{
			System.out.println(true);
			return true;
		}
		else 
		{
			System.out.println(false);
			return false;
		}
	}
	public static int FactOfDigit(int n) {
		int sum=0;
				while(n!=0)
				{
					int a=0, f=1 ;
					
					a=n%10;
					for(int i=a;i>=1;i--)
					{
						f=f*i;
					}
					n=n/10;
					sum=f+sum;
				}
				return sum;
				
			}
	}


