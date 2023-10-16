class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int m = sc.nextInt();
		    if(a>b)
		    {
		        int temp = a;
		        a = b;
		        b = temp;
		    }
		    int ans1 = a + (m-b);
		    int ans2 = b - a;
		    System.out.println(Math.min(ans1,ans2));
		}
	}
}
