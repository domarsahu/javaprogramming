//WAJP to count only odd digits in the given number


import java.util.Scanner;
class CountOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem = 0;
		int count = 0;
		while(num != 0){
			rem = num%10;
			num =num/10;

			if(rem%2!=0){
				count++;	
				System.out.println(rem);
			}
			
		}
		System.out.println("Your odd digit is : " + count);
	}
}
