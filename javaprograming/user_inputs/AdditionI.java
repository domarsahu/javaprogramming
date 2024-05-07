// WAJP to preform addtion of two number take a user input 


import java.util.Scanner;
class AdditionI 
{
	public static void main(String[] args) 
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int n1 = ss.nextInt();
        System.out.println("Enter number 2 ");
        int n2 = ss.nextInt();

		int res = n1 + n2 ;
        System.out.println(" Addition of " +n1+ " and " +n2+ " is : " +res);


	}
}
