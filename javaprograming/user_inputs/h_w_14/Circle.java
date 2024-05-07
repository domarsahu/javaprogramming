// WAJP to print circumferance of circle [ C  = 2 * 3.14 * r ]

import java.util.Scanner;
class Circle
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.print("enter a redius : ");
		int r = ss.nextInt();

		double  c = 2 * 3.14 * r;
		System.out.println("Circumferance is : " + c);
	}
}
