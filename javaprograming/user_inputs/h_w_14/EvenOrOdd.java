// WAJP to check given number is Even OR Odd

import java.util.Scanner;
class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter a Number :  ");
		int a = ss.nextInt();
		if (a % 2 == 0)
		{
			System.out.println(a+ "  : is Even number ");
		}
		else
		{
		    System.out.println(a+ "  : is Odd number ");

		}

	}
}
