// WAJP to cheak weather given number is Palindrom or Not. 

import java.util.Scanner;
class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		while(num != 0){
			int rem = num%10;
			rev = rev*10+rem;
			num =num/10;

		}
		   num = temp;
			if(rev == num ){
	     		System.out.println(num+" is Palindrome ");
			}
			else{
				System.out.println(num+" is  Not Palindrome ");
			}		
	}
}

