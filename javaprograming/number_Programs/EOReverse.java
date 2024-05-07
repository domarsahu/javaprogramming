/* WAJP to check the given reeverse number is even or odd */

import java.util.Scanner;
class EOReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The  Number ");
		int num = sc.nextInt();
		int rem=0;
		while(num !=0)
			{
		    rem = num%10;

			// rev =rev*10+rem
			num = num/10;
			//////System.out.print(rem);
            
			}
           // if (rev%2 ==0)
			if ( rem %2 == 0 )
			{
				//System.out.println("reverse number "+rev+"is Even");
				System.out.println("\n Given number is even ");
			}
			else {
				//System.out.println("reverse number "+rev+"is Odd");

				System.out.println("\n Given number is odd ");

		}
		
	}
}
