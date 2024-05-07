/* WAJP for below requirement 
(a)  program to depusit and withraw cash
(b)  Ask the user to enter the amount to be dupositer
(c)  Display the balance amount 
(d)  Ask user to enter the money to withdraw
(c)  if password is 1234 perform all the above operation else display incorit pin
(f)  To contine the program again pgain prun 'Y/y' to contine 

*/

import java.util.Scanner;
class BankProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double balance = 0.0;
		char status;

		System.out.println("***** CHILDRAN BANK *****");
		System.out.println("Enter the pin");
		int pin = sc.nextInt();
		if (pin == 1234)
		{
			do{
				System.out.println("press 1 to Deposit");
			    System.out.println("press 2 to Withdraws");
				System.out.println("press 3 to Balance Equity");
				System.out.println("Enter your Choice");

				int choice = sc.nextInt();
 
				switch (choice)
				{
				case 1:{ 
					System.out.println("Enter the amout to be deposites");
					double amount = sc.nextDouble();
					balance = balance + amount;
					System.out.println("Ammout is successfully deposited");
					System.out.println("Awailble balance is :  " + balance);
				}
				break;

				case 2:{
					System.out.println("Enter the pin");
					int pincode = sc.nextInt();
					if (pincode == 1234)
					{
						System.out.println("Enter the amount to be withdraow");
						double amount = sc.nextDouble();
						if(amount <= balance)
						{
							balance = balance - amount;
							System.out.println("Available balance is : "+ balance);
							System.out.println("Place collect cash and trasation complected successfully");
						}
						else
						{
							System.out.println("insufficient funls");
						}
					}
					else 
					{
						System.out.println("Incarrect pin");
					}
				     }
				break;

                case 3: 
					System.out.println("Your Balance in account is : "+ balance);
				break;


				default : 
					System.out.println("Invaild choice");
					
				}
				System.out.println("Enter Y/y to repeat Transactions");
				System.out.println("Enter any character to stop");
                
				status = sc.next().charAt(0);
				}
				while (status =='Y' || status == 'y');
				
			
             
			}
		
	
		}	
		
	}

