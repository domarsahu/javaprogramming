// WAJP to print Average of given three values

import java.util.Scanner;
class Average 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter first value  : ");
		int n1 = ss.nextInt();
		System.out.print("Enter second value : ");
	    int n2 = ss.nextInt();
        System.out.print("Enter thrid value  : ");
		int n3 = ss.nextInt();

		int res = (n1 + n2 + n3)/3;
        System.out.println("Average value is : " +res);

	}
}
