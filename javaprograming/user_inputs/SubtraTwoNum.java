// WAJP to prefrom Subtracation of Two Number take a user input

import java.util.Scanner;
class SubtraTwoNum
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter first Number");
		int n1 = ss.nextInt();
        System.out.println("Enter Secand Number");
		int n2 = ss.nextInt();

		int res = n1 - n2;
        System.out.println("Subtration " +n1+ " and " +n2+ " is : " +res);


	}
}
