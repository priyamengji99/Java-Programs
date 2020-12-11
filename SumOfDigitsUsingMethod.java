
public class SumOfDigitsUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=12345;
		sum(n1);
	}
	static void sum(int n)
	{
		int rem=0,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("the sum of digits :"+sum);
	}

}
