// WAJP to print the ASCII value  of given Character

import java.util.Scanner;
class ASCIIchar
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.print("Enter Character : " );
		int ch = ss.next().charAt(0);
		System.out.println(ch );

		
	}
}
