/* WAJP to check fiboncci Series 
   0 1 1 2 3 5 8 13 21 34
*/

class FiboncciSeries 
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int n3;
		for (int i = 1 ;i<= 10; i++ )
		{
		    System.out.println(n1);
			n3=n1+n2;//1//2
			n1=n2;//1//
			n2=n3;//1//2

		}
	}
}

/* from while loop 

        int n1 = 0;
		int n2 = 1;
		int count = 10;
		while(count>=1)
		{
		    System.out.println(n1);
			int temp =n1+n2;//1//2
			n1=n2;
			n2=temp;
			count--;
		}

*/