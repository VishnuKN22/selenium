package array;

public class palindromstring {

	public static void main(String[] args) {
		String s="malayalamm";
		String temp="";
		for (int i = s.length()-1; i>=0;i--) {
			  temp = temp + s.charAt(i);
        }
		if(s.equals(temp)) {
			System.out.println("plindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
