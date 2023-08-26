/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            int cars = N / 4; // Number of cars needed for full capacity
            if (N % 4 != 0) {
                cars++; // Increment cars if there are remaining friends
            }

            System.out.println(cars);
        }
        sc.close();
	}
}
