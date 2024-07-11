package oopspkg;

class animal
{
	public void animal()
	{
		System.out.println("animals");
	}
}
 class tiger extends animal
 {
	 public void tiger()
	 {
		 System.out.println("tiger");
	 }
 }
 class lion extends animal
 {
	 public void lion()
	 {
		 System.out.println("lion");
	 }
 }


public class heria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    tiger ob = new tiger();
    ob.animal();
    ob.tiger();
    lion ob1 =new lion();
    ob1.lion();
   
	}

}
