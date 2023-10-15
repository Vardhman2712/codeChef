class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
            double result = x * 1.07; 
            if(result<y){
                System.out.println("no");
            }else{
                System.out.println("yes");
            }
		}
	}
}
