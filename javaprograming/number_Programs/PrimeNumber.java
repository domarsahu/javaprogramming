/* WAJP to cheak Prime Number 
prime number :-   Number is which is divisable by itself.
 5 = 1, 5 
 count++
*/
import java.util.Scanner;
class PrimeNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1 ; i<=num ; i++)
		{
			if(num%i==0)
            {
				count++;
            }
		}
		if (count==2)
		{
		    System.out.println(num+" is a Prime Number");
			}
			else
		{
			System.out.println(num+ " is a Not Prime Number");
		}
	}
}
