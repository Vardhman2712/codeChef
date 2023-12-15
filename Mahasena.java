class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c1 = 0, c2 = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] % 2 == 0) {
                c1++;
            } else {
                c2++;
            }
        }

        if (c1 > c2) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

        scanner.close();
	}
}
