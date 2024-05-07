/*   WAJP for below requirement 
 (a)  find the speed of bike 
 (b)  find the distance travl by bike 
 (c)  find the time taken by bike 
 (d)  Take the input from the user
 (e)  prun 1 to contine any other Charecter Stop


*/



import java.util.Scanner;
class Bike 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
		int speed;
		int distance;
		int time;

		System.out.println("PRESS 1 FIND DISTANCE OF Bike ");
		System.out.println("PRESS 2 FIND TIME TAKEN TO TRAVEL");
		System.out.println("PRESS 3 FIND SPEED OF THE Bike ");

		int a = sc.nextInt();
        
		switch(a)
		{
		case 1 :
			System.out.print("Enter Speed in km :  " );
			speed = sc.nextInt();
			System.out.print("Enter Time in hr  :  ");
			time = sc.nextInt(); 
			int dis = speed * time;
			System.out.println("Your distance of Bike is : " + dis + " km.");
			 break;

        
		case 2 :

            System.out.print("Enter Distance in km :  " );
			distance = sc.nextInt();
			System.out.print("Enter Speed in km  :  ");
			speed = sc.nextInt(); 
			int t = distance / speed;
			System.out.println("Your time of Bike is : " + t + " hr");
			break;


		case 3 :
			System.out.print("Enter Distance in km :  " );
			distance = sc.nextInt();
			System.out.print("Enter Time in hr  :  ");
			time = sc.nextInt(); 
			int s = distance / time;
			System.out.println("Your Speed of Bike is : " + s + " km/hr");
		    break;
		
		default :
			System.out.println("Please enter Valid option");
		 break;
		}
	}
}
