import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(); // Fix 1: Change nextByte() to nextInt()
            if (N % 4 == 0) { // Fix 2: Check if N is divisible by 2, not T
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }
    }
}
