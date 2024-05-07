// WAJP to obtain the sumation of digis only if it palinerome number 

import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
        int rev = 0;
		int temp = num;
      
		while (num != 0)
		{
			int rem = num%10;
			rev = rev*10 +rem;
			num= num/10;
		}
			num = temp;
			int sum = 0;

			if(rev == num)
			{
				System.out.println(num+" is palinedrome " );
				while (num!=0)
				{
					int rem = num%10;
					sum = sum+rem;
					num = num/10;
				}
				System.out.println("sum is : "+sum);
			}
			else {
				System.out.println(num+" is Not  palinedrome");

			}
		
	}
}
