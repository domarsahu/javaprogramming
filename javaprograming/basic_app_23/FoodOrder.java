/* WAJP for below requrement
(1) create a app to order food 
(2) display the menu for Restaurants
(3) Generate the bill for the order food 
 */

import java.util.Scanner; 
class FoodOrder 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println("\n******* The Domar Restaurants *******\n");
        int a ;
		do{
			System.out.println("## Select Locations ## \n * Press any Number *\n ");
			System.out.println(" 1. Delhi Restaurant\n 2. Noida Restaurant\n 3. Gurugram Restaurant");
		    int selLoc = sc.nextInt();
		    if (selLoc == 1 || selLoc == 2 || selLoc == 3 )
		    {
			
				System.out.println("\n * Select Menu and Press any Number  ");
				System.out.println(" 1 Pizza \n 2 Burger\n 3 Veg Biryani\n 4 Non Veg Biryani\n 5 Rolls\n 6 Thali");
				int selMenu = sc.nextInt();
				//if (selMovie == 1 || selMovie == 2 || selMovie == 3 || selMovie == 4 ||selMovie == 5 || selMovie ==6)
				if (selMenu == 1)
				{
					System.out.println(" Pizza - 199rs ");
					System.out.print("\n How Many Pizza order : ");
					int pizza = sc.nextInt();
					if (pizza > 1 || pizza < 100)
					{
						int a1 = pizza * 199;
						System.out.println(" Total Pizza Rupees : " +a1+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +pizza);
						  System.out.println(" Total Amount : "+a1+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
				else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
				}


				else if (selMenu == 2)
				{
					System.out.println(" Burger - 70rs ");
					System.out.print("\n How Many Burger order : ");
					int burger = sc.nextInt();
					if (burger > 1 || burger < 100)
					{
						int a2 = burger * 70;
						System.out.println(" Total Burger Rupees : " +a2+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +burger);
						  System.out.println(" Total Amount : "+a2+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
				else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
				}

				else if (selMenu == 3)
				{
					System.out.println(" Veg Biryani - 140rs ");
					System.out.print("\n How Many Veg Biryani order : ");
					int vb = sc.nextInt();
					if (vb > 1 || vb < 100)
					{
						int a3 = vb * 140;
						System.out.println(" Total Veg Biryani Rupees : " +a3+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +vb);
						  System.out.println(" Total Amount : "+a3+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
				else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
				}

				else if (selMenu == 4)
				{
					System.out.println(" Non Veg Biryani - 210rs ");
					System.out.print("\n How Many Non Veg Biryani order : ");
					int nvb = sc.nextInt();
					if (nvb > 1 || nvb < 100)
					{
						int a4 = nvb * 210;
						System.out.println(" Total Non Veg Biryani Rupees : " +a4+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +nvb);
						  System.out.println(" Total Amount : "+a4+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
				else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
				}


				else if (selMenu == 5)
				{
					System.out.println(" Roll - 60rs ");
					System.out.print("\n How Many Roll order : ");
					int roll = sc.nextInt();
					if (roll > 1 || roll < 100)
					{
						int a5 = roll * 60;
						System.out.println(" Total Roll Rupees : " +a5+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +roll);
						  System.out.println(" Total Amount : "+a5+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
				else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
				}

				else if (selMenu == 6)
				 {
					System.out.println(" Thali - 120rs ");
					System.out.print("\n How Many Thali order : ");
					int thali = sc.nextInt();
					if (thali > 1 || thali < 100)
					{
						int a6 = thali * 120;
						System.out.println(" Total Thali Rupees : " +a6+"Rs.");
						System.out.print("\n Press 1 Bill Generate : ");
						int op = sc.nextInt();
						if (op==1)
						{
						  System.out.println(" Total Order : " +thali);
						  System.out.println(" Total Amount : "+a6+"Rs");
						  System.out.println(" *** Food Ordering Successful *** ");
						}
						else
						{
						  System.out.println("Sorry Food Ordering Not Successful try again....");
						}
					}
					else {
						System.out.println(" ** You Can Buy Only 100 Plats **");
					}
                   }
			}
			
		 else {
				System.out.println(" **** Invaild Locations ***** ");
               }
			a = sc.nextInt();
		}
           	while (1 == a);
	}
}
