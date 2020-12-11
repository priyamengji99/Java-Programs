
public class FunctionOverloadingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverloading op=new FunctionOverloading();
		int a=10,b=20;
		int res=op.addition(a,b);
		System.out.println(a+ "+"+b+"="+res);
		int p=6,q=8,r=10;
		int res1=op.addition(p,q,r);
		System.out.println(p+ "+"+q+"+"+r+"="+res1);
		

	}

}
