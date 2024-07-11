package oopspkg;
import java.util.Arrays;
public class Postivecount {

	public static void main(String[] args) {
		 int p=0, n=0, z=0;
	
	      int arr[] = {4, 8, -2, 3, -1, 0, 7, 0, -9};
	      int size=arr.length;
	     // System.out.println("Array elements are: "+Arrays.toString(arr));
	      for(int i=0; i < arr.length; i++) {
	         if(arr[i] > 0)
	            p++;
	         else if(arr[i] < 0)
	           n++;
	         else
	            z++;
	      }
           System.out.println("Count of positive numbers  "+p);
	      System.out.println("Count of negative numbers "+n);
	      System.out.println("Count of zeroes  "+z);
	   }
	

	}


