package array;
import java.util.Scanner;
public class Stringarray {

	public static void main(String[] args) {
		String ar[]= new String[3];
		System.out.println("enter the names");
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++) {
	ar[i]=sc.nextLine();
	}
System.out.println("entered names are");
//for(int i=0;i<3;i++) {
	
	//System.out.println(ar[i]);
//}
for (String v:ar)
{
	System.out.println(v);
}
}
}
