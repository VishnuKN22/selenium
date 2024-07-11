package methodpkg;

public class Area {

	public static void main(String[] args) {
		 Area ob =new  Area();
		 ob.rect();
		 double ar =ob.cir();
			System.out.println("Sub="+ar);
			 ob.sqr(4);
			 double a= ob.tri(10, 5);
			 System.out.println("triangle="+a);
	}
	public void rect()
	{
		int a=20,b=30,c;
		c= a*b;
		System.out.println("rectangle="+c);
	}
	
	public double cir() 
	{
		int r=10;
		double a=3.14*r*r;
		return a;
	}
	
	public void sqr (int a) 
	{
		int b= a*a;
		System.out.println("squ"+b);
	}
	
	public double tri(int b,int h)
	{
		double a= .5*b*h; 
		return a;
	}
}
	
