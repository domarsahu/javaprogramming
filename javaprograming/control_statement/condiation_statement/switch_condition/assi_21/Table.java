/* WAJP for below repuirement
(a) find the speed of bike 
(b) find the distance travl by bike 
(c) find the time taken by bike 
(d) take the input from the user
(e) prun 1 to continue any other charcter stop


*/


import java.util.Scanner;
class Table 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Table Number");
        int t = sc.nextInt();

		System.out.println("Enter a Minimum Limit ");
		int mi = sc.nextInt();
		System.out.println("Enter a Maximum Limit ");
		int mx = sc.nextInt();
		
		
     // for (int i = mi ; i<= mx ; i++)
		for (int  i = mi; mi<= mx ; mi++)
		{
			int ans = t*mi;
	        System.out.println(t + " X " +mi+ " = " + ans );
        // System.out.println("["+t+ " X "+i+" = "+(t*i)+" ]");    

		}

	}
}
