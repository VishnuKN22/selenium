package array;

public class Split {

	public static void main(String[] args) {
		String s="Testing trainig centre";
		String s1="hello world";
		String[] ar=s.split(" ");
		for( int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
// hello world		
		System.out.println(s1.replace("hello", "hy"));
		
	
		
		
	}

}