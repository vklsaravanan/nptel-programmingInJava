/* Week 7 : Programming Assignment 4

QN : The following program reads a string from the keyboard and is stored in the String variable "s1".
     You have to complete the program so that it should should print the number of vowels in s1 .
     If your input data doesn't have any vowel it will print "0".
 
...............................................................................*/
import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
      int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();

/*   Answer is given below for --+ NPTEL +--
...............................................................................*/
			 
    String vowels ="aeiouAEIOU";
    Character tempChar;
	for(int i=0; i<s1.length(); i++){
       	tempChar =s1.charAt(i) ;
  
    for(int j=0; j<vowels.length(); j++){
		char vowelChar =vowels.charAt(j) ;
		if(tempChar.equals(vowelChar)){
		   c+=1;
    }
  }
}
			 
// 		(This will show some presentation error)	 
//...............................................................................
	 System.out.println(c); 
	   }
       catch (Exception e){
		 System.out.println(e);
	    }	   
    }  
} 
