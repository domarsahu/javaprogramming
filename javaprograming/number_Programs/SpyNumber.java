/* WAJP to print Spy Number 
Spy Number:- if number and its sumation and product is
     equvation then it is Spy Number

     127 
 
*/

class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num = 132;
		int sum = 0;
		int pro = 1;
		int temp = num;
		while (num!=0)
		{
			int rem = num%10;
			sum = sum + rem;
			num= num/ 10;
		//num = temp;
		}
		num = temp;
		while (num!= 0)
		{
		    int rem = num%10;
			pro =pro*rem;
			num = num/10;
		}
		num= temp;
		if (sum == pro)
		{
			System.out.println(num + " is Spy number");
		}
		else 
		{
			System.out.println(num + " is not Spy Number");
		}
		
	}
}
