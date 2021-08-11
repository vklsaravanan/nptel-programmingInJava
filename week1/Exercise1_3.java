package week1;
import java.util.Scanner;

class Exercise1_3 {
	
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int n=10;
	    		   
	       int sum=0;
	       int i=1;
	       int evenNumbers=-2;
	       
	       while(i<=n) {
	    	  evenNumbers=evenNumbers+2;                                                                                                   
	    	 if(sum%3==0) {
	    		 
	    		 sum=sum+evenNumbers;
	    	 }  
	    	   i++;
	       }
	    
	       
	       System.out.print(sum);
	}
}