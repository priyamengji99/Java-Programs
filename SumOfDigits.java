
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,temp,sum=0,rem=0;
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("sum of all the digits is"+sum);

	}

}
