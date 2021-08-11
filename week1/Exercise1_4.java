package week1;
import java.util.Scanner;
public class Exercise1_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a number : ");
			   int n=sc.nextInt();
		       int result=0;
//--------------------------------------------------------//
		// Find digits in given number
		       int temp =n;
		       int noOfDigits=0;
		       int total=0;
		       
		       while(temp>0) {
		    	   temp/=10;
		    	   noOfDigits++;   
		       }
//		       System.out.println(noOfDigits);	 
		       temp=n;
//		       System.out.println(n+" "+temp);
		       while(temp>0){
		    	   result=temp%10; 
//		    	   System.out.println(result+"^"+noOfDigits);
		    	   
		    	   total+=Math.pow(result, noOfDigits);		    	   
		    	   temp/=10;
		    	   
		       }
		      if(total==n) {
		    	  result=1;
		      }
		      else {
		    	  result=0;
		      }
		      System.out.println(result);
		}
	}