// WAJP  to obtain product od even digits present in the gven number


import java.util.Scanner;
class ProducteOfEven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The  Number ");

		int num = sc.nextInt();
		int rem = 0;
		int prdt = 1;
		while(num>0){
			rem = num%10;
			if(rem%2==0){
				prdt = prdt * rem;
				
			}
			num = num/10;
		}
		System.out.println("Product of even Digits : " +prdt);
		
	}
}
