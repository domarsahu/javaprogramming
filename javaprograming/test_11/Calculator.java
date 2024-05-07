/* WAJP to create a basic program for calculator */ 

class Calculator 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;

		int add = a+b;
		int sub = a-b;
        int multi = a*b;
		int div = a/b;
        int mod = a%b;

		System.out.println("addition of " +a+" and "+b+" is " +add);
		System.out.println("sutraction of " +a+" and "+b+" is " +sub);
		System.out.println("multiplication of " +a+" and "+b+" is " +multi);
		System.out.println("divisionQ of " +a+" and "+b+" is " +div);
		System.out.println("division remender of " +a+" and "+b+" is " +mod);
		
	}
}
