// WAJP to cheak weather the given number is Even or Odd or Equal to Zero

import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Number ");
		int num = ss.nextInt();

		if (num % 2 == 0 && num >0)
		{
			System.out.println(" Enter Number is Even ");
		}
		else if (num == 0)
		{
			System.out.println(" Enter Number is Zero ");

		}
		else 
		{
			System.out.println(" Enter Number is Odd ");
		}
	}
}
