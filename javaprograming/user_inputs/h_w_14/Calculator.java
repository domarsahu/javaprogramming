// WAJP to perform simple calculator operations using two Decimal Numbers

import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		//int input;
		//do{

		Scanner ss = new Scanner(System.in);
		System.out.print("Enter First Number  : ");
		double n1 = ss.nextDouble();
	    System.out.print("Enter Second Number : ");
		double n2 = ss.nextDouble();
	    System.out.println("Select Operator :\n + : Addiation\n - : Subtraction\n * : Multiplication\n / : Division");
        
		char a = ss.next().charAt(0);


		if( a =='+')
		{
			System.out.println("Addition of n1 + n2 : " + (n1 + n2));
		}
		else if (a == '-')
		{
		    System.out.println("Subtracation of n1 - n2 : " + (n1 - n2));
		}
		else if (a == '*')
		{
		    System.out.println("Multipication of n1 * n2 : " + (n1 * n2));
		}
		else if (a == '/')
		{
		    System.out.println("Division of n1 / n2 : " + (n1 / n2));
		}


		/*	System.out.println("Enter for again Task : 1 or Enter any key for Exit : ");
			input=ss.nextInt();
		}while(input==1);    */


		
	}
}
