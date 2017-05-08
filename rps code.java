import java.util.Scanner; 
import java.util.Random; 
public class RockPaperScissor 
{ 
public static void main(String[] args) 
{ 
    String user; 
    String comp = ""; 
    int computer;  
    Scanner input = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Please enter a move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

    computer = generator.nextInt(3)+1; 

    if (computer == 1) 
       comp = "R"; 
    else if (computer == 2) 
       comp = "P"; 
    else if (computer == 3) 
       comp = "S"; 


    System.out.println("Whats your move: "); 
    user = input.next();

    System.out.println("Computer's move is: " + comp); 



    if (user.equals(comp)) 
       System.out.println("It's a tie!"); 
    else if (user.equals("R")) 
		{ if (comp.equals("S")) 
		      System.out.println("Rock crushes scissors.You win!!");
		
    else{
    	if(user.equals("P")) 
         System.out.println("Paper eats rock. You lose!!"); 
        }
		}
    else if (user.equals("P")) 
       {
    	if (comp.equals("S")) 
       System.out.println("Scissor cuts paper. You lose!!");
       
	    else{
	    	if(comp.equals("R")) 
	          System.out.println("Paper eats rock. You win!!"); 
	    	}
        }
    else if (user.equals("S")) 
       { 
    	if (comp.equals("P"))        
         System.out.println("Scissor cuts paper. You win!!"); 
         else{
        	 if(comp.equals("R")) 
            System.out.println("Rock breaks scissors. You lose!!");
             }
       }
    else 
         System.out.println("Invalid user input.");
}
}
