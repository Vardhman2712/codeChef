/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt(); // No. of Friends
            int M = scanner.nextInt(); // No. of Left Shoes

            if (M >= N) {
                System.out.println((N * 2) - N);
            } else {
                System.out.println((N * 2) - M);
            }

        }

        scanner.close();
	}
}
