/*  WAJP to find the number the power of a number 
			Enter the number : 3
			Enter the power  : 2
			power of 3       : 9
*/

import java.util.Scanner;
class PowerNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		System.out.print("Enter the Power : ");
		int pow = sc.nextInt();
        
		int res = 1;
		for (int i =1 ; i <= pow; i++)
		{
			 res = res*num;

		}
		System.out.println("Power of "+num+" : "+res);


	}
}
