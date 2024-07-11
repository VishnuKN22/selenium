package stringpkg;

import java.util.Scanner;

public class Endswith {

	public static void main(String[] args) {
		
		System.out.println("enter the strings");
        Scanner sc=new Scanner(System.in);
         String s= sc.nextLine();
     
		
     	System.out.println(s.endsWith("language"));
	}

}
