import java.util.Scanner;
import java.util.Random;
public class DiceRoller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!\n");

		Random die1 = new Random();
		Random die2 = new Random();
		System.out.println("How many sides should each dice have?  :");
		int sides = scanner.nextInt();
		int counter;
		String answer;

		do {

			System.out.println("How many Rolls would you like to take?  :");
			int howManyRolls = scanner.nextInt();

			for (counter = 0; counter < howManyRolls; counter++) {

				int rollNumber = counter + 1;
				int x = die1.nextInt(sides); 
				x++;
				System.out.println("On Roll Number" + "Die 1 Rolled a: " +x);

				int y = die2.nextInt(sides); 
				y++;
				System.out.println("On Roll Number" + "Die 2 Rolled a: " +y);
				System.out.println("");

			}

			System.out.print( "Would you like to roll the dice(y/n)");
				answer=scanner.next();
		}while (answer.equalsIgnoreCase("Y"));





	}
}



