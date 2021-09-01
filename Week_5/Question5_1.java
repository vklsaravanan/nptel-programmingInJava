//Week 5 : Programming Assignment 1

/*QN :An interface Number is defined in the following program.  You have to declare a class A,
      which will implement the interface Number. Note that the method findSqr(n) will 
      return the square of the number n.
      
...............................................................................*/

import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}

/*Answer is given below for --+ NPTEL +--
...............................................................................*/
class A implements Number {
	 public int findSqr(int i){
	   return i*i; 
	  }
	}

//...............................................................................
public class Question5_1{ 
        public static void main (String[] args){ 
	      A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);  
           int i = sc.nextInt();
           System.out.print(a.findSqr(i)); 
    } 
}
