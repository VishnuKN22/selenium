package oopspkg;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Methodoverloading ob= new Methodoverloading();
		 ob.add();
		ob.add(10, 20);
		ob.add(6.9,20);
		ob.add(20, 12.90);

	}
	
	public void add() 
	{
		int a=1,b=2,c;
		c=a+b;
		System.out.println("c="+c);
	}
	public void add(int a, int b) 
	{
		
		int c=a+b;
		System.out.println("c="+c);
	}
	
	public void add(int a, double b) 
	{
		
	  double c=a+b;
		System.out.println("c="+c);
	}
	

	public void add(double a, int b) 
	{
		
	  double c=a+b;
		System.out.println("c="+c);
	}
	

}
