package stringpkg;

public class Strngpgm {

	public static void main(String[] args) {
		
		String s="hy";
		String s1="welcome";
		String s2="hello welcome";
		String s3= new String("hy");
		// concat
		
		System.out.println(s.concat(s1));
		System.out.println(1+s1+3+4);
		
		
		//equals
		
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//tolowercase
		//touppervase
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//length
		
		System.out.println(s2.length());
		
		//startswith endwith
		
		System.out.println(s1.startsWith("hy"));
		System.out.println(s2.endsWith("welcome"));
		
		//trim
		System.out.println(s3.trim());
		
		//replace
		
		System.out.println(s2.replace("hello", "hy"));
		
		//contains
		System.out.println(s3.contains("welcome"));
		
		//split
		 
		String[] ar=s2.split(" ");
		for(String a:ar) {
			System.out.println(a);
		}
		
		//substring
		
		System.out.println(s2.substring(1, 5));
		
		//charAt
		
		System.out.println(s1.charAt(1));
		
		//tocharArray
		char[] c= s1.toCharArray();
		for (char c1:c)
		{
			System.out.print(c1);
		}
		
	}

}
