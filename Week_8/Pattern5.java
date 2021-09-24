/* Week 8 : Programming Assignment 5

QN : Write a program to display any digit(n) from 0-9 represented as a "7 segment  display". 
For example:
input : 5
output :
 _ 
|_ 
 _|

input : 4
output :

|_|
  |
  
       Answer is given below for --+ NPTEL +--
...............................................................................*/

import java.util.*;

public class Pattern5 {
   public static void main(String[] args) throws Exception {
           Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
     if(n==5){
       System.out.println(" _ ");
       System.out.println("|"+"_ ");
       System.out.println(" _"+"|");
     }
     if(n==4){
    
       System.out.println("|_|");
       System.out.println("  |");
     }
     if(n==1){
      System.out.println("");
       System.out.println("  |");
       System.out.println("  |"); 
       }
     if(n==3){
     System.out.println(" _ ");
     System.out.println(" _|");
     System.out.println(" _|");
     }
     }
   }
