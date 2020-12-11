
public class GreatestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=17,c=10;
		greatest(a,b,c);

	}
	static void greatest(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a+ " is greatest among 3");
		}
		else if(b>c)
		{
			System.out.println(b+ " is greatest among 3");
		}
		else
		{
			System.out.println(c+" is greatest among 3");
		}
	}
}
