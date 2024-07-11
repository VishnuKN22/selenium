package controlstmnts;

import java.util.Scanner;

public class Scannercal {

	public static void main(String[] args) {
		System.out.println("enter the first number");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("enter the second number");
		int b= sc.nextInt();

        char choice = sc.next().charAt(0);
			switch(choice) {
			
		
	
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
	
}}
