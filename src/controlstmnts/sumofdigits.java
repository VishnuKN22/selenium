package controlstmnts;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
	/*	int a=145, b,c,d;
		b=a%10;
		c=(a%100)/10; 
		d= (a%1000)/100;
		System.out.println(b+c+d);*/
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int r,s=0;
		while(num>0) {
		r=	num%10;
		s=s+r;
		num=num/10;
		
			
			
		}
		System.out.println(s);
		

	}

}
