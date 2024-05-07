// WAJP tp obtain the Sumation of digits presents in the given number 


import java.util.Scanner;
class SumationDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The  Number ");

		int num = sc.nextInt();
		int rem = 0;
        int sum = 0;
		while (num !=0)
		{
         rem = num %10;
		 sum = sum + rem;
         num = num /10;
		}
		System.out.println("Sumation of digits : "+sum);
	}
}
