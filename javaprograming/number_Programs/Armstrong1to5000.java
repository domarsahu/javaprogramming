// WAJP to print Armstrong Number 1 to 5000

class Armst 
{
	public static void main(String[] args) 
	{
		for (num = 1 ; num<= 5000 ;num ++ )
		{
			int temp = num;
			int sum = 0;
			int powCount = 0;
			while (num!= 0)
			{
				int rem = num%10;
				powCount++;
				num = num/10;
			}
			num = temp;
			while (num !=0)
			{
				int rem = num %10;
				int p = 1;
				for (int i = 1; i<=powCount ; i++ )
				{
					p = p*rem;
				}
				sum = sum + p;
				num = num/10;
			}
            num = temp;
			if (num == sum)
			{
				System.out.println(num+" is Armstrong Number");
			}
		}
	}
}
