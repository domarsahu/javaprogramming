//  WAJP to cheak weather the palinedrome is even or odd

import java.util.Scanner;
class palinedromeEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
        int rev = 0;
		int temp = num;
      
	    while (num!=0)
		{
			int rem = num%10;
			rev = rev*10 +rem;
			num= num/10;
		}
			num = temp;
			if(rev == num)
			{
				// if (num%2 ==0)
				if (rev%2 == 0)
				{
				System.out.println(rev+" is even palinedrome ");

				}else{
				System.out.println(rev+" is odd palinedrome ");

				}
				
			}else{
				System.out.println("Not  palinedrome number ");

				
			}
			
	}
}
