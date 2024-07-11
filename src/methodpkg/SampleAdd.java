package methodpkg;

public class SampleAdd {

	public static void main(String[] args) {
		SampleAdd  ob = new SampleAdd();
		ob.add();
		int s =ob.sub();
		System.out.println("Sub="+s);
		ob.mul(20, 30);
		double div= ob.div(20, 10);
		System.out.println("div="+div);
		
	}
	// method without parameter and without return type
	
	public void add()
	{
		int a=20,b=30,c;
		c= a+b;
		System.out.println("sum="+c);
	}
	//method return type and without parameter
	
	public int sub() {
		int a=20,b=10,c;
		c=a-b;
		return c;
	}
	//method without return type and with parameter
	
	public void mul(int a,int b )
	{
		int c= a*b;
		System.out.println("mul="+c);
	}
	// method with return type and with parameter
	public double div(int a, int b) 
	{
		double c = a/b;
		return c;
		
	}
	
}
