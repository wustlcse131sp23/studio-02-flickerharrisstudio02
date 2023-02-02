package studio2;

import java.util.Scanner;

public class Ruinn

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your starting amount");
		Scanner in = new Scanner(System.in);
		int startAmount = in.nextInt();
int initial = startAmount;

		System.out.println("Please enter your win chance amount");
		Scanner scan = new Scanner(System.in);
		double winChance = scan.nextDouble();
		System.out.println("Please enter your win limit amount");
		Scanner i = new Scanner(System.in);
		int winLimit = i.nextInt();

		System.out.println("Please enter total simulations");
		Scanner e = new Scanner(System.in);
		int totalSimulations = e.nextInt();
		
		
		for (int j = 1; j <= totalSimulations; j++) {
			int x = 0;
			startAmount = initial;
			while ((startAmount != winLimit) && (startAmount > 0)) {

				if (winChance >= Math.random()) {

					++startAmount;

				}

				else {
					--startAmount;

				} 
				++x;
			}

			if (startAmount == winLimit) {
				System.out.println("You have reached your limit." + winLimit + " was made. This was simulation "
						+ j + "Success!");
			} else {
				System.out.println("Ruin! this was simulation " + j + " Better luck next time.");
			}
		}

	}
}
