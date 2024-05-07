// WAJP to println Special Number 1 to 5000

class SpecialN5000 
{
	public static void main(String[] args) 
	{
		System.out.println("Special number into 1 to 5000");  
		for( int num =1; num<= 5000 ;num++ )
		{
			 int temp = num;
			 int sum =0;
			
			 while (num !=0)
			 {
				int rem = num%10;
			//	System.out.println("println remainder " +rem);

				int f =1;
				for (int j = 1;j<=rem ;j++ )
				{ 
					f = f*j;
				}
				sum=sum+f;
			//	System.out.println("factorial "+sum);
			    num = num/10;
			 } 
		
			num = temp;
			if (num == sum)
			{
				System.out.println(num+" is a Special Number");
			}  
        }
	}
}
