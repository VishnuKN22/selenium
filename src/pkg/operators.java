package pkg;

public class operators {

	public static void main(String[] args) {
	System.out.println("arithmetic operators");
	
	int a=20,b=10;
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a/b="+(a/b));
	System.out.println("a%b="+(a%b));
	
	System.out.println("assignment operators");
	System.out.println(a+=b);// a= a+b 20+10=30
	System.out.println(a-=b);
	System.out.println(a/=b);
	System.out.println(a%=b);
	
	
	System.out.println("relational operators");
	int d=10,e=20;
	System.out.println(d==e);
	System.out.println(d>e);
	System.out.println(d>=e);
	System.out.println(d<=e);
	System.out.println(d<e);
	System.out.println(d!=e);
	
	System.out.println("logical operators");
	
	String username="abc";
	String pswd="a123";
	
	System.out.println(username=="abc"&&pswd=="a123");
	
	System.out.println(username=="abc"&&pswd=="123");
	System.out.println(username=="abc"||pswd=="123");
	System.out.println(!(username=="abc"));
	
	System.out.println("urinary operators");
	
	int v=10;
	System.out.println(v++);//op=10
	System.out.println(v);//op=11
	System.out.println(v++);//op=11
	System.out.println(++v);//op=13
	System.out.println(v--);
	System.out.println(v);
	System.out.println(v--);
	System.out.println(--v);
	
	System.out.println("ternary operators");
	
	//varible = condition? exp1:exp2;
	String ans=d>e?"d is greater":"e is greater";
	System.out.println(ans);
	
	
	
	
	}

}
