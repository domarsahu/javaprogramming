// WAJP to find the factorial of number

import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		int f = 1;

		for (int i = 1;i<=a ; i++)
		{
			f = f*i;

		}
		System.out.println("factorial number is : "+f);
	}
}
