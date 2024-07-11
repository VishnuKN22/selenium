package pkg;

public class swithcal {

	public static void main(String[] args) {
		int  a=5,b=6;
		 char choice='+';
		switch(choice) 
		{
		case '+': 
			System.out.println("sum"+(a+b));
		break;
		case '-': 
			System.out.println("sub"+ (a-b));
		break;
		case '/': 
			System.out.println("div"+(a/b));
		break;
		case '*': 
			System.out.println("mul"+(a*b));
		break;
		default: System.out.println("invalid");
		break; 
		
		}

	}

}
