class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0) {
            int X = sc.nextInt();
            if (X<=1000) {
                System.out.println("100");
            } else {
                System.out.println(X/10);
            }
        }
	}
}
