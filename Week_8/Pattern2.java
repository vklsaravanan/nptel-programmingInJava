/* Week 8 : Programming Assignment 2

QN :Write a program which will print a pascal  pyramid of  "*" 's of height "l" .
    For example:
    input: 8
    output :
       * 
      * * 
     * * * 
    * * * * 
   * * * * * 
  * * * * * * 
 * * * * * * * 
* * * * * * * * 
 
/*   Answer is given below for --+ NPTEL +--
...............................................................................*/
import java.util.*;
public class Pattern2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int l = inr.nextInt();
        // Add the necessary code in the below space
//__________________________________________________
      
	    int lTemp=l-1;
	    
      for(int i=1; i<=l; i++){ 
		for(int j=0;j<lTemp;j++ ) {
			System.out.print(" ");
		}
		for(int k=1;k<=i; k++) {
			System.out.print("* ");
		}
		lTemp--;
        System.out.println();
      }
        
    }
}
