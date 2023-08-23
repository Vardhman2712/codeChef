import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            HashSet<Integer> a = new HashSet<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int element = sc.nextInt();
                if (a.contains(element)) {
                    a.remove(element);
                } else {
                    a.add(element);
                }
                max = Math.max(max, a.size());
            }
            System.out.println(max);
        }
    }
}
