package NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1;
		int max = 100;
		int maxAttempts = 10;
		int score = 0;
		int rounds = 0;
		int userguess = 0;
		System.out.println("-------- Welcome to the Number Guessing Game! --------");

		while (true) {
			Random rand = new Random();
			int randomNum = rand.nextInt(max);
			int attempts = 0;

			System.out.println("\n* Guess the number between " + min + " and " + max + ".");
			System.out.println("* You have " + maxAttempts + " attempts.");

			while (attempts < maxAttempts) {
				System.out.println("\nAttempt " + (attempts + 1) + ":");
				System.out.println("Enter your guess :");
				userguess = sc.nextInt();
				attempts++;

				if (userguess < randomNum) {
					System.out.println("Your guess is too low! Guess again..");
				} else if (userguess > randomNum) {
					System.out.println("Your guess is too high! Guess again..");
				} else {
					System.out.println("\n------------ Congratulations! ------------");
					System.out.println("You've guessed the number " + randomNum + " in " + attempts + " attempts.");
					score++;
					break;
				}
			}
			if (attempts == maxAttempts && userguess != randomNum) {
				System.out.println("\nSorry, you've run out of attempts.");
				System.out.println("The correct number was " + randomNum + ".");
			}
			rounds++;

			System.out.print("\nDo you want to play another round? (y/n): ");
			String playAgain = sc.next().toLowerCase();
			if (!playAgain.equals("y")) {
				break;
			}
		}
		System.out.println("\n---------------- Game Over! ----------------");
		System.out.println("You played " + rounds + " rounds and your score is " + score + ".");
		System.out.println("\n     ******* Thanks for playing! *******     ");
		sc.close();
	}
}
