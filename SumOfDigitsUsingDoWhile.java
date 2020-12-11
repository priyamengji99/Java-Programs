
public class SumOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123,rem=0,sum=0;
		do
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}while(n!=0);
		System.out.println("the sum of digits are "+sum);

	}

}
