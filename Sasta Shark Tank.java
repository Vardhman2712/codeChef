import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a * 100 / 10;
            int d = b * 100 / 20;
            if (c > d) {
                System.out.println("FIRST");
            } else if (c < d) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
	}
}
