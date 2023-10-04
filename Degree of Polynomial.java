class Codechef
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of terms in the polynomial

            int maxPower = -1; // initialize the maximum power

            // Loop to read coefficients and find the maximum power
            for (int i = 0; i < n; i++) {
                int coefficient = scanner.nextInt();
                if (coefficient != 0) {
                    maxPower = i;
                }
            }

            System.out.println(maxPower);
        }
    }
}
