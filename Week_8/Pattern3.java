/* Week 8 : Programming Assignment 3

QN : Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.
For example:
input: 5
output: 
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9 
95
     Answer is given below for --+ NPTEL +--
...............................................................................*/

import java.util.*;
public class Pattern3 {
  public static void main(String[] args) {
      Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
        // Add the necessary code in the below space
	   
	    int lTemp=n*2;
	    int total = 0;
	    int lineTemp=n*2;

    for(int line=1; line<=lTemp; line++){ 
    	  
    	  if(line%2==1) {
		for(int j=0;j<lineTemp-2;j++ ) {
			System.out.print(" ");	
		}
		if(line%2==1) {
		for(int k=1;k<=line; k++) { 
			System.out.print(k+" ");
			total+=k;
			 }
		}
        System.out.println();
    	lineTemp-=2;  }
      }
      System.out.println(total);
	}
}


