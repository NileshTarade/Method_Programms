package methods;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter");
		M1();
		System.out.println("Done");
		

	}
	public static void M1()
	{
		M2();
		System.out.println("ABC");
		System.out.println("M1 Methode called");
		
	}
	public static void M2()
	{
		System.out.println("xyz");
		M3();
		System.out.println("M2 Methode Called");
	}
	public static void M3()
	{
		System.out.println("XYZ");
		System.out.println("M3 Methode called");
	}

}
