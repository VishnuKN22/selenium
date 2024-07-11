package oopspkg;

class father
{
	public void fathermethod()
	{
		System.out.println("father");
	}
}

class son extends father
{
	public void sonmethod() 
	{
		System.out.println("son");
	}
}

class grndson extends son
{
	public void grndson()
	{
		System.out.println("grndson");
	}
}
public class mulitilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     grndson ob = new grndson();
     ob.fathermethod();
     ob.sonmethod();
     ob.grndson();
	}

}
