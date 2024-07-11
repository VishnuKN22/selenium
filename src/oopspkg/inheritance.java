package oopspkg;

import java.util.Scanner;

class member
{
	public void member()
	{
		System.out.println("enter the name");
        Scanner sc=new Scanner(System.in);
         String s= sc.nextLine();
         System.out.println("age");
         int age= sc.nextInt();
         System.out.println("phno");
         int phno= sc.nextInt();
         System.out.println("addr");
         String ad= sc.nextLine();
         System.out.println();
         
	}
}

class employee extends member
{
	public void employee()
	{
		System.out.println("datamember spl");
		 Scanner sc1=new Scanner(System.in);
		String s2= sc1.nextLine();
		System.out.println("dept");
		String de=sc1.nextLine();
	}
	
	
}

class manager extends member
{
	public void manager()
	{
		System.out.println("datamember spl");
		 Scanner sc2=new Scanner(System.in);
		String s3= sc2.nextLine();
		System.out.println("dept");
		String de1=sc2.nextLine();
	}
	
	
}




public class inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		manager ob =new manager();
	
		ob.member();
		ob.manager();
	
	
	employee ob1= new employee();
	
	ob1.member();
	ob1.employee();


	}

}
