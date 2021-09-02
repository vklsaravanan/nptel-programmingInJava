/* Week 5 : Programming Assignment 2

QN :  This program is to find the GCD (greatest common divisor) of two integers writing 
      a recursive function findGCD(n1,n2). Your function should return -1, 
      if the argument(s) is(are) other than positive number(s). 
      
...............................................................................*/
import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}

/*Answer is given below for --+ NPTEL +--
...............................................................................*/

class B implements GCD{
	  public int findGCD(int p1 ,int p2){
	    if(p1==p2){
	      return(p1);
	    }if(p1==0){
	      	return(p2);
	      }if(p2==0){
	        return(p1);}      
	 return findGCD(p2,p1%p2);
  }
}

//...............................................................................
public class Question5_2{ 
        public static void main (String[] args){ 
	      B a = new B();   //Create an object of class B
            // Read two numbers from the keyboard
            Scanner sc = new Scanner(System.in);  
             int p1 = sc.nextInt();
             int p2 = sc.nextInt();
            System.out.print(a.findGCD(p1,p2)); 
    } 
}
