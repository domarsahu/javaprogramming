// WAJP to  Create a calculator  app using Switch

import java.util.Scanner;
class Calculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Number");
		int n1 = sc.nextInt();
		System.out.println("Enter a Second Number");
		int n2 = sc.nextInt();
		System.out.println("********** Welcome to Calculator ************");
		System.out.println(" Press below  the Oprators");
		System.out.println("1. Addiation\n2. Substraction\n3. Multiplication\n4. Division with Quisent\n5. Division with Remainder ");


       int choice = sc.nextInt();
       switch (choice)
       {
       case 1:
		   int add = n1 + n2;
	       System.out.println( "Addition of n1 + n2 is :" + add );
		   break;
		    
		case 2:
		   int sub = n1 - n2;
	       System.out.println( "Subtraction of n1 - n2 is : " + sub );
		   break;
		case 3:
		   int mul = n1 * n2;
	       System.out.println( "Multiplication of n1 * n2 is : " + mul );
		   break;
		case 4:
		   int diQ = n1 / n2;
	       System.out.println( "Division with Quisent of n1 / n2 is : " + diQ );
		   break;
	    case 5:
		   int diR = n1 % n2;
	       System.out.println( "Division with Remainder of n1 % n2 is : " + diR );
		   break;
		   
	    default :
			System.out.println("INVALID OPARETOR");
		    break;
       
       }


	}
}
