 /* Week 7 : Programming Assignment 5
 
QN : A string "s1" is already initialized. You have to read the index "n"  from the keyboard. Complete 
     the code segment to catch the exception in the following, if any. On the occurrence
     of such an exception, your program should print “exception occur ..,
 
...............................................................................*/
import java.util.*;
public class Question5 {  
    public static void main(String[] args) { 
       try{	
	    String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c='a';
 
 /*   Answer is given below for --+ NPTEL +--
...............................................................................*/
 
  byte[] s1Array = s1.getBytes(); //created byte array 
  byte cByte = (byte)c;            //convert char to byte
  s1Array[n]= cByte;               //replace the specified(n) index value
  String result =new String(s1Array);   //convert byte array to string 
  System.out.print(result); }           //print final result   
            
//...............................................................................
catch (Exception e){
          System.out.println("exception occur");
	    }	   
    }  
} 
