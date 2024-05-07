/*  WAJP below the requirement 
(a) create and appliction to book movie tickets
(b) refer book my show app to design the app  
*/

import java.util.Scanner;
class BookMovieTickets 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("\n******* Book Movie Tickets *******\n");
        int a ;
		do{
			System.out.println("## Select Locations ## \n * Press any Number *\n ");
			System.out.println(" 1. Delhi\n 2. Noida\n 3. Gurugram ");
		    int selLoc = sc.nextInt();
		    if (selLoc == 1 || selLoc == 2 || selLoc == 3 )
		    {
			
				System.out.println("\n * Select Movies and Press any Number  ");
				System.out.println(" 1 Dunki\n 2 Salaar\n 3 12th Fail\n 4 SAM Bahadur\n 5 Animal");
				int selMovie = sc.nextInt();
				if (selMovie == 1 || selMovie == 2 || selMovie == 3 || selMovie == 4 ||selMovie == 5)
				{
				
				
						System.out.println("\n *** Book Now ***\n * Select Language *");
						System.out.println(" 1. Hindi\n 2. English\n 3. Telugu");
						int selLanguage = sc.nextInt();
				        if (1 == selLanguage || 2 == selLanguage || 3 == selLanguage)
				        {
							System.out.println("\n * Select Cinemas * ");
							System.out.println(" 1. Fun Cinemas, Delhi\n 2. INOX Cinemas\n 3. Miraj Cinemas\n 4. M Cinemas\n 5. PVR Premiere Cinemas");
							int selCinema = sc.nextInt();
							if (1 == selCinema ||2 == selCinema ||3 == selCinema ||4 == selCinema ||5 == selCinema)
							{
						        System.out.println("\n ** Select Seats **");
								System.out.println("\n # Platinum: 250rs");
								System.out.println(" F. 51 52 53 54 55 56 57 58 59 60 \n E. 41 42 33 44 45 46 47 48 49 50");
								System.out.println("\n # Gold:200rs/-");
								System.out.println(" D. 31 32 33 34 35 36 37 38 39 40 \n C. 21 22 23 24 25 26 27 28 29 30");
								System.out.println("\n # silver:150rs/-");
								System.out.println(" B. 11 12 13 14 15 16 17 18 19 20 \n A. 1 2 3 4 5 6 7 8 9 10");
								System.out.print("\n # How many tickets you want to book: ");
								
								int selSeats = sc.nextInt();
								if (selSeats >1 || 60 < selSeats)
								{
								   System.out.print("\n ** Select Category ** \n1. Platinum:250rs/- \n2. Gold:200rs/- \n3. silver:150rs/- \nselect by number:");
								   int selCat = sc.nextInt();
								   if (selCat >1 || 3 < selCat)
									{
									   if (selCat == 1)
									   {
										    int a1 = selSeats * 250 ;
										    System.out.println("You selected "+selSeats+" ticket for Platinum \nToatal amount: " + a1+"rs");
											System.out.print("Press \"1\" for confirm:");
											int op = sc.nextInt();
											if (op==1)
											{
											  System.out.println("Booking Successful Enjoy Your Movie.");
											}
											else
											{
											  System.out.println("sorry payment not successful try again....");
											}
										}
									   else if (selCat == 2)
									   {
										    int a2 = selSeats * 200 ;
										    System.out.println("You selected "+selSeats+" ticket for Platinum \nToatal amount: " + a2+"rs");
											System.out.print("Press \"1\" for confirm:");
											int op = sc.nextInt();
											if (op==1)
											{
											  System.out.println("Booking Successful Enjoy Your Movie.");
											}
											else
											{
											  System.out.println("sorry payment not successful try again....");
											}
										}
										else if (selCat == 3)
									      {
										    int a3 = selSeats * 150 ;
										    System.out.println("You selected "+selSeats+" ticket for Platinum \nToatal amount: " + a3+"rs");
											System.out.print("Press \"1\" for confirm:");
											int op = sc.nextInt();
											if (op==1)
											{
											  System.out.println("Booking Successful Enjoy Your Movie.");
											}
											else
											{
											  System.out.println("sorry payment not successful try again....");
											}
										}	            
								}
								else {
									System.out.println("Invaild Categary");
								}
							}
							else{
								System.out.println("Invaild Seats");
							}
						}
				    }
				}
			}
			a = sc.nextInt();
			}
           	while (1 == a);
	}
}


