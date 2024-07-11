package Test;

public class revstring {

	public static void main(String[] args) {
	
		 String s = "vishnu";  
	        String s1 = "";    
	    
	        for(int i = s.length()-1; i >= 0; i--){    
	            s1 = s1 + s.charAt(i);    
	        }    
	            
	      
	        System.out.println("Rev=" + s1);    
	}

}
