/* WAJP to create three char variable and cheak var1 is Equal to var2 and var3
      print boolean output */

class ThreeChar 
{
	public static void main(String[] args) 
	{
		char var1 = 'A';
		char var2 = 'D';
		char var3 = 'A';

		boolean a = var1 == var2;
		boolean b = var1 == var3;

		System.out.println("var1 is Equal to var2 : " +a);
		System.out.println("var1 is Equal to var3 : " +b);
	}
}
