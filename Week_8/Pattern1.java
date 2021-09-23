/* Week 8 : Programming Assignment 1
QN : Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid.
     For example:
     Input : 5
Output:  

        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
25
    Answer is given below for --+ NPTEL +--
...............................................................................*/
import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	   int n = inr.nextInt();
//____________________________________________________
      
  if(n<=0){
        System.out.print(0);}
      else{
      for(int i=1; i<=n; i++) {
       int k=0;
        for(int j=1; j<=(n-i); j++) {
            System.out.print("  ");
        }
        while(k != (2*i-1)) {
            System.out.print("* ");
            k++;
        }
        System.out.println();}
    System.out.println(n*n);}
    }
}
