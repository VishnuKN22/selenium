package constructor;

public class sampleconstructor {
	int id;
	String name;
	
	public sampleconstructor(int id,String name)
	{
		this.id=id;
		this.name= name;
		
	}
	public static void main(String[] args) {
		
		sampleconstructor sa= new sampleconstructor(1,"vishnu");
	
		System.out.println(sa.id);
		System.out.println(sa.name);

	}

}
