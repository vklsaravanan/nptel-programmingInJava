Week 1 : Programming Assignment 3 

QN : Consider First n even numbers starting from zero(0).Complete the code segment
to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.

................................................................................

import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
   

    // Ans given below
...............................................................................
    
         sum=-2;         
	       int i=1,sumTemp=0;  
         
	       while(i<=n) {   
	    	  sum=sum+2;  
             
	    	 if(sum%3==0) {	 
	    		 sumTemp=sum+sumTemp;  
	    	 }i++;
	    
	       }
	       sum=sumTemp;           

	       System.out.print(sum); 
         
...............................................................................
      



    }
}
