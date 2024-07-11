package array;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int ar[]= new int[3];
		int sum=0;
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			ar[i]=sc.nextInt();
			sum=ar[i]+sum;
	}
		System.out.println(sum);
}
}