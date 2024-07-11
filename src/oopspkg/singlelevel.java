package oopspkg;

class parent
{
	public void parentmethod()
	{
		System.out.println("parent");
	}
	
}

class child extends parent
{
	public void childmethod()
	{
		System.out.println("child");
	}
}


public class singlelevel {

	public static void main(String[] args) 
	{
		
       child ob = new child();
       ob.childmethod();
       ob.parentmethod();
	}

}
