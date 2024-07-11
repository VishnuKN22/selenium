package Access;


abstract class car
{
	abstract public void acc();
	abstract public void  speed();
	public void color()
	{
		System.out.println("red");
	}
}

class kai extends car
{@Override
public void speed() {
	System.out.println("kia speed");
}

@Override
public void acc() {
	// TODO Auto-generated method stub
	System.out.println("kai acc");
}
	
}


class BMW extends car
{

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("bmw acc");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("bmw speed");
	}
	
}


public class Abstractcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
kai ob = new kai();
ob.speed();
ob.acc();
BMW ob1= new BMW();
ob1.acc();
ob1.color();
	}

}
