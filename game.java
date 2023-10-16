package Lab4;

import java.util.Random;
import java.util.Scanner;

public class game {
	static final int Olserod = 0, Knarrevik = 1, Utespelare = 2, Yngvar = 3, Melltorp = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

choices();

}
	public static String choices() {
		{
	     Scanner input = new Scanner(System.in);

	     while (true) {
	          System.out.println("Would you like to play a round? Type Yes or No");

	          String choice = input.next();
	     
	          if (choice.equalsIgnoreCase("Yes")) {
	              game(); 
	              // Call your game logic here
	          } else if (choice.equalsIgnoreCase("No")) {
	              return null;// Exit the loop if the choice is "No"
	          } else {
	              System.out.println("Invalid choice. Please type Yes or No.");
	              choices();
	          }
	     // }}
		return null;
	    }}
	}
	public static String game() {
;
		
		System.out.println("Melltorp beats Utespelare, Olserod");
		System.out.println("Utespelare beats Knarrevik, Yngvar");
		System.out.println("Knarrevik beats Melltorp, Olserod");
		System.out.println("Olserod Beats Yngvar, Utespelare");
		System.out.println("Yngvar beats Melltorp, Knarrevik");
		
		System.out.println("To make a move, enter one of the following: Olserod, Knarrevik, Utespelare, Yngvar, or Melltorp");
		Scanner input1 = new Scanner(System.in);
		String move = input1.next();
		
					
			if (move.equalsIgnoreCase("Olserod")) {
				System.out.println("The user's move is: Olserod");
				randomizer(move);
				
				}
			else if (move.equalsIgnoreCase ("Knarrevik")) {
				System.out.println("The user's move is: Knarrevik");
				randomizer(move);
				
			}
			else if (move.equalsIgnoreCase ("Utespelare")) {
				System.out.println("The user's move is: Utespelare ");
				randomizer(move);
				
			}
			else if (move.equalsIgnoreCase ("Yngvar")) {
				System.out.println("The user's move is: Yngvar");
				randomizer(move);
				
			}
			else if (move.equalsIgnoreCase("Melltorp")) {
				System.out.println("The user's move is: Melltorp");
				randomizer(move);
				}
			else {
				System.out.println("Invalid choice, try again");
				game();
					}
		return move;
		
	}
			// TODO Auto-generated method stub
		public static void randomizer(String move) {
		
		String [] moves = {"Olserod", "Knarrevik", "Utespelare", "Yngvar", "Melltorp"};
		
		Random r = new Random(); 
		int cpuMove =  r.nextInt(moves.length);
		// use constants instead of magic numbers, define universal constants
		if (cpuMove == Olserod) {
			System.out.println("The computer's move is: Olserod");
			winner(move, cpuMove);
		}
		if (cpuMove == Knarrevik) {
			System.out.println("The computer's move is: Knarrevik");
			winner(move, cpuMove);
		}
		if (cpuMove == Utespelare) {
			System.out.println("The computer's move is: Utespelare");
			winner(move, cpuMove);
		}
		
		if (cpuMove == Yngvar) {
			System.out.println("The computer's move is: Yngvar");
			winner(move, cpuMove);
		}
		if (cpuMove == Melltorp) {
			System.out.println("The computer's move is: Melltorp");
			winner(move, cpuMove);
		}
		return;
		}
	public static void winner(String move, int cpuMove) {
		
		if ((move.equalsIgnoreCase("Olserod") && cpuMove == Melltorp) || (move.equalsIgnoreCase("Olserod") && cpuMove == Utespelare)) {
			System.out.println("The winner is the user!");
	}
		else if ((move.equalsIgnoreCase("Yngvar") && cpuMove == Utespelare) || (move.equalsIgnoreCase("Yngvar") && cpuMove == Knarrevik)) {
			System.out.println("The winner is the user!");
		}
		
		else if ((move.equalsIgnoreCase("Olserod") && cpuMove == Knarrevik) || (move.equalsIgnoreCase("Olserod") && cpuMove == Melltorp)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Utespelare") && cpuMove == Olserod) || (move.equalsIgnoreCase("Utespelare") && cpuMove == Yngvar)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Knarrevik") && cpuMove == Yngvar) || (move.equalsIgnoreCase("Knarrevik") && cpuMove == Melltorp)) {
			System.out.println("The winner is the user!");
		}
		////// sub game rules
		else if ((move.equalsIgnoreCase("Melltorp") && cpuMove == Utespelare)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Utespelare") && cpuMove == Knarrevik)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Knarrevik") && cpuMove == Melltorp)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Olserod") && cpuMove == Yngvar)) {
			System.out.println("The winner is the user!");
		}
		else if ((move.equalsIgnoreCase("Yngvar") && cpuMove == Melltorp)) {
			System.out.println("The winner is the user!");
			}
		//////////////cpu 
		else if ((move.equalsIgnoreCase("Melltorp") && cpuMove == Olserod) || (move.equalsIgnoreCase("Utespelare") && cpuMove == Olserod)) {
			
			System.out.println("The winner is the cpu!");
	}
		else if ((move.equalsIgnoreCase("Utespelare") && cpuMove == Yngvar) || (move.equalsIgnoreCase("Knarrevik") && cpuMove == Yngvar)) {
			
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Knarrevik") && cpuMove == Olserod) || (move.equalsIgnoreCase("Melltorp") && cpuMove == Olserod)) {
			
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Olserod") && cpuMove == Utespelare) || (move.equalsIgnoreCase("Yngvar") && cpuMove == Utespelare)) {
			
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Yngvar") && cpuMove == Knarrevik) || (move.equalsIgnoreCase("Yngvar") && cpuMove == Knarrevik)) {
			
			System.out.println("The winner is the cpu!");
		}
		/////sub rules
		else if ((move.equalsIgnoreCase("Utespelare") && cpuMove == Melltorp)) {
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Knarrevik") && cpuMove == Utespelare)) {
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Melltorp") && cpuMove == Knarrevik)) {
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Yngvar") && cpuMove == Olserod)) {
			System.out.println("The winner is the cpu!");
		}
		else if ((move.equalsIgnoreCase("Melltorp") && cpuMove == Yngvar)) {
			System.out.println("The winner is the cpu!");
			}
		
		
		///ties
		else if ((move.equalsIgnoreCase("Melltorp") && cpuMove == Melltorp)) {
			System.out.println("This round is a tie!!");
		}
		else if ((move.equalsIgnoreCase("Utespelare") && cpuMove == Utespelare)) {
			System.out.println("This round is a tie!");
		}
		else if ((move.equalsIgnoreCase("Knarrevik") && cpuMove == Knarrevik)) {
			System.out.println("This round is a tie!");
		}
		else if ((move.equalsIgnoreCase("Olserod") && cpuMove == Olserod)) {
			System.out.println("This round is a tie!");
		}
		else if ((move.equalsIgnoreCase("Yngvar") && cpuMove == Yngvar)) {
			System.out.println("This round is a tie!");
		}
		while (true) {
			
			choices();
		}
		
	}
	
	



}
