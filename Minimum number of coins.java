/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases

		while (t-- > 0) {
			int x = scanner.nextInt(); // Amount to be paid
			int numberOfFives = 0;
			int numberOfTens = 0;

			while (x >= 10) {
				x -= 10;
				numberOfTens++;
			}

			while (x >= 5) {
				x -= 5;
				numberOfFives++;
			}

			if (x == 0) {
				System.out.println(numberOfFives + numberOfTens);
			} else {
				System.out.println(-1); // It's impossible to pay the exact amount with 5 and 10 rupee coins
			}
		}
		scanner.close();
	}
}
