// WAJP to check weather the given number is even ,odd and grather then 0

class GreaterZero 
{
	public static void main(String[] args) 
	{
		int a = 0;
		if(a % 2==0 && a>0)
        {
           System.out.println(a + " number is even and grater than 0.");
		}
		else if(a==0){
              System.out.println(" your number is equal to zero.");	
		}
		else
		{
		   System.out.println(a + " number is odd and not grater than 0.");	
		}
	}
}
