package controlstmnts;

public class nestedif {

	public static void main(String[] args) {
		int age=40,wt=60;
		if(age>18) {
			if(wt>55)
			{
				System.out.println("can donate blood");
		    }
			else
			{
				System.out.println(" cannot donate blood wt is less than 55");
			}
			
		}
			else
				System.out.println("cannot donate blood age is less than 18");
	}

}
