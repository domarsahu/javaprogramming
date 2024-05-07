class Evensum 
{
	public static void main(String[] args) 
	{
		int sum = 0 ;
		for (int i =1;i<=20 ;i++ )
		{
			if (sum %2 ==0)
			{
				sum += i;
			}
			System.out.println(sum);
		
		}
	}
}
