class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0) {
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        int D = sc.nextInt();
	        System.out.println((C>=A)&&(D>=B)?"POSSIBLE":"IMPOSSIBLE");
	    }
	}
}
