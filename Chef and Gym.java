class Codechef
{
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			if (Z >= X + Y) {
				System.out.println("2");
			} else if (Z < X + Y && Z >= X) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
		sc.close();
	}
}
