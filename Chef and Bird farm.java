import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            
            if(Z % X == 0 && Z % Y == 0) {
                System.out.println("Any");
            } else if (Z % X == 0) {
                System.out.println("Chicken");
            } else if (Z % Y == 0) {
                System.out.println("Duck");
            } else {
                System.out.println("None");
            }
        }
	}
}
