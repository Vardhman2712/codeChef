class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            System.out.println((A * B) <= (X * Y) ? "YES" : "NO");
        }
        sc.close();
    }
}
