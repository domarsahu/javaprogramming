// WAJP to check weather given number is Division by 2 and 4

class DiviBY 
{
	public static void main(String[] args) 
	{
		int a = 2;
        if (a % 2 == 0)
        {
			System.out.println(" Diviable by 2 : " + a);
        }
		if (a % 4 == 0)
		{
			System.out.println(" Diviable by  4 : " + a);

		}
		else if(a==2){
			System.out.println("Your number is not divisible by 4.");
			
		}
		else
		{
			System.out.println(" Not Diviable by 2 and 4 :");
		}
		
	}
}
