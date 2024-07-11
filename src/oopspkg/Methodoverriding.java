package oopspkg;

class shape
{
	public void draw()
	{
		System.out.println("draw a circle");
	}
}


class square extends shape
{

	@Override
	public void draw() 
	{
		
		super.draw();
	
			  System.out.println("draw square");
		  
	}
	
  
}



public class Methodoverriding {

	public static void main(String[] args) {

		square ob = new square();
		ob.draw();
	}

}
