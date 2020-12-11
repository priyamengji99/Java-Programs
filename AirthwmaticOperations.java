
public class AirthwmaticOperations {
	
	int add(int a,int b)
	{
		int res=0;
		res=a+b;
		return res;
	
		
	}
	int sub(int a,int b)
	{
		int res1=0;
		res1=a-b;
		return res1;
	
		
	}
	int mul(int a,int b)
	{
		int res2=0;
		res2=a*b;
		return res2;
	}
	int div(int a,int b)
	{
		int res3=0;
		res3=a/b;
		return res3;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirthwmaticOperations op=new AirthwmaticOperations();
		System.out.println(op.add(10,20));
		System.out.println(op.sub(20,10));
		System.out.println(op.mul(10,5));
		System.out.println(op.div(10,2));
		
	
	}

}
