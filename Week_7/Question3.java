/* Week 7 : Programming Assignment 3

QN : A byte char array is initialized. You have to enter an index value"n". 
     According to index your program will print the byte and its corresponding char value.
     Complete the code segment to catch the exception in the following, if 
 
...............................................................................*/
import java.util.*;
public class Question3 {  
    public static void main(String[] args) { 
       try{	
	  byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
          Scanner inr = new Scanner(System.in);
	  int n = inr.nextInt();
         
/*   Answer is given below for --+ NPTEL +--
...............................................................................*/
         
   // Used 'String(byte[] bytes, int offset, int length)' Constructor 

    String barrString = new String(barr, n, 1 );
    System.out.print((barr[n])+"\n"+barrString); }
      
//...............................................................................
      catch (Exception e){
	    System.out.println("exception occur");
	    }	   
    }  
}
