/**
 * @author namagiri sridhar
 *
 */
import java.util.*;
public class game 
{
	public static void main(String[] args)
	{
		   String user;
		   String computer = "rock";
		   Scanner myObj = new Scanner(System.in);
		   System.out.print("Do you want to play a game of Rock Paper Scissors y/n?: ");
		   char ask = (myObj.nextLine().trim().toLowerCase()).charAt(0);
		   if(ask=='y')
		   {
			   while(true)
			    {
				   System.out.print("Enter Rock, Paper or Scissors:");
				   user =(myObj.nextLine().trim().toLowerCase());
				   switch((int)(Math.floor((Math.random() * 3) + 1)))
			        {
			            case 1:
			            	System.out.println("Computer selected Rock"); computer = "rock" ; break;
			            case 2:
			            	System.out.println("Computer selected Paper"); computer = "paper"; break;
			            case 3:
			            	System.out.println("Computer selected Scissors");computer = "scissors"; break; 
			        }
				   if (user.equals(computer))
			        {
			            System.out.println("Draw");
			        }
			        else if (
			        		user.equals("paper") && computer.equals("rock")
			        		||user.equals("rock") && computer.equals("scissors")
			                || user.equals("scissors") && computer.equals("paper")
			            )
			        {
			            System.out.println("You win!!");
			        }   
			        else
			        {
			            System.out.println("I win!! HA HA");
			        }
				   System.out.print("Wanna play again y/n?: ");
				   if((myObj.nextLine().trim().toLowerCase()).charAt(0) == 'n')
					   break;
			    }
				 System.out.println("See you soon");

		}
				 
		   }
	}


