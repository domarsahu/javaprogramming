// WAJP to create a calculator app

import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
	
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter First Number  : ");
		int n1 = ss.nextInt();
	    System.out.print("Enter Second Number : ");
		int n2 = ss.nextInt();
	    System.out.println("****** WELCOME TO CALCULTOR APP ******");
        System.out.println("Pres 1 for Addition ");
        System.out.println("Pres 2 for Subtraction ");
        System.out.println("Pres 3 for Multiplication ");
        System.out.println("Pres 4 for Division with Quotient ");
        System.out.println("Pres 5 for Division with Remainder ");

		int choice = ss.nextInt();


		if( choice ==1)
		{
			int res1 = n1 + n2 ;
		    System.out.println("Addiation of  "+ n1+" and " + n2+ " is : " + res1);
		}
		else if (choice== 2)
		{
			int res2 = n1 - n2 ;
		    System.out.println("Subtraction of  "+ n1+" and " + n2+ " is : " + res2);
		}
		else if (choice == 3)
		{
			int res3 = n1 * n2 ;
		    System.out.println("Multipication of  "+ n1+" and " + n2+ " is : " + res3);
		}
		else if (choice == 4)
		{
			int res4 = n1 / n2 ;
		    System.out.println("Division with Quotient of  "+ n1+" and " + n2+ " is : " + res4);
		}
		else if (choice == 5)
		{
			int res5 = n1 % n2 ;
		    System.out.println("Division with Remainder of  "+ n1+" and " + n2+ " is : " + res5);
		}
		else 
		{
			System.out.println("Invalid Choice");
		}
		
	}
}
 
