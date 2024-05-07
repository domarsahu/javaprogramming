// WAJP to print factorial number 5! formula { n (n-1)(n-2)!

class factorial 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int f = 1;
		for (int i = 1;i <=5 ;i++ )
		{
			f = f*i;

		}
		System.out.println(f + " is a factorial of " +n);

				

	}
}
